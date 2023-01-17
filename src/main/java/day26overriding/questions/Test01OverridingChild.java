package day26overriding.questions;

// Wenn es parent-child Relationsip gibt, dann können wir von Overriding sprechen
// Für die Methode fokussieren wir Constructor
// Für die Variable fokussieren wir Data Type

public class Test01OverridingChild extends  Test01OverridingParent{

    int x=12;
    public void go(){
        System.out.println("Bad");
    }

    public static void main(String[] args) {


        // What is the output?
        Test01OverridingParent obj=new Test01OverridingChild();
        obj.go();                           // Bad
        System.out.println(obj.x);          // 11
    }
}
