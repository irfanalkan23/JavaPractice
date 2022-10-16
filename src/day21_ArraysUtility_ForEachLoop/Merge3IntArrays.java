package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class Merge3IntArrays {
    public static void main(String[] args) {
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] merged = new int[arr1.length + arr2.length + arr3.length];

        int i = 0;
        for (int each : arr1) {
            merged[i++] = each;
        }
        for (int each : arr2) {
            merged[i++] = each;
        }
        for (int each : arr3) {
            merged[i++] = each;
        }

        System.out.println(Arrays.toString(merged));

    }
}
/*
    5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */