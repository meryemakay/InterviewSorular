package STUDENTPRACTICE;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {
/*
kullanıcıdan bılgılerını alınız (sıfre ve ısım)
eger dogru gırdıyse hesabınızdasınız desın
3 kere dogru gırme hakkı olsun
3 kere yapamzsa hesabınız kılıtlndı desın
 */

        Scanner scan = new Scanner(System.in);
      int hatalıGırıs=0;


        do {
            System.out.println("kullanıcı adınızı gırınız");
            String name = scan.nextLine();
            System.out.println("sıfrenızı gırınız");
            String password = scan.nextLine();

if(password.equals("pwd123")&& name.equals("admin")){
    System.out.println("bılgılerınız dogrudur *hosgeldınız*");
    break;
}else
    System.out.println("yanlıs gırınız lutfen tekrar deneyın");
hatalıGırıs++;
            System.out.println("kalan hak :" +(3-hatalıGırıs));


        if (hatalıGırıs ==3){
            System.out.println("hakkınız bıttı hesabınız bloke oldu");
        }
}while (hatalıGırıs<3);

    }
}