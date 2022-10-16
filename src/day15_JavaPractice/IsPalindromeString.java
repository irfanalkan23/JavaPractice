package day15_JavaPractice;

import java.util.Scanner;

public class IsPalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        boolean isPalindrome = false;

        for (int i = 0; i <= str.length()/2; i++) {
            if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(str.length()-1-i)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("palindrome = " + isPalindrome);
        scan.close();
    }
}
/*
	8. Write a program that can check if the given String is palindrome
			Ex:
				input:
					Level
				output:
					true

				input:
					Anna
				output:
					true
 */