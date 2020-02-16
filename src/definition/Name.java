package definition;

import adt.NameADT;

import java.sql.*;

public class Name implements NameADT {

    String name;

    @Override
    public String addIntoDB(String name) {


        return null;
    }

    @Override
    public void delFromDB(String name) {

    }

    @Override
    public String getFromDB(String name) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms?autoReconnect=true&useSSL=false", "root", "root");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM CONTACTS");

            long phnno;
            while (rs.next()) {
                name = rs.getString("name");
                phnno = rs.getLong("phnno");

                System.out.println(name + " " + phnno);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
