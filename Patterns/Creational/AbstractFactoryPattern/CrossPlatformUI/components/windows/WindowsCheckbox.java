package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.windows;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Win Checkbox");
    }
}