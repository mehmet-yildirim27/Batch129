package practise.advancedpractise.practise06;

import java.util.Random;
import java.util.Scanner;

public class Q03_RastgeleSifreOlusturma {

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız sayı kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Lütfen bir sayi giriniz");
//        int sayi= scan.nextInt();
//        int sayac=0;
//        String sifre="";
//
//
//           do {
//               Random random=new Random();
//               int randomSayi= random.nextInt(123);
//               boolean harfMi=(randomSayi>64 && randomSayi<91) || (randomSayi>96 && randomSayi<123);
//               boolean rakamMi=(randomSayi>-1 && randomSayi<10);
//
//               if (harfMi){
//                   sifre +=(char)randomSayi;
//                   sayac++;
//               } else if (rakamMi) {
//                   sifre +=randomSayi;
//                   sayac++;
//               }else {
//                   continue;
//               }
//           }while(!(sayi==sayac));
//
//        System.out.println(sifre);

        Scanner input = new Scanner(System.in);
        System.out.println("Karakter sayısını giriniz");
        int karakterSayisi = input.nextInt();
        int sayac = 0;
        String sifre="";

        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex = karakterler.length();


        while (sayac < karakterSayisi){

            int rastgeleIndeks = (int)(Math.random()*maxIndex);
            sifre += karakterler.charAt(rastgeleIndeks);
            sayac++;

        }

        System.out.println("sifre = " + sifre);

    }
}
