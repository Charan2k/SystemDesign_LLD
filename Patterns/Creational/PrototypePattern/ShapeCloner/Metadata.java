package Patterns.Creational.PrototypePattern.ShapeCloner;

public class Metadata implements Cloneable{
    private String createdBy;
    private String lastEditedBy;

    public String getLastEditedBy() {
        return lastEditedBy;
    }

    public void setLastEditedBy(String lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    Metadata(String createdBy, String lastEditedBy) {
        this.createdBy = createdBy;
        this.lastEditedBy = lastEditedBy;
    } 

    public void displayDetails() {
        System.out.println("METADATA");
        System.out.println("Created By: " + createdBy);
        System.out.println("Last Edited By: " + lastEditedBy);
    }

    public Metadata clone() throws CloneNotSupportedException{
        return (Metadata)super.clone();
    }
    
}
