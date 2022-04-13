package KeThua;

public class Point2D {
    double x = 0;
    double y = 0;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double X,Double Y){
        this.x=X;
        this.y=Y;
    }
    public double [] getXY(){
        return new double[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Point3D extends Point2D{
    double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double [] getXYZ(){
        return new double[]{this.x,this.y,this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
class HienThi{
    public static void main(String[] args) {
        Point2D point2D=new Point2D(1,2);
        System.out.println(point2D);

        Point3D point3D=new Point3D(5,6,8);
        System.out.println(point3D);

    }
}
