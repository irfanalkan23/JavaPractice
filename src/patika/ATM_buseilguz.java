package patika;

import java.util.Scanner;

public class ATM_buseilguz {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String userName,password;
        boolean loginSuccess=false;
        int right=3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = scn.nextLine();
            System.out.print("Parolanız : ");
            password = scn.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scn.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = scn.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            int price1 = scn.nextInt();
                            if (price1 > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price1;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                    }


                }while (select == 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
        scn.close();
    }}