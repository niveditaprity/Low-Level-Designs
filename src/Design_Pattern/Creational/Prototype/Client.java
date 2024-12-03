package Design_Pattern.Creational.Prototype;

import java.util.concurrent.Callable;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println("circle1 Area is:" + circle.Area());
        Circle circle2 = (Circle)circle.clone();
        circle2.setRadius(5.0);
        System.out.println("circle1 Area is:" + circle2.Area());


    }
}
