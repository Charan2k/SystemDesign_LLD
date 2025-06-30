package Patterns.Creational.PrototypePattern.ShapeCloner.shapes;

import Patterns.Creational.PrototypePattern.ShapeCloner.Color;
import Patterns.Creational.PrototypePattern.ShapeCloner.Metadata;

class Square extends Shape {
    public Square(int xPos, int yPos, Color color, Metadata metadata) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
        this.metadata = metadata;
    }

    public Shape clone() throws CloneNotSupportedException{
        Square square = (Square)super.clone();
        square.metadata = metadata.clone();
        return square;
    }

    @Override
    public void displayDetails() {
        System.out.println("X Pos : " + xPos);
        System.out.println("Y Pos : " + yPos);
        System.out.println("Color: " + color);
        metadata.displayDetails();
    }
}