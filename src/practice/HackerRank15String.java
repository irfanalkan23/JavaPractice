package practice;

import java.util.Scanner;

public class HackerRank15String {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

            System.out.printf("%-15s", s1);
            System.out.printf("%03d\n", x);
        }
        System.out.println("================================");
    }

}
/*
printf(%[argument_index$][flags][width][.precision]conversion)
() içindeki terimlerin anlamları şöyledir:
% Dönüşümü başlatan simge
[] Bu parantezlerin içleri isteğe bağlıdır. Gerekli ise yazılır.
argument_index$ Değişken_damgası, değişken değeri için yer tutucu; değişkenin çıktıda nereye konuşlanacağını
belirtir.
2
Flags Bayraklar: - , ^ , 0 , #
conversion : d,o,x,f,g,a,c,s,b,h,n harfleri dönüşümün ne olacağını belirler. Dönüşümlerin
tanımları aşağıdaki listede verilmiştir.

'd': decimal integer (10 tabanlı tamsayı)
'o': octal integer (8 tabanlı tamsayı)
'x': hexadecimal integer (16 tabanlı tamsayı)
'f': decimal notation for float (kesirli sayı göster)
'g': scientific notation (with an exponent) for float (kesirli sayıyı üstel göster)
'a': hexadecimal with an exponent for float (16 tabanlı sayıyı üstel göster)
'c': for a character (karakter göster)
's': for a string. (stringe dönüştür)
'b': for a boolean value, so its output is "true" or "false". (mantıksal değere dönüştür)
'h': output the hashcode of the argument in hexadecimal form. ((hash kodunu hex olarak göster)
'n': "%n" has the same effect as "\n". (satırbaşı yap)

flags:
'-' 	left-justified 					(sola dayalı yaz)
'^' 	and uppercase 				(Büyük harfle yaz)
'+' 	output a sign for numerical values. 		(pozitif/negatif işareti koy)
'0' 	forces numerical values to be zero-padded. 	(nakışın hanelerini doldur)

 */