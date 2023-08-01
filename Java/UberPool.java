package Java;

class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver); // As if you called the constructor method of the car class and printDataCar method.
        this.brand = brand;
        this.model = model;
    }
}