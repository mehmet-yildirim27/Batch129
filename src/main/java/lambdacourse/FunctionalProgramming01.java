package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {
    /*
        1) Lambda is Functional Programming
        In Functional Programming there is no method creation, we use existing methods
        With functional programming our code is faster, shorter and infallibly

        2) Functional Programming was added to Java in Java 8, before Java8 we were using just
        Structured Programming after Java 8 we are able to use both Functional Programming and
        Structured Programming

        3) Structured Programming focuses on "How to do" most of the time, Functional Programming focuses on
        "What to do"

        4) Functional Programming is used with Collections and Arrays
     */

    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        l.add(12);
        l.add(131);
        l.add(13);
        l.add(14);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(12);
        l.add(15);

        printElStructured(l);
        System.out.println();
        printElFunctional(l);
        System.out.println();
        printEvensStructured(l);
        System.out.println();
        printEvensFunctional(l);
        System.out.println();
        printSquareOfOdds(l);
        System.out.println();
        printCubeOfDistinctOdds(l);
        System.out.println();
        sumOfSquareDistinctEvens(l);
        System.out.println();
        productOfCubeDistinctEvens(l);
        System.out.println();
        getMaxElement(l);
        System.out.println();
        getMaxElement2(l);
        System.out.println();
        getMinElement(l);
        System.out.println();
        getMinElement2(l);
        System.out.println();
        getMinGreatThanSevenEven1(l);
        System.out.println();
        getMinGreatThanSevenEven2(l);
        System.out.println();
        getMinGreatThanSevenEven3(l);
        System.out.println();
        getMinGreatThanSevenEven4(l);
        System.out.println();
        getHalfOfDistinctElementsReversed(l);
        System.out.println();

    }

    // 1)create a method to print the list elements on the console in the same line with a space between two consecutive elements (Structured)

    public static void printElStructured(List<Integer> l){
        for (Integer w : l) {
            System.out.print(w+" ");
        }
    }

    // create a method to print the list elements on the console in the same line with a space between two consecutive elements (Functional)
    public static void printElFunctional(List<Integer> l){
        l.stream().forEach(t-> System.out.print(t+" "));
    }

    // 2)create a method to print the even list elements on the console in the same line with a space between two consecutive elements (Structured)
    public static void printEvensStructured(List<Integer> l){
        for (Integer w : l) {
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    // create a method to print the even list elements on the console in the same line with a space between two consecutive elements (Functional)
    public static void printEvensFunctional(List<Integer> l){
        l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));  // t->t%2==0 the name of this structure is "Lambda Expresiions"
    }

    // 3)create a method to print the square of odd  elements on the console in the same line with a space between two consecutive elements (Functional)
    public static void printSquareOfOdds(List<Integer> l){
        l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" ")); // map() is used to change the value of elements
    }

    // 4)create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements (Functional)
    public static void printCubeOfDistinctOdds(List<Integer> l){
        l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" ")); // distinct() removes the repeated ones
    }

    // 5)create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquareDistinctEvens(List<Integer> l){
            Integer sum=l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u); // For sum make the first parameter zero
        System.out.println("The sum of the squares of the distinct even elements is : "+sum);
    }

    // 6)create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubeDistinctEvens(List<Integer> l){
        Integer product=l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.print("The multiplication of the cubes of even elements is : "+product);
    }

    // 7)create a method to find the maximum value from the list elements
    // 1. Way
    public static void getMaxElement(List<Integer> l){
        Integer maxEl=l.stream().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u );
        System.out.println("The max element is : "+maxEl);
    }

    // 2. Way
    public static void getMaxElement2(List<Integer> l){
        // sorted()==> Returns a stream consisting of the elements of this stream, sorted according to the natural order.
        Integer maxEl=l.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u)->u); // (t,u)->u  her zaman u'yu sec demis oluyoruz
        System.out.println("The max element is : "+maxEl);
    }

    // 8)create a method to find the minimum value from the list elements
    // 1. Way
    public static void getMinElement(List<Integer> l){
        Integer minEl=l.stream().reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println("The min element is : "+minEl);
    }

    // 2. Way
    public static void getMinElement2(List<Integer> l){
        Integer minEl=l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u)->u);
        System.out.println("The min element is : "+minEl);
    }

    // 9)create a method to find the minimum value which is greater than 7 and even from the list
    // 1.Way
    public static void getMinGreatThanSevenEven1(List<Integer> l){
        Integer minEl=l.stream().distinct().filter(t->t%2==0 && t>7).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println("The minimum element is : " +minEl); // 10
    }

    // 2.Way
    public static void getMinGreatThanSevenEven2(List<Integer> l){
        Integer minEl=l.stream().distinct().filter(t->t%2==0).sorted().reduce(7,(t,u)-> t>u ? t : u);
        System.out.println("The minimum element is : " +minEl); // 14   // bunda bir problem var, dogru calismiyor
    }

    // 3.Way
    public static void getMinGreatThanSevenEven3(List<Integer> l){
        Integer minEl=l.stream().distinct().filter(t->t%2==0 && t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)-> u);
        System.out.println("The minimum element is : " +minEl); // 10
    }

    // 4. Way
    public static void getMinGreatThanSevenEven4(List<Integer> l){
        // Use findFirst() with get() to get Integer return type
        Integer minEl=l.stream().distinct().filter(t->t%2==0 && t>7).sorted().findFirst().get();
        System.out.println("The minimum element is : " +minEl); // 10
    }

    // 10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order from the list
    public static void getHalfOfDistinctElementsReversed(List<Integer> l){
        List<Integer> resultList=l.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Half of the elements list : "+resultList);  // Half of the elements list : [65.5, 7.5, 7.0, 6.5, 6.0, 5.0, 4.5]
    }


}
