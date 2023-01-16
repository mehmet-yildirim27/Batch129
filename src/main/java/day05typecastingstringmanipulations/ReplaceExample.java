package day05typecastingstringmanipulations;

public class ReplaceExample {

    public static void main(String[] args) {

        String t = "Ali 13 yasindadir!...";

        System.out.println(t.replaceAll("\\d","*"));        // Ali ** yasindadir!...
        System.out.println(t.replaceAll("\\D","*"));        // ****13***************
        System.out.println(t.replaceAll("\\w","*"));        // *** ** **********!...  (harfleri ve rakamlari degistirdik)
        System.out.println(t.replaceAll("\\W","*"));        // Ali*13*yasindadir****   (harfler ve rakamlar disinda herseyi degistirdik)
        System.out.println(t.replaceAll("\\s","*"));        // Ali*13*yasindadir!...
        System.out.println(t.replaceAll("\\S","*"));        // *** ** **************
    }
}
