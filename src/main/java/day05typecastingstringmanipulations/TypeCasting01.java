package day05typecastingstringmanipulations;

import jdk.swing.interop.SwingInterOpUtils;

public class TypeCasting01 {

    public static void main(String[] args) {

        /*
            Numeric primitive data type'larinin birbirine dönüstürülmesine "Type Casting" denir.
            Numeric data type'lat byte, short, int, long, float, double

            Note 1: Kücük data type'larini büyük data type'larina cevirmeyi Java otomatik olarak yapar.
                    Bu isleme Auto-Widening denir

           Note 2: Büyük data type'larini kücük data type'larina cevirmek riskli bir istir, Java bu riskli isi otomatik olarak yapmaz
                   Bu islemi kod yazanlar yapar
                   Bu isleme "explicit narrowing" denir
         */

        //byte data type'ini int data type'ina ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //long data type'ini short data type'ina cevirelim
        long weight = 234;
        short weightShort = (short)weight;//Explicit Narrowing

        //int data type'ini float data type'ina ceviriniz
        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type'ini short data type'ina ceviriniz
        double number = 12.934;
        System.out.println(number);//12.934

        short numberShort = (short)number;
        System.out.println(numberShort);//12

        //Dikkat!
        //Donusum yaptiginiz sayi(260), donuseceginiz data type'inin sinirlari disinda ise, Java kullandiginiz sayi ile "mod" islemi
        //yapar ve mod isleminin sonucu sizin yeni degeriniz olur
        //Example 1:
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //Example 2:
        short n = 1023;
        System.out.println(n);//1023

        byte nByte = (byte)n;
        System.out.println(nByte);//-1

    }
}
