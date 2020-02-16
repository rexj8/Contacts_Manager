package definition;

import adt.PhoneNumberADT;

import java.sql.*;
import java.util.ArrayList;

public class PhoneNumber implements PhoneNumberADT {

    String number;
    ArrayList arrayList = new ArrayList();

    @Override
    public String addIntoDB(String number) {
        return null;
    }

    @Override
    public void delFromDB(String number) {

    }

    @Override
    public ArrayList getFromDB() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts_Manager?autoReconnect=true&useSSL=false", "root", "root");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM CONTACTS;");

            while (rs.next()) {
                number = rs.getString("phnno");
                arrayList.add(number);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return arrayList;
    }

    public String getNumber() {
        number = "";

        return number;
    }
}
