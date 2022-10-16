package day17_PracticeTests;

import java.util.Scanner;

public class _3_TwoNumbersMathOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        double num1 = scan.nextDouble();
        System.out.println("Enter number2:");
        double num2 = scan.nextDouble();
        System.out.println("Enter math operator (+, -, *, /) :");
        char operator = scan.next().charAt(0);

        while(!(operator=='+' || operator=='-' || operator=='*' || operator=='/')) {
            System.err.println("Invalid operator! Enter a math operator (+, -, *, /)");
            operator = scan.next().charAt(0);
        }

        double result = 0;
        switch (operator) {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }
        System.out.println("Result= " + result);
        scan.close();
    }
}
/*
3. write a program to ask user to enter two number and math operator, and return the result.
if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
*/