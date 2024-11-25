package Design_Pattern.Creational.AbstractFactory;

public class MacFactory implements  GUIFactory{
    @Override
    public CheckBox generateCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public Button generateButton() {
        return new MacButton();
    }
}
