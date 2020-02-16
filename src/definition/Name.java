package definition;

import adt.NameADT;

import java.sql.*;
import java.util.ArrayList;

public class Name implements NameADT {

    String name;
    ArrayList arrayList = new ArrayList();

    @Override
    public String addIntoDB(String name) {


        return null;
    }

    @Override
    public void delFromDB(String name) {

    }

    @Override
    public ArrayList getFromDB() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts_Manager?autoReconnect=true&useSSL=false", "root", "root");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM CONTACTS;");
            System.out.println();
            long phnno;
            while (rs.next()) {
                name = rs.getString("name");
                arrayList.add(name);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return arrayList;
    }
}
