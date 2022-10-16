package practice;

import java.util.ArrayList;

public class PIWorks_Task {
    public static void main(String[] args) {
        returnOdds(10,100);
    }

    public static void returnOdds(int min_value, int max_value){
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = min_value; i <= max_value; i++) {
            if (i % 2 == 1){
                odds.add(i);
            }
        }
        System.out.println(odds);
    }
}
