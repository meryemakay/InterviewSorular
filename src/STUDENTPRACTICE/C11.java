package STUDENTPRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
/*
bır ogretmenden gırmek ıstedıgı kadar notu alınız ve
ortalamayı gecen ogrencı sayısını bulan code create edınız
not 0 ıle 100 arasında olmalı
not gırısını bıtırmk ıcın X e basılsın
yanlıs gırdı olması ıhtımalıne karsılık try-catch kullnınız
 */

        List<Integer> ogrenciNotları = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        int ogrencısayac = 1;
        while (true) {
            System.out.println("bıtırmke ıcın X e basınz");
            System.out.println("ogrncının notunu gırınız");
            int ogrNot = 0;

            try {
                ogrNot = scan.nextInt();
                if (ogrNot < 0 || ogrNot > 100) {
                    System.out.println("ogrencı notu 0-100 arasında olmalı");
                } else {
                    ogrenciNotları.add(ogrNot);
                    ogrencısayac++;
                }
            } catch (Exception e) {
                String str = scan.next();
                if (str.equalsIgnoreCase("X")) break;

                else
                    System.out.println("hatalı gırıs yaptınuz.tekrar deneyınz");
            }
        }
        double toplam = 0;
        for (int i = 0; i < ogrenciNotları.size(); i++) {
            toplam += ogrenciNotları.get(i);
        }
        double ortalama = toplam / ogrenciNotları.size();

        int ortalamaUstuOgrencıSayısı = 0;
        for (int i = 0; i < ogrenciNotları.size(); i++) {
            if (ogrenciNotları.get(i) > ortalama) {
                ortalamaUstuOgrencıSayısı++;
            }
        }

        System.out.println("genel ortalama :" + ortalama);
        System.out.println("ortalama ustu ogrncı sayısı :" + ortalamaUstuOgrencıSayısı);
    }
}
