package hello;

public class JavaFirst {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        double len =5;
        System.out.println("Area = " + area(len));
        double a=4;
        double b= 5;
        System.out.println("Area2 = " + area(a,b));
    }

    public static void hello(String somebody) {
        System.out.println("hello, " + somebody);
    }

    public static double area(double l){
        return l *l;
    }

    public  static double area (double a, double b){
        return a*b;
    }
}
