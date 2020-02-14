package adt;

public interface EncADT {
    String MD5(String pswrd);

    String SHA1(String pswrd);

    String ceaserCypherEncode(String pswrd);

    String ceaserCypherDecode(String cypherText);
}
