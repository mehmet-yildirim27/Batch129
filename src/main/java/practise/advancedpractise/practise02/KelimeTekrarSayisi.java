package practise.advancedpractise.practise02;

import java.util.Arrays;

public class KelimeTekrarSayisi {

    public static void main(String[] args) {

 /*
            String str= "Hasan dun geldi ama Hasan dun gitmedi Hasan iste ";
           Hasan=3,  dun=2, geldi=1


           Verilen String de her kelimenin kac defa tekrar ettigini gosteren kodu yaziniz

           */

        String str="Hasan dun geldi ama Hasan dun gitmedi Hasan iste ";
        String[] arrayStr=str.split(" ");
        System.out.println(Arrays.toString(arrayStr));

        String visited="";
        int counter=1;

        for (int i = 0; i < arrayStr.length; i++) {
            counter=1;
            for (int j = (i+1); j < arrayStr.length; j++) {
                if(arrayStr[i].equals(arrayStr[j])){
                    counter++;
                    arrayStr[j]=visited;
                }
            }
            if (!(arrayStr[i].equals(visited))){
                System.out.println(arrayStr[i]+"="+counter);
            }
        }
    }
}
