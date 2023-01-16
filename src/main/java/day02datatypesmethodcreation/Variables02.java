package day02datatypesmethodcreation;

public class Variables02 {


        /*
        Non-Primitive Dta Types : String bir non-primitive data type dir
                                  Üretilen her bir class ayni zamanda bir non-primitive data type'dir
                                  Bu yüzden "non-primitive data type" lar sinirsiz sayidadir
                                  Non-primitive data type lar büyük harflerle baslar
                                  Non-primitive data type larin tamami icin Java memory de ayni miktarda yer ayirir

         Interview Sorusu : "primitive" ve "non-primtive" data type lari arasindaki farklar nelerdir?
                            1- primitive ler sadece bizim istedigimiz degeri icerir
                            non-primitiv ler bizim atadigimiz degerler ve metotlari icerir
                            2- primitive ler kücük harfle baslar, non-primitive ler büyük harfle baslar
                            3- primitve leri Java üretir ve 8 tanedir
                               non-primtive leri Java ve developerler üretir, sinirsiz sayidadir
                            4- primitive data type'lar memory de data type göre yer kaplar
                               non-primitve ler icin Java memory de hep ayni büyüklükte yer kaplar
         */



    public static void main(String[] args) {


        // Ornek 1 : Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin

        String cityName="Miami";

        System.out.println(cityName);


        cityName=cityName.toUpperCase();

        System.out.println(cityName);       // MIAMI
    }
}
