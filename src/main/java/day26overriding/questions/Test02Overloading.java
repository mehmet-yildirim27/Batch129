package day26overriding.questions;

public class Test02Overloading {

    public static void main(String[] args) {


        // What is the output
        String str=print(8)+print();    // "5"+3="53"

        print(str);     // 53
    }

    public static int print(){
        return 3;
    }

    public static String print(int i){
        return "5";
    }

    public static void print(String j){
        System.out.println(j);
    }

}
