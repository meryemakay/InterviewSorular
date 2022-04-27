package interviewQuestions1;

import java.util.Scanner;

public class C01P {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("bir sayi giriniz :");
        int girilensayi = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i < girilensayi; i++) { //girilen sayiya kadar olan sayilara bakar
            for (int j = 1; j < i; j++) { //burada bolenler kontrol ediliyor

                if (i % j == 0) {  //sayinin herhangi bir boleni varsa(j-> bolen)

                    toplam = toplam + j; //bolenleri toplama ekliyor
                }

            }
            if (toplam == i) {

                System.out.println(i + " mukemmel sayidir");
            }
            toplam = 0;

        }
    }
}