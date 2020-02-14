package main;

import definition.Login;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Login lgn = new Login();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("_______________Contacts_Manager_______________\n");
        System.out.println("================");
        System.out.println("   LOGIN MENU   ");
        System.out.println("================");

        System.out.println("Enter Login ID");
        String lgnID = sc.nextLine().toLowerCase();
        System.out.println("Enter Login Password :-");
        String lgnPswrd = sc.nextLine();

        if (lgn.checkID(lgnID) && lgn.checkPswrd(lgnPswrd)) {
            System.out.println("                      Welcome Sir!");

        }

    }

}
