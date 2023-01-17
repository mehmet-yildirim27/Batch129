package practise.practiseDTNT.practise04;

public class Socrativ {

    public static int m1(boolean b1, boolean... b2){
        return  b2.length;
    }

    public  static void m2(int i, int j, int... k){
        System.out.println(k.length);
    }

    public static void m3(String x, int... y){
        int p=1;
        for (int w : y) {
            p=p*w;
        }
        System.out.print(x);
        System.out.println(p);
    }

    public  static void m4(int... a){
        System.out.println("==>"+a.length);
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void m5(String str, int... a){
        System.out.println(str);
        for (int i : a) {
            System.out.println(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println(m1(true, false, true));  // 2   (b2 ye ait 2 tane eleman var)
        System.out.println(m1(false,true));         // 1
        System.out.println(m1(true, false, true, true));    // 3
        // System.out.println(m1();
        System.out.println(m1(true));   // 0  (varargs hic eleman da almayabilir, sonsuz sayida elemanda alabilir)

        m2(1,2,3,4);    // 2
        m2(1,2,3,4,5);  // 3
        m2(1,2); // 0
        // m2(1,);  CTE  (1 I YE GIDER; J BOSTA KALDI)

        m3("Result : ",2,3,4);      // Result : 24
        // m3("Result : ",2,2.5);      // CTE
        m3("Result : ");        // Result : 1
        m3("Result : ",2);        // Result : 2

        m4(10);     // ==>1   ve alt satirda 10
        m4(11,12,13,14); // ==>4 ve alt satirda 11 12 13 14

        m5("Java",101,102); // Java 101 102
    }
}
