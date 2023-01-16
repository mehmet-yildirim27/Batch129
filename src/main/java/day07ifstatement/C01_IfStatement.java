package day07ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    // sayiyi kullanicidan almadigimda 4 tane sari vardi.
    //Yani 4 tane gereksiz is yaptin diyordu (yani sayi büyük mü kücük mü belli zaten)
    // ayni sey sayi icin de gecerli idi
    // kullanicidan alinca gereksiz islemler sifirlandi

    public static void main(String[] args) {

        // Example 1. verilen harf büyük harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen harf giriniz :");
        char ch=scan.next().charAt(0);

        // Regex replaceAall() metodunda kullanilir
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf" );
        }

        if (Character.isUpperCase(ch)){     // 2. yöntem
            System.out.println("Buyuk Harf" );
        }

        // Example 2. verilen sayi cift sayi ise ekrana cift sayi yazdiran kod

        System.out.println("Lutfen sayi giriniz :");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println(sayi+" cift sayidir");
        }

        // Example 3. verilen sayi 300'den kücük veya 1200'den byüyük ise
        // ekrana "Harika Sayi" yaudiran kod

        int sayi1=1500;

        if (sayi1<300 || sayi1>1200){
            System.out.println("Harika Sayi");
        }

        // Example 4. kullanicidan alinan bir sayinin tek mi, cift mi oldugunu
        // yazdiran kod

        int sayi2=12;

        if (sayi2%2==0){
            System.out.println(sayi2+" cift sayi");
        }else {
            System.out.println(sayi2+" tek sayi");
        }

        // Example 5. Bir sayi negatif mi, pozitif mi, nötr mü

        int sayi3=15;

        if (sayi3==0){
            System.out.println(sayi+" sayisi notrdur");
        } else if (sayi3<0) {
            System.out.println(sayi3+ " negatif sayidir");
        }else {
            System.out.println(sayi3+" pozitif bir sayidir");
        }
    }
}
