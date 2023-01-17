package practise.nighttime.practise05;

public class C02_Varargs {

    //Verilen sayilardan ilki haric tum sayilari
    // toplayip ilk sayiyla carpan bir method olusturunuz (Varargs kullanarak)

    public static void main(String[] args) {

        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;

        sonuc(sayi1,sayi2,sayi3,sayi4,sayi5);



    }

    public static void sonuc(int sayi1, int... toplanacakSayi){
        int toplam=0;
        int sonuc;
        for (int w : toplanacakSayi) {
            toplam +=w;
        }
        sonuc=sayi1*toplam;
        System.out.println(sonuc);
    }
}
