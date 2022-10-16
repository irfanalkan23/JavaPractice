package day43_Abstraction_Intro;

public final class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0) {
            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
/*
				Square:
					area(): s * s
					perimeter: 4 * s
 */