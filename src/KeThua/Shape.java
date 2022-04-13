package KeThua;

public class Shape {
    String color="green";
    boolean filled=true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
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

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
class Circles extends Shape{
    double radius=1.0;

    public Circles(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circles(double radius) {
        this.radius = radius;
    }

    public Circles() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setBaPT(String color,boolean filled,double radius){
        this.color= color;
        this.filled=filled;
        this.radius=radius;
    }
}
