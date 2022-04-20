package interviewQuestions1;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
/*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("bır strıng gırınız");
        String str=scan.nextLine();

        //splıt
        String arr[]=str.split(""); //her bır karakterı ayırır
        System.out.println(Arrays.toString(arr));
         //sort
        Arrays.sort(arr); //sıralar
        System.out.println(Arrays.toString(arr));

        //sayac olustur
int counter=0;

for (int i=1; i<arr.length; i++){  //i=0 yazsaydık ındeks hatası alırdk.
    if(arr[i-1].equals(arr[i])){   //0.eleman 1.elemana esıt mı/i=0 deseydık ındeks hatası alırdık
                                    // 0-1  1-2   2-3  seklınde karsılasırack
        counter++;

    }else{
        System.out.println(arr[i-1]+ " sayısı " +(counter+1));
counter=0;

    }
if(i==arr.length-1){ //en sona geldıgınde
    System.out.println(arr[i-1]+ " sayısı " +(counter+1));
}


}
/*String[] array = new String[str.length()];
array = str.split("");
for (c = 'a'; c <= 'z'; c++) {
    count = 0;
    for (int i = 0; i < array.length; i++) {
        if (c == array[i].charAt(0)) {
            count++;
        }
    }
    if (count != 0) {
        System.out.println(c + " ==== " + count);*/
    }
}






