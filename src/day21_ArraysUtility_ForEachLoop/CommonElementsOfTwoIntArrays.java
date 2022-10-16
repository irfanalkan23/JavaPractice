package day21_ArraysUtility_ForEachLoop;

public class CommonElementsOfTwoIntArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,4,5};
        int[] arr2 = {4,5,6,7,8};
        String common = "";

        for (int i : arr1) {
            for (int j : arr2) {
                if(common.contains("" + i)) {
                    continue;
                }
                if(i == j) {
                    common += i + " ";
                }
            }
        }

        System.out.println("common = " + common);
    }
}
/*
	3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

          MUST use for each loops
*/