package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.mac;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac Button");
    }
}