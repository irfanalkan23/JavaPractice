package day19_RecapLoops;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hourlyRate = 0;
        int weeklyHours = 0;

        while(true) {
            System.out.println("How much you make an hour?");
            hourlyRate = scan.nextInt();
            if(hourlyRate <= 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            weeklyHours = scan.nextInt();
            if(weeklyHours < 1 || weeklyHours > 144) {

            }
        }
    }
}
/*
	5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message
					"Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message
					"Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message
					"Invalid Entry for state tax Rate"

			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */