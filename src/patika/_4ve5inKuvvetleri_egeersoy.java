package patika;

import java.util.Scanner;

public class _4ve5inKuvvetleri_egeersoy {

    public static void main(String[] args) {

        int sayi;
        int toplam = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 1 ; i<=sayi ; i *=4){

            if (i!=1){
                System.out.println("4'ün kuvvetleri: " + i);}
        }
        for (int i = 1 ; i<=sayi ; i *=5){
            if (i!=1){
                System.out.println("5'in kuvvetleri: " + i);}
        }

        scanner.close();
    }
}
