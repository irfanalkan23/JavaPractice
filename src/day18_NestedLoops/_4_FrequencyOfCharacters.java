package day18_NestedLoops;

import java.util.Scanner;

public class _4_FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();

        int count = 1;
        while (str.length() > 0) {
            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(0) == str.charAt(i)) {
                    count++;
                }
            }
            System.out.print("" + str.charAt(0) + count);
            count =1;
            str = str.replace("" + str.charAt(0), "");
        }

        scan.close();
    }
}
/*
4. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */