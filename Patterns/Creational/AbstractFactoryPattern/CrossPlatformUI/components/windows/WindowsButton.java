package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.windows;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Win Button");
    }
}