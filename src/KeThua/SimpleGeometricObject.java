package KeThua;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public SimpleGeometricObject() {
        dateCreated = new Date();
    }
    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}

 class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;
    // Other methods are omitted

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     // Override the toString method defined in the superclass
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

     public static void main(String[] args) {
        Date d= new Date();
       SimpleGeometricObject  circle = new CircleFromSimpleGeometricObject();
        ((CircleFromSimpleGeometricObject) circle).setRadius(10);
         circle.setColor("red");
         circle.getColor();
        System.out.println(circle);
         System.out.println(circle.getClass());
         System.out.println(circle.hashCode());
     }
}
