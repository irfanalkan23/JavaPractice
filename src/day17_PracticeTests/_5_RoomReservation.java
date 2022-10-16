package day17_PracticeTests;

import java.util.Scanner;

public class _5_RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? (yes/no)");
        String reserve = scan.nextLine();
        String room = "";
        int price = 0;

        while (!(reserve.equalsIgnoreCase("yes") || reserve.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry! Enter yes or no:");
            reserve = scan.nextLine();
        }

        if (reserve.equalsIgnoreCase("yes")) {
            System.out.println("Which type of room do you want to reserve?" +
                    "\n\tKing Bed (120$)" +
                    "\n\tQueen Bed (100$)" +
                    "\n\tSingle Bed (80$)");
            room = scan.nextLine();
            while (!(room.equalsIgnoreCase("king bed")
                    || room.equalsIgnoreCase("queen bed")
                    || room.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid room name! Please enter room name:");
                room = scan.nextLine();
            }
            price = (room.equalsIgnoreCase("king bed")) ? 120 : (room.equalsIgnoreCase("queen bed")) ? 100 : 80;
            System.out.println("Selected room: " + room + ", price: " + price + "$");
        } else {
            System.out.println("have a nice day");
        }
        scan.close();
    }
}
/*
5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
                    King Bed ==> 120$
                    Queen Bed ==> 100$
                    single Bed ==> 80$
            the program should be able to display the room he/she reserved and total price of the room.
            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */