package day39_EncapsulationAndInheritancePractice1;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("A", "Husky", 'M', 4, "L", "Black");

        dog1.bark();

        System.out.println(dog1);

        Lion lion1 = new Lion("B", "Tibet", 'F', 7, "M", "White");

        lion1.hunt();

        System.out.println(lion1);

    }
}
