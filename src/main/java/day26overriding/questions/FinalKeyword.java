package day26overriding.questions;

/*
    Final kelimesi 3 yerde kullaniolabilir
    1. Variable'lar icin;
        Variable "final" ise mutlaka deger atanmalidir.
        Ilk atanan deger degistirilemez
    2. Methode'lar icin;
        Method body'si degistirilemez
        Method body'si degistirilemeyince override yapmak mümkün olmaz
    3. Class'lar icin;
        Bir class final ise bu class'in child'i olamaz

        Normalde baska bir classi bu classin childi yapmak istedim. Ama CTE aldim.

    Note : Final variables must be used only for the values that we want to remain constant throughout the execution the programm
    Note: It is a good practise to reprresent "final variables" in all uppercase, using underscore to seperate the words
    public int final PI=3:14,
    MAX_VALUE; MIN_VALUE like in Integer Wrapper Class
    Note: When a variable is declared with the final keyword, its value can't be modified, essentially; it is a constant
    Note: "final variables" must be initialized

    We must declare methods with "final" keyword for which we required to follow the same implementation (yani body) throughout all the derived class
    When a class is declared with "final" keyword, it is called a "final class". A final class cannot be extended(inherited)
    A final method cannot be overridden
    We can make a class make a class to prevent inheritance  (Bazen bir classin icine metotlari koyariz ve degistirilmesini istemeyiz.)
    Bu durumda bu class'i final yapariz

    we can overload static methods, but we cannot override
    static olan metotlar overload edilebilirler, ama override edilemezler (Amerikanin ayi degistirmek istemesi gibi)
    Overloading ==> Compile Time Polymorphism
    Overriding ==> Run Time Polymorphism
        
 */

final class FinalKeyword {
    int i=11;
}
