package day43_Abstraction_Intro;

public final class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0) {
            throw new RuntimeException("Invalid length: " + length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0) {
            throw new RuntimeException("Invalid width: " + width);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}
/*
	Create the following subclasses of Shape and add the aditional features that are needed:

				Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)
 */