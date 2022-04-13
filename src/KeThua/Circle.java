package KeThua;

public class Circle {
    private double radius=0.1 ;
    String color= "red" ;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
}
class Cylinder extends Circle{
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public Double getTheTich(){
        return getArea() * height;
    }
}
class Chuong{
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(3,"red",6);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getTheTich());
    }
}
