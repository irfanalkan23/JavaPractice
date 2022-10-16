package day10_PracticeTests;

public class Grade {
    public static void main(String[] args) {

        char grade = 'G';
        String message = "";
        if(grade >= 'A' && grade <= 'F') {
            if(grade == 'A') {
                message = "excellent";
            } else if(grade == 'B') {
                message = "great job";
            } else if(grade == 'C') {
                message = "good";
            } else if(grade == 'D') {
                message = "passed";
            } else {
                message = "failed";
            }
        } else {
            message = "Invalid";
        }
        System.out.println(message);
    }
}
/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */