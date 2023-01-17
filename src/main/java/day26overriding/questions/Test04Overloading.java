package day26overriding.questions;

public class Test04Overloading {

    public static void main(String[] args) {

        // What is the output?
        System.out.println(avg(1.2,4.8));       // Good    3.0
        System.out.println(avg(1.2,4.8,6));     // Bad      4.0


    }



    public static double avg(double i, double j){
        System.out.println("Good");
        return (i+j)/2;
    }

    public static double avg(double... k){
        System.out.println("Bad");
        double sum=0;
        for (int i = 0; i < k.length; i++) {
            sum=sum+k[i];
        }
        return sum/k.length;
    }
}
