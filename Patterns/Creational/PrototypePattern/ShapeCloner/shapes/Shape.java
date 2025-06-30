package Patterns.Creational.PrototypePattern.ShapeCloner.shapes;

import Patterns.Creational.PrototypePattern.ShapeCloner.Color;
import Patterns.Creational.PrototypePattern.ShapeCloner.Metadata;

abstract class Shape implements Cloneable {
    public int xPos, yPos;
    public Color color;
    public Metadata metadata;

    abstract void displayDetails();
    public Metadata getMetadata() {
        return metadata;
    }
}
