package day26overriding.questions;

public class Test01Overloading {

    public static void main(String[] args) {

        // What is the output?
        go();               // Bad
        go(12);          // Good
        go(5 >= 5);     // The best
    }

    public static void go() {
        System.out.println("Bad");
    }

    public static void go(double i) {
        System.out.println("Good");
    }

    public static void go(boolean b) {
        if (b){
            System.out.println("The best");
        }else {
            System.out.println("The worst");
        }
    }
}
