package day11_PracticeTests;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Your Browser Name to See if it is Eligible");
        String valid = "";
        String nameOfBrowser = "firefox";
        boolean validation = nameOfBrowser == "firefox" || nameOfBrowser == "chrome" || nameOfBrowser == "opera" || nameOfBrowser == "edge" ||
                nameOfBrowser == "safari";
        if (validation) {

            if (nameOfBrowser == "firefox") {
                valid = "Firefox is valid";
            } else if (nameOfBrowser == "chrome") {
                valid = "Chrome is valid";
            } else if (nameOfBrowser == "opera") {
                valid = "Opera is valid";
            } else if (nameOfBrowser == "edge") {
                valid = "Edge is valid";
            } else {
                valid = "Safari is valid";
            }
        } else {
            valid = "Invalid Browser";
        }

        System.out.println(valid);
        input.close();
    }
}