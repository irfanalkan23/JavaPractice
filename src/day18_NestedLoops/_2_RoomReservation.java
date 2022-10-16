package day18_NestedLoops;

import java.util.Scanner;

public class _2_RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalPrice = 0;

        while(true) {
            System.out.println("Which bedroom does he/she wants to reserve?" +
                    "\n\tKing Bed ==> 120$" +
                    "\n\tQueen Bed ==> 100$" +
                    "\n\tSingle Bed ==> 80$");
            String room = scan.nextLine().toLowerCase();
            while( !(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed")) ) {
                System.out.println("Invalid entry! Please re-enter:");
                room = scan.nextLine().toLowerCase();
            }

            System.out.println("How many nights are you staying?");
            int nights = scan.nextInt();
            while( !( nights > 0) ) {
                System.out.println("Invalid entry! Please re-enter:");
                nights = scan.nextInt();
            }

            totalPrice += nights * ( (room.equals("king bed")) ? 120 : (room.equals("queen bed")) ? 100 : 80 );

            System.out.println("Would you like to reserve another room? (Yes/No)");
            String another = scan.next().toLowerCase();
            while ( !(another.equals("yes") || another.equals("no")) ) {
                System.out.println("Invalid entry! Please re-enter:");
                another = scan.next().toLowerCase();
            }
            if(another.equals("no")) {
                break;
            }
        }

        System.out.println("Total price: $" + totalPrice);

        scan.close();
    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */