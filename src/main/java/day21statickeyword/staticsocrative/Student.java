package day21statickeyword.staticsocrative;

public class Student {

    String name;
    static  String college="UNF";

    Student(String n,String college){
        this.name=n;
        this.college=college;
    }

    public static void main(String[] args) {

        Student s1=new Student("Mark","UCF");
        Student s2=new Student("Kevin","FIU");

        System.out.println(s1.name);    // Mark
        System.out.println(s2.name);    // Kevin
        System.out.println(s1.college); // FIU
        System.out.println(s2.college); // FIU
    }
}
