package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {

    public static void main(String[] args) {

        //Java da her karakterin sayisal bir degeri vardir.
        //Bu degerler ASCII Deger'ler olarak adlandirilir.
        //Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir.

        //Herhangi bir character'in ASCII degerini bulmak icin o karakteri "int" data type'inda bir variable'in icine koyunuz.
            int ch = 'A';
            System.out.println(ch);

            int unlem = '!';
            System.out.println(unlem);

            char c1 = 'K';
            char c2 = '?';
            //Java'da char'lari matematiksel islemlerde kullanirsaniz, Java o char'larin ASCII degerlerini kullanir.
            System.out.println(c1 + c2);// 138

        // Bir tamsayi ile bir harfi toplayiniz
        int deger = 20;
        char harf = 'a';

        //1.Yol
        int sum =deger+harf;//20+97
        System.out.println("Bir tamsayi ile harfin toplami = "+sum);//117

        //2.Yol
        System.out.println("2.Yol Toplam "+(deger+harf));//117

        char rakam1='1';
        System.out.println("rakam1 = " + rakam1);//1

        char rakam2= '2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3='3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4='4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println(" rakam1+rakam2+rakam3+rakam4 = "+rakam1+rakam2+rakam3+rakam4);//1234
        System.out.println(" rakam1+rakam2+rakam3+rakam4 ASCII toplam = "+(rakam1+rakam2+rakam3+rakam4));//202

        char kh= 'a';
        char bh ='A';
        System.out.println("a'nin Ascii Degeri = "+(kh+0));//97
        System.out.println("A 'ni Ascci degeri = "+(bh+0));// 65

        System.out.println("kh > bh ==> "+(kh>bh));//true Karsilastirma islemlerinin sonucu true yada false doner


        // Herhangi bir karakterin Ascii degerini Hesaplatalim
        //1. YOL
        char space = ' ';
        System.out.println("space'in Ascci degeri = "+(space+0));// 32

        // 2. YOL
        int hrf= 'm';

        // char datat type'larinda Java karaktere int degerde atanabilir
        //Cunku char data type'inin bir resim degeri bir de
        //Ascii'den gelen int degeri vardir.
        //Bu sekilde de Ascii degerini bulabiliriz

        System.out.println("int harf'in Ascii degeri "+hrf);// 109

        /// *************ASCII degerlerinden yararlanarak Karsilastirma Yapabiliriz ****************\\\\\

        byte b= 125;
        float f = 2.45648f;
        long l= 54565125511144L;
        char ch1 = 'h';
        System.out.println(l>ch1);//true
        System.out.println(b<f);//false
        System.out.println(b<ch1);//false


        }
}
