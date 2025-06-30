package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.mac;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac Checkbox");
    }
}