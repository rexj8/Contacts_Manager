package adt;

import definition.LinkedList;

public interface PhoneNumberADT {

    String addIntoDB(String number);

    LinkedList<String> getFromDB();

    String getNumber();

}
