package day14_PracticeTests;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        if(word.startsWith("x")) {
            System.out.println(word.substring(1));
        }
        scan.close();
    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */