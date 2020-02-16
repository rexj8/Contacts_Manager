package adt;

import java.util.ArrayList;

public interface NameADT {

    String addIntoDB(String name);

    void delFromDB(String name);

    ArrayList getFromDB();

}
