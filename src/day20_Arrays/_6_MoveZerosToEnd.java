package day20_Arrays;

import java.util.Arrays;

public class _6_MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                for (int j = i; j < array.length-1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */