package definition;

import adt.NameADT;

import java.sql.*;

public class Name implements NameADT {

    String name;
    LinkedList<String> linkedList = new LinkedList<>();

    @Override
    public String addIntoDB(String name) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts_manager?autoReconnect=true&useSSL=false", "root", "root");
            String qry = "INSERT INTO CONTACTS(NAME,PHNNO) VALUES(?,?);";
            PreparedStatement pstmt = con.prepareStatement(qry);

            pstmt.setString(1, name);
            pstmt.setString(2, null);
            pstmt.executeUpdate();
            this.name = name;

//            System.out.println("               Successfully Added!!");

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Name that you have entered is already exist");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
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
