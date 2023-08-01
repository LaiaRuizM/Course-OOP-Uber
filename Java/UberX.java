package Java;

// public class UberX {
    
// }

class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); // As if you called the constructor method of the car class and printDataCar method.
        this.brand = brand;
        this.model = model;
    }
}

// If we put super., we have access to the attributes of the parent class.
// So, SUPER will refer to the attributes and methods of the super class and THIS will refer to the attributes of the child class.