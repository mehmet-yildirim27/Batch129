package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class FunctionalProgramming02 {


    /*
        Method References : Class name : : Method name without method paranthesis
        Example ==>         String     : : length
                            ArrayList  : : size
     */

    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);

        printElFunctional(l);
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
        getMinElement(l);
        System.out.println();
        getHalfOfDistinctElementsReversed(l);
    }

    // 1)create a method to print the list elements on the console in the same line with a space between two consecutive elements (Method Reference)
    public static void printElFunctional(List<Integer> l){
        l.stream().forEach(Utils::printInTheSameLineWithASpace);
    }

    // 2)create a method to print the list elements on the console in the same line with a space between two consecutive elements (Functional)
    public static void printEvensFunctional(List<Integer> l){
        l.stream().filter(Utils::checkToBeEven).forEach(Utils::printInTheSameLineWithASpace);
    }

    // 3)create a method to print the square of odd  elements on the console in the same line with a space between two consecutive elements (Functional)
    public static void printSquareOfOdds(List<Integer> l){
        l.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printInTheSameLineWithASpace);
    }

    // 4)create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements (Functional)
    public static void printCubeOfDistinctOdds(List<Integer> l){
        l.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInTheSameLineWithASpace); // distinct() removes the repeated ones
    }

    // 5)create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfSquareDistinctEvens(List<Integer> l){
        Integer sum=l.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0,Math::addExact); // For sum make the first parameter zero
        System.out.println("The sum of the squares of the distinct even elements is : "+sum);
    }

    // 6)create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubeDistinctEvens(List<Integer> l){
        Integer product=l.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).reduce(1,Math::multiplyExact);
        System.out.print("The multiplication of the cubes of even elements is : "+product);
    }

    //    7)create a method to find the maximum value from the list elements
          public static void getMaxElement(List<Integer> l){
              Integer maxEl=l.stream().reduce(Integer.MIN_VALUE, Math::max );
              System.out.println("The max element is : "+maxEl);
          }

    // 8)create a method to find the minimum value from the list elements
    public static void getMinElement(List<Integer> l){
        Integer minEl=l.stream().reduce(Integer.MAX_VALUE,(Math::min));
        System.out.println("The min element is : "+minEl);
    }

    // 9)create a method to find the minimum value which is greater than 7 and even from the list
    public static void getMinGreatThanSevenEven1(List<Integer> l){
        // Integer minEl=l.stream().distinct().filter(Utils::checkToBeEven && t>7).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        // bir filter() icinde hem "Lambda Expredssions" hem de "Method Refeference kullanilamaz". Bundan dolayi sikayet etti.
        // >7 sarti cok spesifik oldugu ve projede cok sik kullanilmayacagini düsündügüm icin metot olusturmadim. Lambda Expressions ile devam ettim
        Integer minEl=l.stream().distinct().filter( t->t>7).filter(Utils::checkToBeEven ).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println("The minimum element is : " +minEl); // 10
    }

    // 10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order from the list
    public static void getHalfOfDistinctElementsReversed(List<Integer> l){
        List<Double>resultList=l.
                                stream().
                                distinct().
                                filter(t->t>5).
                                map(Utils::getHalf).
                                sorted(Comparator.reverseOrder()).
                                collect(Collectors.toList());
        System.out.println("Half of the elements list : "+resultList);  // Half of the elements list : [65.5, 7.5, 7.0, 6.5, 6.0, 5.0, 4.5]
    }
}
