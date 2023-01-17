package day14arraysforeachloop;

import java.util.*;

public class Soru {

    public static void main(String[] args) {

        /*
                Rastgele kullanici adi olusturan JAVA kodu yaziniz.
               1. Kullanicidan ismini isteyelim
               2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
               3. Kullanici adinin alinabilir olup olmadigina bakalim.
               4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
               5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        Scanner input=new Scanner(System.in);
        List<String> names=new ArrayList<>();

        do {
            System.out.println("lutfen isminizi giriniz...");
            String name= input.nextLine().toUpperCase().trim();

            if (!(names.contains(name))){
                names.add(name);
            } else if (names.contains(name)) {
                System.out.println("Bu username database'de var, tekrar kullanilamaz");
                int random=(int)Math.random()*100;
                names.add(name+random);
            }
        }while(true);

    }
}
