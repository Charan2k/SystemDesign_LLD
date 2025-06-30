package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.linux;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Checkbox;

public class LinuxCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("Linux Checkbox");
    }
    
}
