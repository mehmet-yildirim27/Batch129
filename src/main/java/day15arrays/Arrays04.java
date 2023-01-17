package day15arrays;

public class Arrays04 {

    public static void main(String[] args) {

        // Example 1: Bir Arrayin icinde herhangi bir elemanin olup olmadigini
        // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz

        int[] arr={2,0,2,3,0,12,0,2};
        int num=2;
        int counter=0;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==num){
//                counter++;
//            }
//        }

        for (int w: arr) {
            if (w==num){
                counter++;
            }

        }

        if (counter==0){
            System.out.println(num+ " sayisi dizide yoktur");
        }else {
            System.out.println(num+" sayisi dizide "+counter+" adet vardir.");
        }
    }
}
