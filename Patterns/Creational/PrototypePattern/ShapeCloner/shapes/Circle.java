package Patterns.Creational.PrototypePattern.ShapeCloner.shapes;

import Patterns.Creational.PrototypePattern.ShapeCloner.Color;
import Patterns.Creational.PrototypePattern.ShapeCloner.Metadata;

public class Circle extends Shape {
    public Circle(int xPos, int yPos, Color color, Metadata metadata) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
        this.metadata = metadata;
    }

    public Shape clone() throws CloneNotSupportedException{
        Circle circle = (Circle)super.clone();
        circle.metadata = metadata.clone();
        return circle;
    }

    @Override
    public void displayDetails() {
        System.out.println("X Pos : " + xPos);
        System.out.println("Y Pos : " + yPos);
        System.out.println("Color: " + color);
        metadata.displayDetails();
    }
}