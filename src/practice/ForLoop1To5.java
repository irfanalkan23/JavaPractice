package practice;

public class ForLoop1To5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            if(i<5) {
                System.out.print(",");
            }
        }
    }
}
