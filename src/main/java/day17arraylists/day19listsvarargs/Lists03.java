package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists03 {

    public static void main(String[] args) {

        /*
                        SAYI TAHMIN OYUNU
            Oyuncudan 1-10 arasi bir sayi isteyiniz
            Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
            Yoksa verdigi sayiyi listenize ekleyiniz.
            Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
            [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
            [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
            [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Oyunumuza hos geldiniz...");
        System.out.println("Oyunu sonlandirmak icin Q ya basiniz...");

        //Arrays.asList() ile List olusturulabilir.
        //Ama Listlerdeki "eleman sayisini" degistiren hicbir method bu List icin kullanilamaz.
        //Dolayisiyla bu sorunun cozumunde ihtiyaciniz olan Listi "Arrays.asList()" kullanarak olusturmamalisiniz.
        //List<Integer> numsList = Arrays.asList(5, 8, 2, 9);

        List<String> numsList = new ArrayList<>();
        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");

        int counter =0;
        String num = "";

        do{
            System.out.println("Lutfen 1 ile 10 arasinda bir tam sayi giriniz");
            num = input.next();


            if(num.equalsIgnoreCase("Q")){
                break;
            }else if(numsList.contains(num)){
                numsList.set(numsList.indexOf(num), "Bingo");
                counter++;
            }else{
                numsList.add(num);
            }
        }while(counter!= numsList.size());

        if(!num.equalsIgnoreCase("Q")) {
            System.out.println("Kazandiniz");
        }else{
            System.out.println("Oyundan isteyerek ayrildiniz, tekrar bekleriz");
        }

        System.out.println("Final report: " + numsList);

        List<String> names = new ArrayList<>();
        names.add("Hakan");
        names.add("Yunus");
        names.add("Ayse");
        names.add("Zisan");
        names.add("Sevcan");
        names.add("Omer");

        List<String> males = new ArrayList<>();
        males.add("Hakan");
        males.add("Yunus");
        males.add("Ali");

        names.retainAll(males);
        System.out.println("names = " + names);//names = [Hakan, Yunus] ortak olmayanlar siliniyor
        System.out.println("males = " + males);//males = [Hakan, Yunus, Ali] degismez aynen kalir

        // Listeden belirli bir araliktaki datalari getirme
        List<String> sanatci = new ArrayList<>();
        sanatci.add("Ajda");
        sanatci.add("Cuneyt");
        sanatci.add("Mahsun");
        sanatci.add("Muslum");
        sanatci.add("Orhan");
        System.out.println("sanatci = " + sanatci);
        sanatci.subList(1,3);
        System.out.println( sanatci.subList(1,3));
        //subList sout'un icinde yazdirilabilir ya da atama yapip conteyner'in adi yazdirilabilir
    }
}
