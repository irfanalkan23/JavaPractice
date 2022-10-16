package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class IntArrayDescending {
    public static void main(String[] args) {

        int[] array = {2,5,7,1,0,4};
        int[] reverse = new int[array.length];
        Arrays.sort(array);

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }

        System.out.println(Arrays.toString(reverse));
    }
}
/*
	1. Write a program that sort the array of integer in descending order
 */