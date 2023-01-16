package day02datatypesmethodcreation;

public class Variables01 {

    public static void main(String[] args) {

        // package isimleri kücük harflerden olusmalidir
        // class isimleri ise büyük harfle baslamalidir

        // primitive data types ==> char, boolean, byte, short, int, long, float, double
        // float : ondalikli sayilar icin kullanilir (decimal numbers)   4 byte
        // double : ondalikli sayilar icin kullanilir (decimal numbers)  8 byte

        // Note 1: primitiv data type'larini Java olusturmustur, biz olusturamayiz.
        // Note 2: primitive data type'larinda sadece kücük harf kullanilir
        // Note 3: primitive datalar, data türlerine göre memory de farkli yr kaplarlar
        // Note 4: primitive datalar iclerinde sadece bizim atadigimiz degerleri tutarlar.

        // Örnek : float ücretlerde, fiyatlandirmalarda kullanilir
        // Mesela hücre agirligindan bahsediyor isek double kullanilir

        // Örnek 1 . Gömlek ve ayakkabi fiyatlari icin 2 tane variable olustur, degerlerini topla

        // java ondalikli sayilari otomatik olarak float kabul eder, dolayisi ile long taki gibi sona "f" veya "F" eklemeliyiz.

        // pointer = imlec  (println)

        float shirtPrice = 12.99f;
        float shoePrice = 15.89f;

        float totalPrice = shirtPrice + shoePrice;

        // System.out.println(totalPrice); ekrana yazdirir ve pointeri bir sonraki satira koyar
        System.out.println(totalPrice);

        // System.out.print(totalPrice); ekrana yazdirir ve pointeri ayni satira koyar

        // Ornek 2 : Hücre agirlige ve amipin agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin

        double weightCell=0.000000000112;
        double weightAmip=0.000000000023;

        System.out.println(weightCell-weightAmip);      // 8.9E-11  (Burada E exponential demek. 8*9 üzeri -13)

        // float deger olusturur iken f yazmak gerektiginden developerlar ondalikli sayilar icin double kullanirlar

    }
}
