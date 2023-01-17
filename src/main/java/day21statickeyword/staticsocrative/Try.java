package day21statickeyword.staticsocrative;

import java.util.Random;

public class Try {

    static int a = 10;
    int b=10;

    public static void main(String[] args) {

        Try t1=new Try();
        Try t2=new Try();

        t1.a=a+2;       // update is gültig für alle Objekte
        t2.a=a+3;      // update is gültig für alle Objekte

        t1.b=12;
        t2.b=13;


        System.out.println(t1.a);    // 15
        System.out.println(t2.a);    // 15

        System.out.println("==============");

        System.out.println(t1.b);   // 12       das ist nicht static, deswegen ist es mit dem Objeckt abhängig
        System.out.println(t2.b);   // 13

        m1(33,44);      // Method 2
        //m1(33.3);        // CTE
        m1(33);                     // Method 1
        // m1(33.3,44);     // CTE


    }

    public static void m1(float x){
        System.out.println("Method 1");
    }

    public static void m1(int x, double y){
        System.out.println("Method 2");
    }
}
