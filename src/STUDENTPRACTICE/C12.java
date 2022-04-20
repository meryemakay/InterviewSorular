package STUDENTPRACTICE;

import java.util.ArrayList;
import java.util.List;

public class C12 {
    static List<Long> sayilar = new ArrayList<>();
    public static void main(String[] args) {

/* Belirli bir dize (bölünmüş ve bir boyuta göre gruplanmış) ardışık artan sayılar kümesi içerecekse true  ,
    aksi takdirde return false döndürecek bir işlev yazın .

    Örnekler
    ascending("123124125") ➞ true
// Contains a set of consecutive ascending numbers
// if grouped into 3's : 123, 124, 125

    ascending("101112131415") ➞ true
// Contains a set of consecutive ascending numbers
// if grouped into 2's : 10, 11, 12, 13, 14, 15

    ascending("32332432536") ➞ false
// Regardless of the grouping size, the numbers can't be consecutive.

    ascending("326325324323") ➞ false
// Though the numbers (if grouped into 3's) are consecutive but descending.

    ascending("666667") ➞ true
// Consecutive numbers: 666 and 667.*/

        /*

        Özetle kod, kendine verilen sayının
         while dongusu ile önce 1'er, sonra 2'şer, sonra 3'erli
          4'erli (sayının orijinal basamak sayısının uzunlugunun
          yarısı adedine kadar) ardışık olup olmadığına bir method
           içerisinde bakıyor. Long kullanmama ragmen en buyuk sayı
            en fazla 4er gruplu olarak bakabiliyor.
         */

        long orijinalSayi = 35343332;
        long sayi = orijinalSayi;
        String str = String.valueOf(sayi);

        int grup = 1;

        boolean ardisikMi = false;
        while (grup <= str.length()/2) {
            while (sayi > 0) {
                long songrup = (long) (sayi % (Math.pow(10, grup)));
                sayi = (long) (sayi / Math.pow(10, grup));
                sayilar.add(songrup);
            }
            ardisikMi = ardisikSiraliBul(sayilar, grup);
            if (ardisikMi) break;
            else {
                sayi = orijinalSayi;
                sayilar.clear();
                grup++;
            }
        }
        if(!ardisikMi) System.out.println("Ardisik sirali degil");
    }

    public static boolean ardisikSiraliBul(List<Long> sayilar, int group) {

        boolean ascendingArdisikMi = false;
        boolean descendingArdisikMi = false;
        for (int i = 0; i < sayilar.size() - 1; i++) {
            if (sayilar.get(i) - 1 == sayilar.get(i + 1)) {
                ascendingArdisikMi = true;
            } else {
                ascendingArdisikMi = false;
                break;
            }
        }

        for (int i = 0; i < sayilar.size() - 1; i++) {
            if (sayilar.get(i) + 1 == sayilar.get(i + 1)) {
                descendingArdisikMi = true;
            } else {
                descendingArdisikMi = false;
                break;
            }
        }

        if (ascendingArdisikMi) {
            System.out.println("Artan sirada " + group + " 'li grup halinde siralanmistir.");
            for (int i = 0; i < sayilar.size(); i++) {
                System.out.print(sayilar.get(sayilar.size() - i - 1) + ".");
            }
            System.out.println();
        }
        if (descendingArdisikMi) {
            System.out.println("Azalan sirada " + group + " 'li grup halinde siralanmistir.");
            for (int i = 0; i < sayilar.size(); i++) {
                System.out.print(sayilar.get(sayilar.size() - i - 1) + ".");
            }
            System.out.println();
        }
        if (ascendingArdisikMi || descendingArdisikMi) {
            return true;
        } else
            return false;
    }
}



