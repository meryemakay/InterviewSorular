package STUDENTPRACTICE;

import java.util.Arrays;

public class C10 {
    public static void main(String[] args) {
        /*
        int [][] sayılar={{2,3,5},{3,5},{6,7,8,9},{10,11,12}};
        yukarıdakı gıbı verılen bır arry ın her bır ınner arry dekı toplmları
        farklı bır arry e atayn bıt method create edınız
         */
        int [][] sayılar={{2,3,5},{3,5},{6,7,8,9},{10,11,12}};
        toplamlar(sayılar);

    }

    private static void toplamlar(int[][] sayılar) {
        int toplamlar[]=new int[sayılar.length];
        for (int i=0; i<toplamlar.length;i++){
            for (int j=0; j<sayılar[i].length; j++){
                toplamlar[i]+=sayılar[i][j];
            }
        }

        System.out.println(Arrays.toString(toplamlar));
    }
}
