package Design_Pattern.Creational.Prototype;

public class Circle implements  Prototype{
    public double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public double Area() {
        return Math.PI*radius*radius;
    }
}
