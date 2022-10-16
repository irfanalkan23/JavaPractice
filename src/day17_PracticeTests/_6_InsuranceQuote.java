package day17_PracticeTests;

import java.util.Scanner;

public class _6_InsuranceQuote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.println("Enter your gender (M / F):");
        String gender = "" + scan.next().charAt(0);
        while (!(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F"))) {
            System.out.println("Invalid entry! Enter your gender (M / F)");
            gender = "" + scan.next().charAt(0);
        }

        System.out.println("Are you married? (Yes/No)");
        String isMarried = scan.next().toLowerCase();
        while ( !(isMarried.equals("yes") || isMarried.equals("no")) ) {
            System.out.println("Invalid entry! Are you married? (Yes/No)");
            isMarried = scan.next().toLowerCase();
        }

        System.out.println("Enter your age:");
        int age = scan.nextInt();
        while (age<0 || age>120) {
            System.out.println("Invalid entry! Re-enter your age (0-120):");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int miles = scan.nextInt();
        while (miles<5) {
            System.out.println("Invalid entry! Please re-enter (>5):");
            miles = scan.nextInt();
        }

        System.out.println("Do you want full coverage or liability insurance? (Full / Liability)");
        scan.nextLine();
        String insurance = scan.nextLine().toLowerCase();
        while ( !(insurance.equals("full") || insurance.equals("liability")) ) {
            System.out.println("Invalid entry! (Full / Liability)");
            insurance = scan.nextLine();
        }

        System.out.println("Did you have any accidents or claims in past 5 years (Yes/No)");
        String accident = scan.next().toLowerCase();
        while ( !(accident.equals("yes") || accident.equals("no")) ) {
            System.out.println("Invalid entry! (Yes/No)");
            accident = scan.next();
        }

        System.out.println("Does your car has an anti-theft device (Yes/No)");
        String antiTheft = scan.next().toLowerCase();
        while ( !(antiTheft.equals("yes") || antiTheft.equals("no")) ) {
            System.out.println("Invalid entry! (Yes/No)");
            antiTheft = scan.next();
        }

        double price = 0.0;
        if(insurance.equalsIgnoreCase("L")) {
            price = (age<25) ? 90 : 50;
            price += (miles<=10) ? 10 : (miles<=50) ? 30 : 50;
        } else {
            price = (miles<=10) ? 10 : (miles>10 && miles<=50) ? 30 : 50;
            price += (miles<=10) ? 20 : (miles<=50) ? 40 : 70;
        }

        price *= (antiTheft.equals("yes")) ? 0.95 : 1;
        price *= (accident.equals("yes")) ? 1.15 : 0.90;
        price *= (isMarried.equals("yes")) ? 0.95 : 1;

        System.out.println("Your insurance cost is: " + price);
        scan.close();
    }
}
/*
6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

 */