package practice.static_vs_StaticFinal;

public class Static_vs_StaticFinal_Test {

    public static void main(String[] args) {

        System.out.println(StaticFinalPI.PI);

//        System.out.println(FinalPI.PI);   // --> gives compile error!

    }
}

class FinalPI {

    public final double PI = 3.14;

    public FinalPI() {
    }

}

class StaticFinalPI {

    public static final double PI = 3.14;

    public StaticFinalPI() {
    }

}