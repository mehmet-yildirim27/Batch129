package day21statickeyword.staticsocrative;

import java.util.Scanner;

public class Test1 {

    String studentName;
    String year="2020";
    static int counter=1000;
    String studentId;

    public Test1(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        studentName= scan.next();
        setStudentId();
    }

    public static void main(String[] args) {

        // If the user enters "Ali Can" for the first student's name and "Veli Han" for the second student's name, what is the output for A and for B

        Test1 student1=new Test1();
        System.out.println(student1.studentName+student1.studentId);        // Ali20201001

        Test1 student2=new Test1();
        System.out.println(student2.studentName+student2.studentId);        // Veli20201002

    }

    public void setStudentId(){
        counter++;
        this.studentId=year+""+counter;
    }
}
