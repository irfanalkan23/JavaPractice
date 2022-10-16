package day11_PracticeTests;

public class CydeoBatches {
    public static void main(String[] args) {

        String batchType = "EU";

        if(batchType == "US morning" || batchType == "US evening" || batchType == "EU") {
            if(batchType == "US morning") {
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            } else if(batchType == "US evening") {
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            } else {
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
            }
        } else {
            System.out.println("Invalid Batch");
        }

        System.out.println("-------------------------------");

        String batchType2 = "a";

        switch (batchType2) {
            case "US morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "US evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;
            case "EU":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                break;
            default:
                System.out.println("Invalid Batch");
        }
    }
}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */