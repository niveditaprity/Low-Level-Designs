package Design_Pattern.Creational.AbstractFactory;

public class MacCheckBox implements  CheckBox{
    @Override
    public void toggle() {
        System.out.println("Toggling a CheckBox of Mac");
    }
}
