package Th3;

import OOP.Circle;

import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    public int compareTo(ComparableCircle o){
        if ((getRadius()>o.getRadius()))
            return 1;
        else if ((getRadius()>o.getRadius()))
            return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
 class ComparableCircleTest {

     public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo");

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
