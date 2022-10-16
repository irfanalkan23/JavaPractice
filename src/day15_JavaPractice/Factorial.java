package day15_JavaPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("factorial = " + factorial);
        scan.close();
    }
}
/*
4. Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120
                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */