package practice.ConstructorsShortQuiz;

public class Test1 {

    public Test1() {        // line 1
        System.out.println("A ");
//        this(10);         // line 2
    }

    public Test1(int a) {
        System.out.println("B ");   // line 3
    }

    public static void main(String[] args) {
        Test1 obj = new Test1();    // line 4
    }
}
/*
What will be the result?

  compilation fails at line 1
  compilation fails at line 3
  A B
  compilation fails at line 2 --> correct answer
  compilation fails at line 4
 */