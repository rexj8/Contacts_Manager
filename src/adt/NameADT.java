package adt;

import definition.LinkedList;

public interface NameADT {

    String addIntoDB(String name);

    void delFromDB(String name);

    LinkedList<String> getFromDB();

    String getName();

}
