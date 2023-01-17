package day16multidimensionalarrays;

public class Md03 {

    public static void main(String[] args) {

        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int a[][] = { {2, 62, 82}, {3, 13} };
        int sum=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum +=a[i][j];
            }
        }
        System.out.println(sum);

        for (int[] w: a) {
            for (int k: w) {
                sum +=k;
            }
        }
        System.out.println(sum);
    }
}
