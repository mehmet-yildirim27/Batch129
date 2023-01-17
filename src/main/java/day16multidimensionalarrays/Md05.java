package day16multidimensionalarrays;

public class Md05 {

    public static void main(String[] args) {

        //Example 1: Bir integer multi-dimensional array olusturunuz
        //           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz

        int a[][] = { {2, 5}, {4, 7, 11} };

        int carpim = 1;

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                carpim *=a[i][j];
//            }
//        }
//        System.out.println(carpim);

        for (int[] w: a) {
            for (int k : w) {
                carpim *=k;
            }
        }
        System.out.println(carpim);


    }
}
