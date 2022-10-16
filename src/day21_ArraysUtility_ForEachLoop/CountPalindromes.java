package day21_ArraysUtility_ForEachLoop;

public class CountPalindromes {
    public static void main(String[] args) {
        String[] strArray = {"anna", "level", "Java"};

        int count = 0;

        for (String s : strArray) {
            String element = s;
            String reverse = "";
            for (int i = element.length()-1; i >= 0; i--) {
                reverse += element.charAt(i);
            }
            if(element.equalsIgnoreCase(reverse)) {
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
/*
    4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */