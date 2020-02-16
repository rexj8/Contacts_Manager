package adt;

import java.util.ArrayList;

public interface PhoneNumberADT {

    String addIntoDB(String number);

    void delFromDB(String number);

    ArrayList getFromDB();

    String getNumber();

}
