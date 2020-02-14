package definition;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {

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


}
