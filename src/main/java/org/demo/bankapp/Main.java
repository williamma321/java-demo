package org.demo.bankapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cont = "5";
        while(!cont.equals("4")){
            System.out.print("************Welcome to Demo Bank App*****************\n\n");
            System.out.print("********  Please type in the follow selection *******\n\n");
            System.out.print("           1.  For account balance - Enter - 1       \n");
            System.out.print("           2.  To  deposit         - Enter - 2       \n");
            System.out.print("           3.  To  withdraw        - Enter - 3       \n");
            System.out.print("        To Exit the application    - Enter - 4       \n\n");
            System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
            System.out.print(" Please enter your selection (1, 2, 3, 4) -->");
            cont = input.nextLine();
            switch (cont) {
                case "1" -> {
                    System.out.println(" Showing Bank account balance information");
                    System.out.println(" Need to implement the method and actions for showing account balance");
                }
                case "2" -> {
                    System.out.println(" Will enter deposit amount ");
                    System.out.println(" Need to implement the deposit amount ");
                }
                case "3" -> {
                    System.out.println(" Will enter withdraw amount ");
                    System.out.println(" Need to implement the withdraw amount ");
                }
                case "4" -> {
                    System.out.println(" Thank you for using the bank demo app, exiting. ");
                }
                default -> System.out.println(" Please enter a valid input:  (1) or (2) or (3) or (4) only  ");
            }

        }
    }
}