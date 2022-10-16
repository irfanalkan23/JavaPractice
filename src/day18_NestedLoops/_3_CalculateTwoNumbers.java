package day18_NestedLoops;

import java.util.Scanner;

public class _3_CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the first number:");
            double num1 = scan.nextDouble();

            System.out.println("Enter a math operator (+,-,/,*):");
            char op = scan.next().charAt(0);
            while( !(op == '+' || op == '-' || op == '/' || op == '*')) {
                System.out.println("Invalid operator! Enter a math operator (+,-,/,*):");
                op = scan.next().charAt(0);
            }

            System.out.println("Enter the second number:");
            double num2 = scan.nextDouble();

            double result = (op=='+') ? num1+num2 :(op=='-')? num1-num2 :(op=='/')? num1/num2 : num1*num2;
            System.out.println(result);

            System.out.println("Do you want to continue? (yes/no)");
            String cont = scan.next().toLowerCase();
            while( !(cont.equals("yes") || cont.equals("no")) ) {
                System.out.println("Invalid entry. Please re-enter:");
                cont = scan.next().toLowerCase();
            }
            if(cont.equals("no")) {
                break;
            }
        }

        scan.close();
    }
}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */