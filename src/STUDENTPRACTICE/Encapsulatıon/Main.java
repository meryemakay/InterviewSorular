package STUDENTPRACTICE.Encapsulatıon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("kac tane kayıt gıreceksınız?");
        int kayıtAdedı = scan.nextInt();
        List<User> kullanıcılist = new ArrayList<User>();

        int userId = 999;
        for (int i = 0; i < kayıtAdedı; i++) {


            User user = new User();
            userId++;
            System.out.print("usernme");
            String username = scan.next();


            String password;
            while (true) {
                System.out.println("password gırınız");
                password = scan.next();
                boolean isCorect = user.setPassword(password);

                if (isCorect) break;
                else System.out.println("6 kaarkterden uzun olmalıdır");


            }
            boolean isActive=rnd.nextBoolean();

            boolean isSignedin=rnd.nextBoolean();

            User yeniKullanıcı = new User(userId, username,password,isActive,isSignedin);
       kullanıcılist.add(yeniKullanıcı);


        }
        for (int i=0; i<kullanıcılist.size();i++){
            System.out.println("ID " + kullanıcılist.get(i).getId()+ "Username" + kullanıcılist.get(i).getUsername()+
                   "password "+ kullanıcılist.get(i).getPassword() + "isActıve " +kullanıcılist.get(i).isActive() +
                    "ısSıgnedın "+ kullanıcılist.get(i).isSignedin());
            System.out.println();
        }
    }
}