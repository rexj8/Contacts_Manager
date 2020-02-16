package adt;

import java.sql.SQLException;

public interface NameADT {

    String addIntoDB(String name) throws SQLException;

    void delFromDB(String name);

    String getFromDB(String name);

}
