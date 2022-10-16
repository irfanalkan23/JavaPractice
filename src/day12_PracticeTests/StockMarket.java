package day12_PracticeTests;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalValue = 0;
        String company = "";

        System.out.println("How many total shares they have already?");
        int shares = scan.nextInt();
        if(shares > 0) {
            System.out.println("What is the total value of your shares in the stock market?");
            totalValue = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter the name of the company you have the most shares in:");
            company = scan.nextLine();
        } else {
            System.out.println("You don't have enough shares.");
        }

        System.out.println("Your total stock market holding is $" + totalValue + " which is made up of " + shares + " shares. " + company + " is your company holdings");
        scan.close();
    }
}
/*
7. StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */