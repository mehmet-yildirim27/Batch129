package practise.practiseDTNT.practise02;

import java.util.Scanner;

public class practise02 {

    //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi =5 olsun

    /*

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    |||
    |||
    |||
    |||
    |||

     */

    public static void main(String[] args) {

        // benim cözümüm Scanner scan=new Scanner(System.in);
//        System.out.println("tac uzunlugunu gir");
//        int tacUzunlugu= scan.nextInt();   // 5
//
//        for (int i = 1; i <=tacUzunlugu+5; i++) {
//            if (i <= tacUzunlugu) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("^");
//                }
//                System.out.println();
//            }
//            if (i>tacUzunlugu){
//                System.out.println("|||");
//            }
//        }

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Agacin tac uzunlugunu giriniz ");
        int tac =scan.nextInt();


        String yaprak= "";
        for (int i = 0; i <tac ; i++) {//satir kontrol
            yaprak+="^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("|||");
        }
    }
}
