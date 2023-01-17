package day12loops;

import java.util.Scanner;

public class C05_Soru {

    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
        ekrana yazdirin.
        */

        Scanner input=new Scanner(System.in);
        System.out.println("baslangic ve bitis degerlerini giriniz : ");
        int baslangic=input.nextInt();
        int bitis=input.nextInt();

        for (int i = baslangic; i <=bitis ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

//        while (baslangic<=bitis){
//            if (baslangic%2==0){
//                System.out.print(baslangic+" ");
//            }
//            baslangic++;
//        }
    }
}
