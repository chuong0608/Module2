package OOP;


    public class Car {

        private String name;

        private String engine;



        public static int numberOfCars;



        public Car(String name, String engine) {

            this.name = name;

            this.engine = engine;

            numberOfCars++;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }
    }

class TestPropertyCar{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Toyota","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
