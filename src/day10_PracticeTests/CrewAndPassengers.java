package day10_PracticeTests;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number = 111;
        int crew, passengers;
        if(number == 50 || number == 75 || number == 100) {
            if(number == 50) {
                crew = 20;
                passengers = 30;
            } else if(number == 75) {
                crew = 25;
                passengers = 50;
            } else {
                crew = 30;
                passengers = 70;
            }
            System.out.println(crew + " crew, " + passengers + " passengers");
        } else {
            System.out.println("Invalid number of people");
        }
    }
}
/*
2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */