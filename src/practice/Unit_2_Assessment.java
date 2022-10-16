package practice;

public class Unit_2_Assessment {

    public static void main(String[] args) {

        String str = "The whole time it was raining.";

        do{
            System.out.print(str.charAt(0));
            str = str.substring(3);

        } while (!str.isEmpty());

    }
}
