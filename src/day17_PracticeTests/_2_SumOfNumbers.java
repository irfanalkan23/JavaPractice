package day17_PracticeTests;

import java.util.Scanner;

public class _2_SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers to find the sum. \nEnter a negative number to exit and find the sum:");

        double number = scan.nextDouble();
        double sum = 0;
        while (number>=0) {
            sum += number;
            number =scan.nextDouble();
        }
        System.out.println("sum = " + sum);
        scan.close();
    }
}
/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop
 */