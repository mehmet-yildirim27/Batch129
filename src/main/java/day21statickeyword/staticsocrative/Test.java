package day21statickeyword.staticsocrative;

public class Test {

    int y = 5;
    static  int x=7;

    public static void main(String[] args) {

        Test t1=new Test();
        Test t2=new Test();

        t1.x=17;
        t1.y=15;

        System.out.print(t1.x+" ");
        System.out.println(t2.x);   //17 17

        System.out.print(t1.y+" ");
        System.out.println(t2.y);   // 15 5
    }

}


