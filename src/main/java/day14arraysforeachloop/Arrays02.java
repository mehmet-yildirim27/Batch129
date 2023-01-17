package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // sort() metodu stringlerde default olarak alfabetik siraya göre düzenler
        // Ascii tabelada büyük harfler daha önce gelir
        // sort() metodu java'yi yorar. Mümkün mertebe bu metottan kacinmak gerekir
        // Java herhangi bir konuda bir metota sahip ise onu kullanmak daha faydali (Math.min veya Math.max hazir metotlar)


        // 1.yol
        int[] arr={5,75,12,54,96,120,0};

        int max=arr[0];
        int min=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

        //        int[] arr={5,75,12,54,96,120,0};
//
//        int max=arr[0];
//        int min=arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }else {
//                min =arr[i];
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(min);

        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages[] = new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //2.Yol:

        //sort() method'u array'deki elemanlari kucukten buyuge dizer
//        Arrays.sort(ages);
//        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
//        System.out.println(ages[0] + ages[ages.length-1]);//59

        //3.Yol:
        int minimum = ages[0];
        int maximum = ages[0];
        //  20, 23, 19, 44, 15, 32
        for(int w : ages){
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum + maximum);// 59

    }
}
