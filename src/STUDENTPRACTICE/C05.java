package STUDENTPRACTICE;

import java.util.Arrays;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {


        //Find the vowels in a String by using arrays. / kullancııdan alınan stringde geçen sesli harfleri bulup
        // Print them on the console                   / sout ediniz
        // a e i o u

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen string giriniz: ");
        String kullaniciGirisi = scanner.nextLine();

        String arr[] = kullaniciGirisi.split("");

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if (
                    arr[i].equalsIgnoreCase("a") ||
                            arr[i].equalsIgnoreCase("e") ||
                            arr[i].equalsIgnoreCase("i") ||
                            arr[i].equalsIgnoreCase("o") ||
                            arr[i].equalsIgnoreCase("u")
            ) {
                System.out.print(arr[i] + " ");
            }

        }//for loop

    }
}