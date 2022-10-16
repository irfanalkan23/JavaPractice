package practice;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int greatest;

        if(number1 > number2 && number1 > number3) {
            greatest = number1;
        } else if(number2 > number3) {
            greatest = number2;
        } else {
            greatest = number3;
        }
        System.out.println("greatest = " + greatest);


    }
}
/*
Question of the week:  Write a program which calculates the greatest number among the 3 numbers given by the user

        Ex: a=10 b=20 c=30

        output will be 30
 */