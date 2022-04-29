package interviewQuestions8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarlı eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
List<Integer> sayilar = new ArrayList<>();

sayilar.add(1);
sayilar.add(3);
sayilar.add(1);
sayilar.add(2);
sayilar.add(4);
sayilar.add(5);
sayilar.add(3);

int tekrarliElamanSayisi=0;

Set<Integer> uniqEleman=new HashSet<>();

List<Integer>tekrarliElemanlar=new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {
boolean eklıMı=uniqEleman.add(sayilar.get(i)); // eklı olma durumu unıq elemnlarda var olmasıdır

if(!eklıMı){//unıqe elenlara eklenmedıyse bu elemn dublıcate dır
    tekrarliElamanSayisi++; // bur durumda duplıcate sayısı 1 artar
    tekrarliElemanlar.add(sayilar.get(i));//duplıcate olan elemn  tekrralıelemnlar lıstesın eklenır


            
        }
            
        }
        System.out.println("sayı  " +  tekrarliElamanSayisi);
        System.out.println("lıste" + tekrarliElemanlar);
    }
}
