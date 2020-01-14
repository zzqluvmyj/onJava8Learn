package ImplementationHiding_07;
class Soup1{
    private Soup1(){}
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}
class Soup2{
    private Soup2(){}
    private static Soup2 ps1=new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){}
}
public class Lunch {
    void testSingleton() {
        Soup2.access().f();
    }
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
}
