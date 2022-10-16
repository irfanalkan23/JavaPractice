package day19_RecapLoops;

public class FirstDuplicatedChar {
    public static void main(String[] args) {
        String str = "abcdd";
        String result = "";
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            for (int i = j + 1; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                    System.out.println(ch);
                    break;
                }
            }

        }

        if (count == 0) {
            System.out.println("There is no duplicated character!");
            System.exit(0);
        }

    }
}
/*
Tasks: 1
	1. Write a program that can return the first duplicated character from a string
	2. Write a program that cna return the index number of the first duplicated character from a string
	3. Write a program that can display all the characters that appeared twice in the string.
	4. Write a program that can return the index number of the first unique character.
 */