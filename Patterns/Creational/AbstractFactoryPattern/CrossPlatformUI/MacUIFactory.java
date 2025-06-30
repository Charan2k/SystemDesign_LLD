package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Button;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Checkbox;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.mac.MacButton;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.mac.MacCheckbox;

class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
