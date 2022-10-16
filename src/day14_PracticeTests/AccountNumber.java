package day14_PracticeTests;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an account number:");
        String account = scan.next();

        boolean isValid = (account.startsWith("2") && account.length() == 7)
                        || (account.startsWith("5") && account.length() == 10);
        if(isValid) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid account number");
        }
        scan.close();
    }
}
/*
6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */