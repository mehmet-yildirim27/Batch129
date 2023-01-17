package practise.daytime.practise05;

import java.util.Arrays;

public class C04_MD {

    public static void main(String[] args) {

        // multi dimensional arrayin 2. elemaninin 1. eleman ve sonraki elemanlarinin sarta bagli 2 katini alma

        int arr[][] = { {68,5984,461},{968,3566,0} };
        for (int i = 1;  i < arr.length ;               i++) {  // i=1 ise 2. eleman ile ilgileniyoruz.

            for (int k = 1;     k < arr[0].length;           k++) {  // k<3   (3566 ve 0 ) icin dönecek

                if (arr[i][k] % 2 == 1){

                    arr[i][k] = arr[i][k] + 1;
                }
                if (arr[i][k] % 2 == 0){

                    arr[i][k]  =   arr [i] [k]  *  2;

                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }//main
}
