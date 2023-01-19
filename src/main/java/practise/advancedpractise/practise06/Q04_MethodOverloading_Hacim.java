package practise.advancedpractise.practise06;

public class Q04_MethodOverloading_Hacim {

    public static void main(String[] args) {

        //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir kod yazınız.(Method overloading kullanınız)

       Hacim obje=new Hacim();
       int kupunHacmi= obje.hacimHesapla(5);
       System.out.println("kupunHacmi = " + kupunHacmi);

        int karePrizmaninHacmi = obje.hacimHesapla(5,4);
        System.out.println("karePrizmaninHacmi = " + karePrizmaninHacmi);

        int dikdortgenPrizmaninHacmi = obje.hacimHesapla(2,3,4);
        System.out.println("dikdortgenPrizmaninHacmi = " + dikdortgenPrizmaninHacmi);

        int kupunHacmi2 = obje.hacimHesapla(2);
        System.out.println("kupunHacmi2 = " + kupunHacmi2);
    }

}
