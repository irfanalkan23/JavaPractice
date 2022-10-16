package day43_Abstraction_Intro;

public class ShapeObjects {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 5);
        Square square = new Square(4);
        Circle circle = new Circle(2);

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);


    }
}
