package Patterns.Creational.PrototypePattern.ShapeCloner;

import Patterns.Creational.PrototypePattern.ShapeCloner.shapes.Circle;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(6, 9, Color.RED, new Metadata("Charan", "Charan"));
        Circle circle2 = (Circle) circle1.clone();

        circle1.displayDetails();;
        circle2.displayDetails();

        circle2.color = Color.BLUE;
        circle2.getMetadata().setLastEditedBy("Patrick");
        circle1.displayDetails();
        circle2.displayDetails();

    }
}
