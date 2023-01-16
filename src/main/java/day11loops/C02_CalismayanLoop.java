package day11loops;

    public class C02_CalismayanLoop {

        public static void main(String[] args) {

            for (int i = 0; i > 10; i++) {
                System.out.println(i);
            }

            //Example 1: Verilen bir String'de 'a' character'i haric tum character'leri yazdiriniz.
            //           "Madagaskar" ==> Mdgskr
            String s = "Madagaskar";

            //1.Yol:
            String t = s.replace("a", "");
            System.out.println(t);// Mdgskr

            //2.Yol:
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch!='a'){
                    System.out.print(ch);
                }
            }

            System.out.println();

            //3.Yol: Madagaskar
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch=='a'){
                    continue;//continue keyword'u bazi sartlar icin loop'un adimlarini atlamamizi saglar
                }
                System.out.print(ch);
            }

        }
    }

