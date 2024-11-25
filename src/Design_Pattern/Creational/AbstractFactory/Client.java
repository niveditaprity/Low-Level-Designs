package Design_Pattern.Creational.AbstractFactory;

public class Client {

    public static void main(String[] args) {;
        GUIFactory factory = new WindowsFactory();
        factory.generateButton().render();
        factory.generateCheckBox().toggle();
        factory = new MacFactory();
        factory.generateButton().render();
        factory.generateCheckBox().toggle();

    }
}
