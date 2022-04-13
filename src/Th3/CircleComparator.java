package Th3;
import java.util.Arrays;
import java.util.Comparator;
import OOP.Circle;

public class CircleComparator implements Comparable<OOP.Circle> {
    @Override
    public int compareTo(Circle o) {
        return 0;
    }
}
class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo");

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }


        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
