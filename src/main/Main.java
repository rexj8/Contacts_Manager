package main;

import definition.Login;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Login lgn = new Login();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Login ID");
        String lgnID = sc.nextLine();
        System.out.println("Enter Login Password :-");
        String lgnPSWRD = sc.nextLine();

        if (lgn.checkID(lgnID)) {

        }

    }

}
