package day39_EncapsulationAndInheritancePractice1;

public class Tiger extends WildAnimal {

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println("Wild " + getName() + " is hunting with teeth");
    }
}
/*
5. Create the following sub classes of WildAnimal and Override the hunt method,
and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile
 */