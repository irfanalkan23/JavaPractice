package day39_EncapsulationAndInheritancePractice1;

public class FriendlyAnimal extends Animal{

    private static final boolean isWild = false;
    private static final boolean isFriendly = true;
    private static final boolean isPlayable = true;


    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);

    }

    @Override
    public void eat() {
        System.out.println("Friendly " + getName() + " is eating");
    }

    public void play() {
        System.out.println(getName() + " is playing");
    }

    public void pet() {
        System.out.println(getName() + " is petting");
    }

    public String toString() {
        return "FriendlyAnimal{" +
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
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */