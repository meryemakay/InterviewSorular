package STUDENTPRACTICE;

import java.util.Arrays;

public class C04 {
    public static void main(String[] args) {

        //Print the words ending with "y" or "Y"
        // (Make code case-insensitive)

        String input ="Learn jAvA, hOneY caney and earn money.";

        input = input.toLowerCase();

        input= input.replaceAll("\\p{Punct}",""); //Learn java and earn money

        String arr[] = input.split(" ");

        System.out.println(Arrays.toString(arr));

        String x ="";
        x = "honey";
        x= "honey caney";
        x="honey caney money";


        System.out.print(" 'y' veya 'Y' ile biten kelimeler: ");
        for (int i=0; i <arr.length ; i++) {
            if(arr[i].endsWith("y")){
                x+=arr[i]+" ";
            }
        }

        System.out.print(x);


    }
}
