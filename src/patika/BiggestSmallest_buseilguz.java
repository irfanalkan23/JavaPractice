package patika;

import java.util.Scanner;

public class BiggestSmallest_buseilguz {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Kaç adet sayý gireceksiniz.");
        int n=scn.nextInt();
        int biggest=0;
        int smallest=0;
        //girilecek sayý adedi kadar giriþ yapýlmasý için döngü oluþturuldu.
        for(int i=1;i<=n;i++) {
            System.out.println(i+". sayýyý giriniz.");
            int number =scn.nextInt();

            if(number<smallest||smallest==0) {
                smallest=number;
            }
            if(number>biggest)
                biggest=number;
        }

        System.out.println("En Büyük Sayý : "+biggest);
        System.out.println("En Küçük Sayý : "+smallest);

        scn.close();
    }
}
