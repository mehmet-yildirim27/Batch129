package practise.practiseDTNT.practise04;

public class HesapMakinesi {

    public void toplama(int... a){
        int toplam=0;
        for (int w : a) {
            toplam +=w;
        }
        System.out.println("Toplam : "+toplam);
    }

    public void cikarma(int... a){
        int fark=0;
        for (int i = 0; i < a.length-1; i++) {
            fark=a[i]-a[i+1];
        }
        System.out.println("Fark : "+fark);
    }

    public void carpma(int... a){
        int carpim=1;
        for (int w : a) {
            carpim *=w;
        }
        System.out.println("carpim = " + carpim);
    }

    public void bolme(int a, int b){

        if (b==0){
            System.out.println("hic bir sayi 0 ile bolunemez");
        }else {
            System.out.println("Bolme : "+(a/b));
        }
    }
}
