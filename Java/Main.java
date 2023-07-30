 package Java;
class Main {

    // two objects (car and car2) from car class:
    public static void main(String[] args) {
        System.out.println("Good morning");
        Car car = new Car();  // type of object + name of the object = new + constructor method
        car.license = "AMQ123"; //licence, driver, etc are attributes
        car.driver = "Andrés Herrera";
        car.passenger = 4;
        System.out.println("Car license: " + car.license);

        Car car2 = new Car();  
        car2.license = "QWE567";
        car2.driver = "Andrea Herrera";
        car2.passenger = 3;
        System.out.println("Car license: " + car2.license);
    }
}


// Program entry point
