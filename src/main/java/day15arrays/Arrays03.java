package day15arrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int[] arr={0,2,3,0,12,0};
        int[] newArr=new int[arr.length];
        int idx=0;


        // 1. yol
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] !=0){
//             arr[idx]=arr[i];
//             arr[i]=0;
//             idx++;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

        for (int w: arr) {
            if (w!=0){
                newArr[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
