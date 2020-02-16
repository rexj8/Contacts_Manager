package definition;

import adt.NameADT;

import java.sql.*;

public class Name implements NameADT {

    String name;
    LinkedList<String> linkedList = new LinkedList<>();

    @Override
    public String addIntoDB(String name) {


        return null;
    }

    @Override
    public void delFromDB(String name) {

    }

    @Override
    public LinkedList<String> getFromDB() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts_Manager?autoReconnect=true&useSSL=false", "root", "root");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM CONTACTS;");

            while (rs.next()) {
                name = rs.getString("name");
                linkedList.add(name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return linkedList;
    }

    public String getName() {
        name = "";

        return name;
    }
}
