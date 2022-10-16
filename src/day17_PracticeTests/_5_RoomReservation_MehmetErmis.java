package day17_PracticeTests;

import java.util.Scanner;

public class _5_RoomReservation_MehmetErmis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String answer = scan.nextLine();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Do you want to reserve a room?");
            answer = scan.nextLine();
        }

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Which type of room do you want to reserve? King Bed / Queen Bed / Single Bed");
            String roomType = scan.nextLine();
            while (!(roomType.equalsIgnoreCase("King Bed") || roomType.equalsIgnoreCase("Queen Bed") || roomType.equalsIgnoreCase("Single Bed"))) {
                System.err.println("Invalid entry, please re-enter");
                System.out.println("Which type of room do you want to reserve? King Bed / Queen Bed / Single Bed");
                roomType = scan.nextLine();
            }
            if (roomType.equalsIgnoreCase("King Bed")) {
                System.out.println("King Bed ==> $" + 120);
            } else if (roomType.equalsIgnoreCase("Queen Bed")) {
                System.out.println("Queen Bed ==> $" + 100);
            } else if (roomType.equalsIgnoreCase("Single Bed")) {
                System.out.println("Single Bed ==> $" + 80);
            }

        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day!");
        }
        scan.close();
    }
}
