package day20_Arrays;

public class _2_ReverseClassmates {
    public static void main(String[] args) {
        String[] classmates = {"Ali", "Veli", "Can", "İrfan"};
        String reverse = "";

        for (int i = 0; i < classmates.length; i++) {
            String element = classmates[i];

            for (int j = element.length()-1; j >= 0; j--) {
                reverse += "" + element.charAt(j);
            }

            System.out.println(reverse);
            reverse = "";
        }


    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */