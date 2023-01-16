package day03scanner;

import java.util.Scanner;

public class Scanner07 {

    public static void main(String[] args) {

        // kullanicidan alinan degerlerle asagidaki sekli olusturunuz

        /*
                A
               A A
              A A A
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz: ");
        String harf=scan.next();

        System.out.println("  "+harf+"\n"+" "+harf+" "+harf+"\n"+harf+" "+harf+" "+harf);

        /*
        2: YOL

         Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz ");
        char ch= input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);
         */

        // 3. YOL (tab tusu ile)

    }
}
