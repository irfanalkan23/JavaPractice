package day15_JavaPractice;

import java.util.Scanner;

public class SumDigitsFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += str.charAt(i) - 48;
            }
        }
        System.out.println("sum = " + sum);
        scan.close();
    }
}
/*
    6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3
                 output:    6
             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */