package org.demo.bankapp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner action_input = new Scanner(System.in);
        Scanner de_amount_input = new Scanner(System.in);
        Scanner withdraw_amount = new Scanner(System.in);
        BankAccounts currentBankAcc = new BankAccounts(0);
        ScreenMenu current_ScreenMenu = new ScreenMenu();
        String numeric_formating = "%-100.2f";
        String action_Selection = "5";
        while(!action_Selection.equals("4")){
            if (currentBankAcc.Account_Balance == 0 ) {
                System.out.print(current_ScreenMenu.menu_text + current_ScreenMenu.menu_text2);
            } else {
                System.out.print(current_ScreenMenu.menu_text);
                System.out.print("   Current Balance is Now:  $");
                System.out.printf(numeric_formating,currentBankAcc.Account_Balance);
                System.out.println( "\n" );
                System.out.print(current_ScreenMenu.menu_text2);
            }
            action_Selection = action_input.nextLine();
            switch (action_Selection) {
                case "1" -> {
                    System.out.println(" Showing Bank account balance information");
                    String myBalance = String.valueOf(currentBankAcc.Account_Balance);
                    System.out.print(" Your Balance is now -->  $");
                    System.out.printf( numeric_formating, currentBankAcc.Account_Balance);
                    System.out.println();
                }
                case "2" -> {
                    String user_Deposit_Amount = "";
                    double f_user_depositAmt = 0;
                    System.out.print(" Please enter deposit amount -->$");
                    user_Deposit_Amount = de_amount_input.nextLine();
                    try {
                        f_user_depositAmt = Double.parseDouble(user_Deposit_Amount);
                    } catch (NumberFormatException e) {
                        System.out.println(" Please enter a correct number value!!");
                        f_user_depositAmt = 0;
                    }
                    if ( f_user_depositAmt > 0) {
                        currentBankAcc.deposit(f_user_depositAmt);
                        System.out.print(" Deposited Amount of " );
                        System.out.printf(numeric_formating, f_user_depositAmt);
                        System.out.println();
                        System.out.print(" The account balance is now -- >  $");
                        System.out.printf(numeric_formating, currentBankAcc.Account_Balance);
                        System.out.println();
                    }else {
                        System.out.println(" Please enter a number more than $0 !!");
                    }

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