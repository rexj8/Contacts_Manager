package main;

import definition.LinkedList;
import definition.Login;
import definition.Name;
import definition.PhoneNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Login lgn = new Login();
        Name nm = new Name();
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedListName = new LinkedList<String>();
        LinkedList<String> linkedListNumber = new LinkedList<String>();

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
            linkedListName = nm.getFromDB();
            linkedListNumber = phoneNumber.getFromDB();

            int i = 0;
            while (i < linkedListName.size) {
                System.out.println(linkedListName.get(i) + "   " + linkedListNumber.get(i));
                i++;
            }
            System.out.println("\n Total Contacts :-" + linkedListName.size);
        } else if (inpMENU == 2) {
            System.out.println("Enter a NAME :-");
            String name = sc.next();
            nm.addIntoDB(name);

            System.out.println("Enter Number :-");
            String number = sc.next();
            phoneNumber.addIntoDB(number);
        } else if (inpMENU == 3) {
            System.out.println("Enter contact name which you have to REMOVE :-");
            String name = sc.next();
        } else if (inpMENU == 4) {

        } else if (inpMENU == 5) {
            System.exit(0);
        }
        }



//        }

//    }

}
