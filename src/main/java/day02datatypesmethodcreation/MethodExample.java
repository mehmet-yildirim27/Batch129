package day02datatypesmethodcreation;

import static java.lang.Math.PI;

public class MethodExample {

    // 1-Dikdortgenin alanini hesaplayan metotu olusturunuz ve kullaniniz
    // 2- Dikdörtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    // 3- Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    // 4- Dairenin alanini hesaplayip metodu olusturun ve kullanin

    public static void main(String[] args) {

        int areaOfRect=areaOfRectangle(10,15);
        System.out.println("The area of the rectangle : "+areaOfRect);

        int perOfRectangle=perimeterOfRectangle(10,15);
        System.out.println("The perimeter of the rectangle : "+perOfRectangle);

        double perOfCircle=perimeterOfCircle(10);
        System.out.println("The perimeter of the rectangle : "+perOfCircle);

        double areaOfCir=areaOfCircle(10);
        System.out.println("The perimeter of the rectangle : "+areaOfCir);







    }

    public static  int areaOfRectangle(int shortEdge, int longEdge){
        return shortEdge*longEdge;
    }

    private static  int perimeterOfRectangle(int shortEdge, int longEdge){
        return 2*(shortEdge+longEdge);
    }

    protected static  double perimeterOfCircle(int radius){
        return 2* Math.PI*radius;
    }

    static  double areaOfCircle(int radius){
        return PI*radius*radius;
    }
}
