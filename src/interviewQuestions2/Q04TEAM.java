package interviewQuestions2;

import java.util.Scanner;

public class Q04TEAM {

     /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan alınan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
     public static void main(String[] args) {



         girilenSayiyaKadarOlanMukemmeller();
     }

    private static void girilenSayiyaKadarOlanMukemmeller() {
         Scanner scan = new Scanner(System.in);
        System.out.println("bır sayı girizn");
         int girilenSayi=scan.nextInt();

int toplam=0;
        for (int i = 1; i <girilenSayi ; i++) {
            for (int j = 1; j < i; j++) {


                if(i%j==0){

                toplam +=j;
            }


        }
        if(toplam==i){
            System.out.println(i + " mukemmel sayıdır");
        }else{
            System.out.println(i+ " mukemmel degıldır");
        }
        toplam=0;

        }
    }


}
