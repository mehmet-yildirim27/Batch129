package practise.advancedpractise.practise06;

import java.util.Scanner;

public class Q02_Palindrome {

    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String değer giriniz");
        String str1 = input.nextLine().replaceAll(" ","").toLowerCase();
        String strReverse1 = "";

        for (int i = str1.length()-1; i >-1 ; i--) {
            strReverse1 +=str1.charAt(i);
        }

        System.out.println("strReverse = " + strReverse1);

        if (str1.equals(strReverse1)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome DEĞİL");
        }

        // 2. yol StringBuilder ile
        System.out.println("Bir String değer giriniz");
        String str2 = input.nextLine().replaceAll(" ","").toLowerCase();

        StringBuilder stb=new StringBuilder(str2);
        String strReverse2 =stb.reverse().toString();

        if (str2.equals(strReverse2)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome DEĞİL");
        }

    }
}
