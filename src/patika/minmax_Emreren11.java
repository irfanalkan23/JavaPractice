package patika;

import java.util.Scanner;

public class minmax_Emreren11 {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int n,min=0,max=0,number;

        System.out.print("Kaç tane sayı gireceksiniz? ");
        n=inp.nextInt();

        for (int i=1; i<=n; i++)
        {
            System.out.print(i+". sayıyı giriniz: ");
            number=inp.nextInt();

            if(i==1) // İlk girilen sayıyı min e atıyoruz yoksa min değeri hep 0 olur
                min=number;

            if(number>max)
                max=number;

            if (number<min)
                min=number;
        }
        System.out.println("Girilen sayılardan en büyüğü: "+max);
        System.out.println("Girilen sayılardan en küçüğü: "+min);

        inp.close();
    }
}
