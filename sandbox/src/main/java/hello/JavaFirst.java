package hello;

public class JavaFirst {

    public static void main(String[] args) {
        hello("world");
        hello("user");

        Square s =  new Square(5);
        System.out.println("Area = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Area2 = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("hello, " + somebody);
    }

}
