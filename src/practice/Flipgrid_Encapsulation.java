package practice;

public class Flipgrid_Encapsulation {
    private String name;
    private final double PI;

    public Flipgrid_Encapsulation(double pi) {
        PI = pi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double pi){
//        this.PI = pi;     // compile error!
    }
}
