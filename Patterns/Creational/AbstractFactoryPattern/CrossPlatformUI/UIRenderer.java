package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI;

import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Button;
import Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI.components.Checkbox;



public class UIRenderer {
    public static void main(String[] args) {
        UIFactory uiFactory = PlatformUIFactory.getPlatformUI(PlatformType.MAC);
        Button button = uiFactory.createButton();
        Checkbox checkbox = uiFactory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
