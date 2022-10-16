package day11_PracticeTests;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "tall";
        double price = 0.0;
        int calories = 0;

        if (size == "tall" || size == "grande" || size == "venti") {
            if(size == "tall") {
                price = 3.69;
                calories = 90;
            } else if(size == "grande") {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;
            }
            System.out.println("price is $" + price + "\n" + calories + " calories");
        } else {
            System.out.println("Invalid Size");
        }

        System.out.println("----------------------------------------------");

        String size2 = "tall";

        switch (size2) {
            case "tall":
                System.out.println("price is $3.69\n90 calories");
                break;
            case "grande":
                System.out.println("price is $3.99\n120 calories");
                break;
            default:
                System.out.println("price is $4.29\n150 calories");
                break;
        }

    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */