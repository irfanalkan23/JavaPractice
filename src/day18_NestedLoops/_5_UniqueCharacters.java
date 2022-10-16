package day18_NestedLoops;

public class _5_UniqueCharacters {
    public static void main(String[] args) {
        String str = "dfdkkkkdhfeohfds1";
        String unique = "";


        while(str.length() > 0) {
            String temp = str.replace("" + str.charAt(0), "");
            if(str.length() - temp.length() == 1) {
                unique += str.charAt(0);
            }
            str = temp;
        }
        System.out.println(unique);
    }
}
/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output: bdf

Hint: if you find out how to find the frequency of one character,
then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */