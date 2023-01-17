package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {

        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kücük ise kullaniciya "Kaybettiniz" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den büyük ise "Kazandiniz" mesaji vererek oyunu devam ettiriniz
         */

        Scanner scan=new Scanner(System.in);

        int num=0;

        do {
            System.out.println("Bir sayi giriniz...");
            num=scan.nextInt();

            if (num>=100){
                System.out.println("Kazandiniz!");
            }
        }while (num>=100);

        System.out.println("Kaybettiniz!");

        // iki curly braces arasinda olusturulan degiskeni sadece orada kullanabiliriz
    }
}
