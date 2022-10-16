package day14_PracticeTests;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        if(word.endsWith("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }
        scan.close();
    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */