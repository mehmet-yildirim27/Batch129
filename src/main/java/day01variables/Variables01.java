package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        // Variable olusturmak
        // Java cümlesi = Statement
        // Java da esittir demek "=="
        // Java'da "=" "assigment operator" dir. Sagdaki degeri alir, soldakine atar
        // Access modifier yazmaz isek "access modifier" "default" demektir
        // Data type  +   Variable name ==> Variable Decleration
        // Assigment Operator  +   Variable Value ==> Assigment
        // Eger variable declaration yapar, deger atamaz iseniz Java default degeri koyar
        // Default degerler sayilar icin o'dir
        // Data Type'i yaziniz.     Variable ismi yaziniz.          Assigment Operator               Variable value

        int                         age                                     =                              13                    ;

        String name;            // Variable definieren
        name="MEHMET";          // Assigment

        // Ornek 1: Ogrenci ismi icin variable olusturup degeri Al Can olarak atayiniz
        // String'ler icin default degeri ==> "null"

        String studentName= "Ali Can";

        /*
        Java da temelde 2 tip data vardir;
        1) Primitiv data type
                char ==>     Tek karakterler icin kullanilir: Degerler tek tirnak icinde kullanilir
                boolean ==>  Sadece 2 farkli degr alir. true veya false
                byte    ==> -128 ila 127 ye kadar tam sayi degerleri icin kullanilir
                short   ==> 2 bytelik yer kaplar (-32768 ila 32767)
                int     ==> 4 byte lik yer kaplar
                long    ==> 8 bytelik yer kaplar
        2) non-primitiv data type



         */

        // örnek 2: char data türünde ilk ismin ilk harfi olarak bir variable olusturun ve bir deger atayiniz

        char isminIlkHarfi='A';

        // Örnek 3: boolean data türünde emeklimisin icin bir deger olustur ve false degerini ata

        boolean emeklimisin=false;

        // lise ögrenciler icin uygulama. Ögrencilerden yasi 127 den büyük olmaz ki. Bu durumda byte kullanilabilir

        // Örnek 4: byte data türünde ögrenci yasi icin deger olustur ve ata
        // int yerine nicin byte kullandik. Memory tasarruf

        byte studentAge=23;

        // Örnek 5: Site nüfusu icin variable olustur ve deger ata

        short siteNufusu=1200;

        // Örnek 6: lke nufuslari icin variable olustur ve deger ata

        int countryPopulation=186418648;

        // Örnek 7: Insan vücudundaki hücre sayisi icin variable olustur ve dege ata
        // Bir variable long ise sonuna "l" veya "L" yazmaliyiz. Okunurluluk acisindan büyük L tercih edilir

        long cellNumberInHumanBody=876541233369898877L;

        // Eger long a atadiginiz deger int araliginda ise L yazmaya gerek yok ama yine de L koymak güzeldir
        // Java bunu int olarak kabul eder

        long weightOfSun=1234567;

    }
}
