package Java;

class Car {
    Integer id;
    String license;
    Account driver; //We need Account class bc we need different information about the driver such as name and document. 
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + " Name Driver: " + driver.name);
    }
}


// printDataCar = method