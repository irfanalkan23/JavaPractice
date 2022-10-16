package day13_PracticeTests;

import java.util.Scanner;

public class LastThreeChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scan.nextLine();
        if(s.isEmpty()) {               // should be isBlank() ???
            System.out.println("string is empty");
        } else if(s.length() > 3) {
            System.out.println(s.substring(s.length()-3));
        } else {
            System.out.println(s);
        }
        scan.close();
    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty       // should be isBlank() ???
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */