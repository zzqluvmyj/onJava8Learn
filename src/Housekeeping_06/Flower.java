package Housekeeping_06;

public class Flower {
    int petalCount=0;
    String s="initial value";
    Flower(int petals){
        petalCount=petals;
        System.out.println(petalCount);
    }
    Flower(String ss){
        System.out.println(ss);
    }
    Flower(String s,int petals){
        this(petals);
        this.s=s;
        System.out.println("String & int args");
    }
    Flower(){
        this("hi",47);
        System.out.println("no-arg constructor");
    }
    void printPetalCount(){
        System.out.println(petalCount+" "+s);
    }

    public static void main(String[] args) {
        Flower x=new Flower();
        x.printPetalCount();
    }
}
