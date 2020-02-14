package definition;

import adt.EncADT;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption implements EncADT {

    /*
     * This method takes String password and convert it into it's hash form
     *
     * @param String password
     * @return It returns encrypted form of password
     */
    public static String MD5(String pswrd) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(pswrd.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException();
        }

    }

    public static String SHA1(String pswrd) {

        try {

            MessageDigest md = MessageDigest.getInstance("SHA1");
            byte[] result = md.digest(pswrd.getBytes());
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < result.length; i++) {
                sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException();
        }
    }

    public static String ceaserCypherEncode(String pswrd) {
        char[] temparr = pswrd.toCharArray();

        for (int i = 0; i < pswrd.length(); i++) {
            if ((int) pswrd.charAt(i) >= 65 && (int) pswrd.charAt(i) < 90) {
                temparr[i] = (char) (((int) pswrd.charAt(i)) + 1);
            } else if ((int) pswrd.charAt(i) >= 97 && (int) pswrd.charAt(i) < 122) {
                temparr[i] = (char) (((int) pswrd.charAt(i)) + 1);
            } else if ((int) pswrd.charAt(i) == 90) temparr[i] = 'A';

            else if ((int) pswrd.charAt(i) == 122) temparr[i] = 'a';
        }
        String cypherText = new String(temparr);

        return cypherText;
    }

    public static String ceaserCypherDecode(String cypherText) {
        char[] temparr = cypherText.toCharArray();

        for (int i = 0; i < cypherText.length(); i++) {
            if ((int) cypherText.charAt(i) > 65 && (int) cypherText.charAt(i) <= 90) {
                temparr[i] = (char) (((int) cypherText.charAt(i)) - 1);
            } else if ((int) cypherText.charAt(i) > 97 && (int) cypherText.charAt(i) <= 122) {
                temparr[i] = (char) (((int) cypherText.charAt(i)) - 1);
            } else if ((int) cypherText.charAt(i) == 65) temparr[i] = 'Z';

            else if ((int) cypherText.charAt(i) == 97) temparr[i] = 'z';
        }
        String pswd = new String(temparr);

        return pswd;
    }

}
