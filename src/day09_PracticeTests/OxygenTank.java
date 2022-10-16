package day09_PracticeTests;

public class OxygenTank {
    public static void main(String[] args) {

        int oxygenLevel = 60;
        String message = "";

        if(oxygenLevel >= 90) {
            message = "Your tank is full";
        } else if (oxygenLevel >= 80 && oxygenLevel < 90) {
            message = "Still okay";
        } else if (oxygenLevel >= 70 && oxygenLevel < 80) {
            message = "Don't go too far";
        } else if (oxygenLevel >= 60 && oxygenLevel < 70) {
            message = "Start to head back";
        } else if (oxygenLevel >= 50 && oxygenLevel < 60) {
            message = "Be careful now you are at 50%";
        }

        System.out.println("Above " + oxygenLevel + " - " + message);
    }
}
/*
Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you are at 50%

                USE ONE PRINT STATEMENT ONLY
 */