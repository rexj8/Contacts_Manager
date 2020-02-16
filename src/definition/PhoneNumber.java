package definition;

import adt.PhoneNumberADT;

import java.sql.*;

public class PhoneNumber implements PhoneNumberADT {

    String number;
    LinkedList<String> linkedList = new LinkedList<>();

    @Override
    public String addIntoDB(String number) {
        Name nm = new Name();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts_manager?autoReconnect=true&useSSL=false", "root", "root");
            String qry = "UPDATE CONTACTS SET PHNNO = ? WHERE NAME=" + nm.name + ";";
            PreparedStatement pstmt = con.prepareStatement(qry);

            pstmt.setString(1, number);
            pstmt.executeUpdate();

            System.out.println("               Successfully Added!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void delFromDB(String number) {

    }

    @Override
    public LinkedList<String> getFromDB() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts_Manager?autoReconnect=true&useSSL=false", "root", "root");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM CONTACTS;");

            while (rs.next()) {
                number = rs.getString("phnno");
                linkedList.add(number);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return linkedList;
    }

    public String getNumber() {
        number = "";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts_Manager?autoReconnect=true&useSSL=false", "root", "root");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM CONTACTS;");

            while (rs.next()) {
                number = rs.getString("phnno");
                linkedList.add(number);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return number;
    }
}
