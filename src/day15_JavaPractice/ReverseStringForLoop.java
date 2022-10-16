package day15_JavaPractice;

public class ReverseStringForLoop {
    public static void main(String[] args) {

        String str = "Java";
        String strRev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            strRev += "" + str.charAt(i);
        }
        System.out.println("strRev = " + strRev);
    }
}
/*
Write a program that can reverse any given string
			String str = "Java"; ==> avaJ
		 //			      0123
 */