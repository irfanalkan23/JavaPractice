package day14_PracticeTests;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        // cemalpolat'ın çözümü:
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your e-mail address:");
        String email = scan.next();

        String fName = email.substring(0,email.indexOf("_"));
        String lName= email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        String a = fName.substring(0,1);
        String a1 = a.toUpperCase();

        String b = lName.substring(0,1);
        String b1 = b.toUpperCase();

        String firstName = a1 + fName.substring(1,fName.length());
        String lastName = b1 + lName.substring(1,lName.length());

        System.out.println("First name: " + firstName + "\nLast name: " +lastName + "\nDomain: " + domain);

        scan.close();
    }
}
