package OOP;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Chương");
        System.out.println("My name is: " + person.getName());
    }

    public static class Person {
        private String name;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }

}
