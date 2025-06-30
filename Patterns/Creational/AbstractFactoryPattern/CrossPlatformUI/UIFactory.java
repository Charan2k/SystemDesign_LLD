package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Button;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Checkbox;

interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}