package practise.daytime.practise05;

public class C05_MD {

    public static void main(String[] args) {

        int[][] x = {{82, 1}, {0, 70, 80}};

        System.out.println(m(x[1]));
    }//main

    public static int m(int[] m) {// {0, 70, 80}

        int result = m[1];//  {0, 70, 80};      result=70

        for (int i = 0; i < m.length; i++) { // i=0, i<2, i++

            result += m[i];

        }

        return result;
    }
}
