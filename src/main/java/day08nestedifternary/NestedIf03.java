package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {

       /*
            Password'un ilk harfi buyuk harf ise
            'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
            Passwordun ilk harfi kucuk harf ise
            'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin

        */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String pwd=input.nextLine();

        // asagida charAt() metodunu 6 kez kullandik. Bu java'yi yorar, Java 6 kez String class'a gidecek
        // bunun yerine bunu bir degiskene koymak daha iyi olurdu

        char firstChar=pwd.charAt(0);

        if (firstChar>='A' && firstChar<='Z'){
            if (firstChar>='A'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password cunku buyuk harf ama 'A' degil" );
            }
        } else if (firstChar>='a' && firstChar<='z') {
            if (firstChar>='z'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password cunku kucuk harf ama 'z' degil" );
            }
        }else {
            System.out.println("Ilk karakter harf olmali");
        }
    }
}
