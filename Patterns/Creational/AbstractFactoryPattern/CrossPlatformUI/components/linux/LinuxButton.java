package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.linux;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Button;

public class LinuxButton implements Button{

    @Override
    public void render() {
        System.out.println("Linux Button");
    }

}
