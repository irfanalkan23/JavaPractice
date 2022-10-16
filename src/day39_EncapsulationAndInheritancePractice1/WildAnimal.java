package day39_EncapsulationAndInheritancePractice1;

public class WildAnimal extends Animal{

    private static final boolean isWild = true;
    private static final boolean isFriendly = false;
    private static final boolean isPlayable = false;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt() {
        System.out.println(getName() + " is hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */