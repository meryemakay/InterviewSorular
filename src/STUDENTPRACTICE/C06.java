package STUDENTPRACTICE;

import java.util.Arrays;

public class C06 {
    public static void main(String[] args) {
        //1)Get string from user and type code to find the number of words in a String.
        //2)Count how many words starts with "a".(Make code case-sensitive)


        String s = "  merhaba güzel dünya nasılsınız  ";

        int kelimeSayisi = 0;

        s = s.trim();

        String arr[] = s.split(" ");

        System.out.println(Arrays.toString(arr));

        kelimeSayisi = arr.length;


        System.out.println("Cümlede " + kelimeSayisi + " adet kelime vardır");


    }//main method sonu
}