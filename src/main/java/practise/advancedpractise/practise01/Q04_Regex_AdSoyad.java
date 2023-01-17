package practise.advancedpractise.practise01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {

    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

    public static void main(String[] args) {

        // 1. way substring() ile elde edilen yöntem dinamik olmaz
        // Mesela bosluklar nerede, birden jazla bosluk var mi vs ise yaramaz bu yöntem

        // [^a-zA-Z ] ==> harf ve bosluk haricinde herseyi sildik
        // türkce karakter kullansa idik [^a-zA-Z ü] gibi harfleriburaya eklemeliydik
        // "\\s+"," " ==> birden fazla boslugu sadece bir bosluk ile degistirir

        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadinizi arada bir bosluk olacak sekilde giriniz.");
        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);
        String ad = adSoyad.split(" ")[0];
        String soyAd = adSoyad.split(" ")[1];
        String adIlkHarf = ad.substring(0,1).toUpperCase();
        String soyadIlkHarf = soyAd.substring(0,1).toUpperCase();

        String adFormat = adIlkHarf+ad.substring(1);
        String soyadFormat = soyadIlkHarf+soyAd.substring(1);

        System.out.println("Ad: "+adFormat);
        System.out.println("Soyad: "+soyadFormat);

    }
}
