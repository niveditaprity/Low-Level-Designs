package Design_Pattern.Creational.AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering a Windows Button");

    }
}
