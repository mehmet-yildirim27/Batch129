package day13whileloopdowhileloop;

public class dowhileloop01 {

    public static void main(String[] args) {

        // 1) while - loop
        int i=1;
        while (i<1){
            System.out.println("Sen bir while loopsun...");
            i++;
        }

        /*
            1. while body hic calismadi
            2. while-loopda zero execution mümkündür
         */

        // 2) do-while-loop
        int k=1;

        do {
            System.out.println("Sen bir do-while-loopsun...");
        }while (k<1);

        /*
            1. do-while body calisti
            2. do-while kullanilirsa loop body en az bir kere calisir
            3. do-while'da zero execution mümkün degildir
         */


    }
}
