package day20_Arrays;

public class _1_Classmates {
    public static void main(String[] args) {
        String[] classmates = {"Ali Demir", "Veli Bakır", "Can Krom", "İrfan Altın"};
        String initials = "AB";


        for (int i = 0; i < classmates.length; i++) {
            String element = classmates[i];
            initials = "" + element.toUpperCase().charAt(0) + element.substring(element.indexOf(" ")).charAt(1);
            System.out.println(initials);
        }

    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */