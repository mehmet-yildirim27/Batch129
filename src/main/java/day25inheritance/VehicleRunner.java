package day25inheritance;

public class VehicleRunner {

    public static void main(String[] args) {

        Honda myHonda1 = new Honda();

        // Soru 1) Ekranda önce Price, sonra ""Car 2: " + make" sonra da Honda 1 görmek istiyorum
        // Bu drumda Honda constructora gidip ilk satira super "audi" yazmaliyim
        // Car constructora gidip ilk satira super("20000") yazmaliyim

        // Soru 2) Price + Car1 + Model, Year  görmek istiyorum

        Honda myHonda2 = new Honda("Accord",2023);


    }
}
