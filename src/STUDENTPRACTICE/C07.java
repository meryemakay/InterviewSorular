package STUDENTPRACTICE;

import java.util.ArrayList;
import java.util.List;

public class C07 {
    public static void main(String[] args) {

        //iki arr yı bır arr ye ekeleyen method yazınız
        //ınput1={0,1,2,3,4,5} input2={6,7,8,9,10}
        //output ={0,1,2,3,4,5,6,7,8,9,10}

        int arr1[]={0,1,2,3,4,5};
        int arr2[]={6,7,8,9,10};

        List<Integer> list = new ArrayList<>();


        for(int i=0; i<arr1.length; i++){
            list.add(arr1[i]);

        }

        for(int i=0; i<arr2.length; i++){
            list.add(arr2[i]);


        }
        System.out.println(list);
    }
}
