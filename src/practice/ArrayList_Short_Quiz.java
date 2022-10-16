package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Short_Quiz {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Integer a = 1;
        list1.remove(1);
        System.out.println(list1);

        ArrayList<Integer> list = new ArrayList<>();
        Integer b = 1;
        System.out.println(list.remove(b));

        System.out.println("----------------------------");

        Integer[] arr2 = {1, 2};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        arr2 = list2.toArray(arr2);
        System.out.println(Arrays.toString(arr2));

        String [] arr3 = {"a", "b"};
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr3));
        arr3 = list3.toArray(arr3);
        System.out.println(Arrays.toString(arr3));
    }


}
