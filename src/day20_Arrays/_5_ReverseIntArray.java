package day20_Arrays;

import java.util.Arrays;

public class _5_ReverseIntArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length-1-i] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));
    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */