package practice.ConstructorsShortQuiz;

public class Test2 {

    public Test2() {
        System.out.println("A ");
    }

    public Test2(int a) {
        this();           // line 1
        System.out.println("B ");
    }

    public Test2(String str) {
        this();            // line 2
//        this(100);      // line 3
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();    // line 4
    }


}
/*
Q: What will be the result?										a
  compilation fails at line 3 --> correct answer
  compilation fails at line 2
  compilation fails at line 2 and line 3
  A
  compilation fails at line 4
  compilation fails at line 1 and line 2
  A B Hello

 */