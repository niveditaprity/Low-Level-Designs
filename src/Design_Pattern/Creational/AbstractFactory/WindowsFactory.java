package Design_Pattern.Creational.AbstractFactory;

public class WindowsFactory implements  GUIFactory{
    @Override
    public Button generateButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox generateCheckBox() {
        return new WindowsCheckBox();
        };
    }
