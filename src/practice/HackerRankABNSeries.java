package practice;

import java.util.Scanner;

public class HackerRankABNSeries {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double element = a;

            for (int j = 0; j < n; j++) {

                for (int k = 0; k <= j; k++) {
                    element += Math.pow(2, k)*b;
                }
                System.out.print((int) element);
                if(j<n-1) {
                    System.out.print(" ");
                }

                element = a;
            }

            System.out.println();
        }

        in.close();
    }
}
