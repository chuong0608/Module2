package OOP;

public class THStaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public THStaticMethod(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
 class TestStaticMethod {
    public static void main(String args[]) {
        THStaticMethod.change(); //calling change method

        //creating objects
        THStaticMethod s1 = new THStaticMethod(111, "Hoang");
        THStaticMethod s2 = new THStaticMethod(222, "Khanh");
        THStaticMethod s3 = new THStaticMethod(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
