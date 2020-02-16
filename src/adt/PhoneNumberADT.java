package adt;

import definition.LinkedList;

public interface PhoneNumberADT {

    String addIntoDB(String number, String name);

    LinkedList<String> getFromDB();

    String getNumber();

}
