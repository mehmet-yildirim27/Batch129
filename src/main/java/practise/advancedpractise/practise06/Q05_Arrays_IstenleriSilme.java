package practise.advancedpractise.practise06;

import java.util.Arrays;

public class Q05_Arrays_IstenleriSilme {

    public static void main(String[] args) {

        //Bir  integer Array'de verilen bir değer dışındaki elamanları yeni bir Array olarak yazdıran bir method yazınız.

        int[] arr = {1, 2, 2, 3, 4, 5, 5};

        int[] yeniArray=istenilenElemaniSil(arr,5);
        System.out.println(Arrays.toString(yeniArray));
    }

    public static int[] istenilenElemaniSil(int[] arr, int silinecekEleman){

        int idx=0;
        int tekrarSayisi=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==silinecekEleman){
                tekrarSayisi++;
            }
        }

        int[] yeniArray=new int[arr.length-tekrarSayisi];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=silinecekEleman){
                yeniArray[idx]=arr[i];
                idx++;
            }
        }
        return yeniArray;
    }
}
