package day23datetimestringbuilder;

public class StringBuffer01 {

        /*
        String olusturmak icin String Class, StringBuilder Class, ve StringBuffer kullanilabilir.
        1)StringBuffer Java'nin String uretmek icin olusturdugu ile Class'dir. Java 5 de uretilmistir.
        2)StringBuffer "synchronized" dir, StringBuilder "synchronized" degildir.
        3)StringBuffer "thread-safe"(multi-thread'e uygun) dir, StringBuilder "thread-safe" degildir.
        4)StringBuffer ve StringBuilder ikisi de mutable dir.

        Note 1: Immutable String lazim oldugunda String Class kullaniriz.
        Note 2: Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
        Note 3: StringBuffer "Multithread" ve "Synchronization" lazim oldugunda tercih edilir.
                StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.
     */

    // StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as
    // String class except it is mutable i.e. it can be changed.

    /*
        StringBuffer(): creates an empty string buffer with the initial capacity of 16.
        StringBuffer(String str): creates a string buffer with the specified string.
        StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
     */

    public static void main(String[] args) {

        /*
        StringBuffer(): creates an empty string buffer with the initial capacity of 16.
        StringBuffer(String str): creates a string buffer with the specified string.
        StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
     */

            StringBuffer sbf = new StringBuffer("Hello ");

            // append() method
            sbf.append("Java"); // now original string is changed
            System.out.println(sbf);    // Hello Java

            //insert()==> inserts the given string with this string at the given position.
            sbf.insert(5," Hello");
            System.out.println(sbf);

            // replace()==> replaces the given string from the specified beginIndex and endIndex-1.
        sbf=new StringBuffer("Hello");
        System.out.println(sbf);
        sbf.replace(1,3,"Java"); // index 1 ve index 2' i "Java ile degistirir"
        System.out.println(sbf);    // HJavalo

        // delete()==>deletes the String from specified beginnIndex to endIndex-1
        sbf=new StringBuffer("Hello");
        System.out.println(sbf);

        sbf.delete(1,3);
        System.out.println(sbf);

        // reverse()==> reverses the current string
        sbf=new StringBuffer("Hello");
        System.out.println(sbf);

        sbf.reverse();
        System.out.println(sbf);        // olleH

        // cpacity()==> returns the current capacity of the buffer. The default capacity of the buffer is 16.
        // If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());  // 34
        // Now (16*2)+2=34     i.e (oldcapacity*2)+2

        /*
            Remember: StringBuilder, J2SE 5 adds a new string class to Java’s already powerful string
             handling capabilities. This new class is called StringBuilder.
             It is identical to StringBuffer except for one important difference:
             it is not synchronized, which means that it is not thread-safe.
             The advantage of StringBuilder is faster performance.
             However, in cases in which you are using multithreading,
             you must use StringBuffer rather than StringBuilder.
         */

        /*
            Constructors of StringBuffer class

            1. StringBuffer(): It reserves room for 16 characters without reallocation

               StringBuffer s = new StringBuffer();
            2. StringBuffer( int size): It accepts an integer argument that explicitly sets the size of the buffer.

               StringBuffer s = new StringBuffer(20);
            3. StringBuffer(String str): It accepts a string argument that sets the initial contents of the StringBuffer object and reserves room for 16 more characters without reallocation.

                StringBuffer s = new StringBuffer("GeeksforGeeks");
         */





    }
}
