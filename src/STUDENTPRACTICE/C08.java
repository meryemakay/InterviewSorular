package STUDENTPRACTICE;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        //strıngı ters cevıren bır java progrmı yazın
        //for loop ve method cagır ı kullnın
        //reverseStrıng =(method adı)

        Scanner scan = new Scanner(System.in);
        System.out.println("bır Strıng metın gırınız");
        String metın = scan.nextLine();
        reverseStr(metın);
        System.out.println("method dan once metın :" + metın);

    }


    private static void reverseStr(String metın) {
        String reverseStr="";
        for (int i = metın.length() - 1; i >= 0; i--) {

            reverseStr += metın.charAt(i);

        }


        System.out.println(reverseStr);

    }
}