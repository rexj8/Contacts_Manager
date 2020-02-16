package main;

import definition.Login;
import definition.Name;
import definition.PhoneNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Login lgn = new Login();
        Name nm = new Name();
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner sc = new Scanner(System.in);
        ArrayList arrayListName = new ArrayList<String>();
        ArrayList arrayListNumber = new ArrayList<String>();

//        System.out.println();
//        System.out.println("_______________Contacts_Manager_______________\n");
//        System.out.println("================");
//        System.out.println("   LOGIN MENU   ");
//        System.out.println("================");
//
//        System.out.println("Enter Login ID");
//        String lgnID = sc.nextLine().toLowerCase();
//        System.out.println("Enter Login Password :-");
//        String lgnPswrd = sc.nextLine();
//
//        if (lgn.checkID(lgnID) && lgn.checkPswrd(lgnPswrd)) {
        System.out.println("                        Welcome Sir!");

//            while (true) {
        System.out.println("\n===============");
        System.out.println("   MAIN MENU   ");
        System.out.println("===============");
        System.out.println("1. SHOW Contacts list");
        System.out.println("2. ADD Contacts");
        System.out.println("3. REMOVE Contacts");
        System.out.println("4. Search Contacts");
        System.out.println("5. EXIT");

        int inpMENU = sc.nextInt();

        if (inpMENU == 1) {
            arrayListName = nm.getFromDB();
            arrayListNumber = phoneNumber.getFromDB();

            int i = 0;
            while (i < arrayListName.size()) {
                System.out.println(arrayListName.get(i) + "   " + arrayListNumber.get(i));
                i++;
            }
        } else if (inpMENU == 4) {

        }

//            }

//        }

    }

}
