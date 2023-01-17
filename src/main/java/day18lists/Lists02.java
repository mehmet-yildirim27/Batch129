package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lists02 {

    public static void main(String[] args) {


        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 9, 11, 35] ==> 12, 11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(9);
        nums.add(11);

        Collections.sort(nums);

        int minDiff = nums.get(1) - nums.get(0);

        for(int i=1; i<nums.size(); i++){
            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);

        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }

        // Verilen bir Listteki elemanlari tekrarsiz olarak yazdirma
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println("a = " + a);  //a = [2, 3, 2, 2, 5]

        List<Integer> yeniList = new ArrayList<>();
        //[2, 3, 2, 2, 5]
        for (Integer w : a) {
            if(!yeniList.contains(w)){
                yeniList.add(w);
            }
        }
        System.out.println("yeniList = " + yeniList);

        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
        //gosteren kodu yaziniz.
        //Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input= new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        System.out.println("c = " + c);//c = [A, K, R, S]
        String urun ="";

        do {
            System.out.println("Lutfen istediginiz urunun harfini giriniz");
            urun= input.next().substring(0,1);

            if(c.contains(urun)){
                c.set(c.indexOf(urun),"Ayrildi");

            }else if(!urun.equals("Q")){
                c.add(urun);
            }
            System.out.println(c);

        }while (!urun.equals("Q"));

        //Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
        //              [12, 19, 15, 30, 21]  ==>  19 ve 21
        List<Integer> aList = new ArrayList<>();
        aList.add(12);
        aList.add(19);
        aList.add(15);
        aList.add(30);
        aList.add(21);
        System.out.println(a);//[12, 19, 15, 30, 21]
        Collections.sort(a);
        System.out.println("a = " + a);//a = [12, 15, 19, 21, 30]

        int minFark = Integer.MAX_VALUE;//default deger olarak max.sayiyi atadim ki
        // iki sayiyi karsilastirdiginda her halukarda listede ki sayi secilsin diye

        for (int i = 1; i < a.size(); i++) {
            minFark = Math.min(minFark, a.get(i) - a.get(i - 1));
        }
        System.out.println(minFark);


    }
}
