package OOP;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }


}
class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Chương");
        student.setClasses("C0222H1");
        System.out.println("Tên học viên : " +student.getName() + " \nLớp : " +student.getClasses());

    }
}
