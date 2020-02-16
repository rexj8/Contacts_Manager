package adt;

import java.sql.SQLException;
import java.util.ArrayList;

public interface NameADT {

    String addIntoDB(String name) throws SQLException;

    void delFromDB(String name);

    ArrayList getFromDB();

}
