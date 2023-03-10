package day26overriding.questions;

public class Test03Overloading {

    public static void main(String[] args) {


        // What is the output?
        int x=add(2,8);             // x=10
        double y=add(3,4.5);        // y=7.5
        double z=add(x,y,20);         // z=10+7.5+20=37.5

        System.out.println(z);
    }

    static int add(int i, int j){
        return  i+j;
    }

    static double add(double i, double j){
        return  i+j;
    }

    static double add(int i, double j, int k){
        return  i+j+k;
    }
}
