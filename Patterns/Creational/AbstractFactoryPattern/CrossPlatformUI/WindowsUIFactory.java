package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Button;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Checkbox;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.windows.WindowsButton;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.windows.WindowsCheckbox;

class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
}
