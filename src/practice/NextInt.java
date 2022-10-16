package practice;

import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = 0;
        while (!scan.hasNextInt()) {
                System.err.println("Invalid entry! Enter an integer:");
                scan.nextLine();
        }
        number = scan.nextInt();
        System.out.println("You entered: " + number);
    }
}
