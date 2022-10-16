package day21_ArraysUtility_ForEachLoop;

public class NumberOfJavaPython {
    public static void main(String[] args) {
        String[] sentence = {"java", "python", "c++", "c#", "python", "python", "java"};

        int countJava = 0;
        int countPython = 0;
        for (String s : sentence) {
            if(s.equalsIgnoreCase("java")) {
                countJava++;
            }
            if(s.equalsIgnoreCase("python")) {
                countPython++;
            }
        }

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);


    }
}
/*
	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */