package day16_PracticeTests;

public class CatDog {
    public static void main(String[] args) {

//        String sentence = "caT dog dogG cAt";
//        sentence = sentence.toLowerCase();
//        int cat = 0;
//        int dog = 0;
//        for (int i = 0; i < sentence.length(); i++) {
//            if(sentence.contains("cat")) {
//                cat++;
//                sentence = sentence.replaceFirst("cat", "");
//            }
//            if(sentence.contains("dog")) {
//                dog++;
//                sentence = sentence.replaceFirst("dog", "");
//            }
//        }
//        System.out.println(cat == dog);

        float f1=5, f3, f4, f5=2;
        float f2=2.5f;
//        float f1 = 5/2.5;
        f4 = 5/2.5f;
        f4 = f1/f5;     //2.5

        double d4 = 1/3;    // suffix not necessary
        d4 = 1/3.0;         // 0.333333333
        d4 = 1/3;           // 0.0
        d4 = 1/3d;          // 0.33333333333
        d4 = (double) 1/3;  // 0.3333333333
        System.out.println("d4 = " + d4);

        int a =5;
//        byte b = a;

        int num =-5;
        System.out.println(num=0);
        boolean one = false && false;
        System.out.println(one);

    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */