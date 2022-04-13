package KeThua;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
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
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double [] getXY(){
        return new double[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class  MoveablePoint extends Point{
    private double xSpeed;
    private double ySpeed;

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){

    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(double xSpeed,double ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public double [] getSpeed(){
        return new double[]{this.xSpeed,this.ySpeed};
    }
    public MoveablePoint Move(){
       setX(getX()+xSpeed);
       setY(getY()+ySpeed);
       return this;
    }


}
class Main{
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint(1,2);
        moveablePoint.setXY(6,7);
        System.out.println(moveablePoint.Move());
    }
}
