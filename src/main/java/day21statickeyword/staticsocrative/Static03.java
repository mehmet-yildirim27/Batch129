package day21statickeyword.staticsocrative;

public class Static03 {

    static  int counter=0;
    int age=0;

    public Static03(){
        counter++;
        age++;
    }

    public static void main(String[] args) {
        Static03 obj1=new Static03();
        Static03 obj2=new Static03();
        Static03 obj3=new Static03();

        System.out.println(obj1.counter);   // 3
        System.out.println(obj2.counter);   // 3
        System.out.println(obj3.counter);   // 3
        // simdi burada 3 tane hata aliyorum. Diyor ki static degiskene nicin obje üzerinden ulasiyorsun?

        System.out.println("=============");

        System.out.println(obj1.age);   // 1
        System.out.println(obj2.age);   // 1
        System.out.println(obj3.age);   // 1
    }
}
