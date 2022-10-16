package day15_JavaPractice;

import java.util.Scanner;

public class DigitsLettersCharsFromString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String letters = "";
        String digits = "";
        String special = "";

        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                letters += "" + str.charAt(i);
            } else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digits += "" + str.charAt(i);
            } else {
                special += "" + str.charAt(i);
            }
        }

        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special: " + special);

        scan.close();
    }
}
/*
    5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */