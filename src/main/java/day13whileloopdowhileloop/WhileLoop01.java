package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        // Example 1: Kullanicini verdigi sayi icin carpim tablosunu olusturun
        // 3 ==> 3*1=3   3*2=6 3*3=9 ...... 3*10=30

        Scanner input=new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz... : ");
        double num=input.nextDouble();
        int i=1;

        while (i<11){
            System.out.println(num+ " x " + i+" = "+(num*i));
            i++;
        }

        // Example 2: Verilen bir String'deki her harfin sonrasina "*" sembolunu ekleyiniz
        // Java=J*a*v*a*

        System.out.println("Bir kelime giriniz : ");
        String word=input.next();
        int k=0;
        String newWord="";

        while (k<word.length()){
          newWord +=word.charAt(k)+"*";
          k++;
        }
        System.out.println(newWord);

        // Example 3: Verilen bir tam sayinin rakamlari toplamini consol'e yazdiran kodu yaziniz
        // Aslinda rakamlar toplami en iyi while ile cözülür. Day 12'de cözdük

        int num1=-578;
        num1=Math.abs(num1);

        String stringNum1=String.valueOf(num1);
        int sum=0;

        for (int j = num1; j > 0; j /=10) {
            sum +=num1%10;
            num1 /=10;
        }
        System.out.println(sum);
    }
}
