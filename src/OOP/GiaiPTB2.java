package OOP;

public class GiaiPTB2 {
    private double a;
    private double b;
    private double c;

    public GiaiPTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double getDeta() {
        return b * b - 4 * a * c;
    }

    public double getNghiem1() {
        return (-b + Math.pow(getDeta(), 0.5)) / (2 * a);
    }

    public double getNghiem2() {
        return (-b - Math.pow(getDeta(), 0.5)) / (2 * a);
    }public double getNghiemKep(){
        return -b/2*a;
    }
    @Override
    public String toString() {
        return a + "x^2 + " + b + " + " + c + "=0";
    }
}

class main {
    public static void main(String[] args) {
        GiaiPTB2 pt1=new GiaiPTB2(1,6,3);
        System.out.println(pt1);
        if(pt1.getDeta()<0){
            System.out.println("Phương trình vô nghiệm");
        }else if(pt1.getDeta()==0){
            System.out.println("Phương trình có nghiệm kép"+pt1.getNghiemKep());
        }else {
            System.out.println("Phương trình có hai nghiệm:\n" + "x1 = " + pt1.getNghiem1() +"\n x2=" + pt1.getNghiem2()) ;
        }
    }

}

