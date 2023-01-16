package day11loops;

public class C01_SonsuzLoop {

    public static void main(String[] args) {
        for(int i=0 ; i>=0; i++){

        }

        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"
        String s = "Tramvay";

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }

        System.out.println();

        //Example 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
        //           "Germany" ==> yn
        String t = "Germany";

        for(int i=t.length()-1; i>=0; i--){
            char ch = t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }

        //Note 1: Bazi loop'lar hic calismayabilir
//        for(int i=1; i<0; i--){
//            System.out.println("Hi!");//Zero execution
//        }

        //Note 2: Bazi loop'lar sonsuz defa calisabilir.
        //        Bu tarz loop'lara "Infinite(Sonsuz) Loop" denir.
        //        "Infinite(Sonsuz) Loop" genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir
//        for(int i=1; i<10; i--){
//            System.out.println("Java is money...");
//        }

        //Note 3: Baska bir "Infinite(Sonsuz) Loop"
        //        Lloop olusturdugunuzda "ikinci kismi" yazmazsaniz "Infinite(Sonsuz) Loop" olur
//        for(int i=1;      ;i++){
//            System.out.println("Hi!");
//        }


    }
}
