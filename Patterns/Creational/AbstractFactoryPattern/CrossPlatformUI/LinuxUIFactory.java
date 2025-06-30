package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Button;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Checkbox;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.linux.LinuxButton;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.linux.LinuxCheckbox;

public class LinuxUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

}
