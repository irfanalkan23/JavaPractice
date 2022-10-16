package day21_ArraysUtility_ForEachLoop;

public class CountEvenAndOddNumbers {
    public static void main(String[] args) {

        int[] array = {2,5,7,1,0,4};

        int even = 0;
        int odd = 0;

        for (int i : array) {
            if(i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("even = " + even);
        System.out.println("odd = " + odd);


    }
}
/*
	2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */