package Java;

class Car {
    Integer id;
    String license;
    Account driver; //We need Account class bc we need different information about the driver such as name and document. 
    private Integer passenger; //Modifier of access: private -> because we only want this data (attribute) to be accessed by the class, this way the field car.passenger (in Main.java) won't be visible by Main class but it is visible by Car class (syso -> line 12 and 13 + run Main.java -> we can watch the passenger: 3).

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        // passenger = 3;
        // System.out.println(" Passengers: " + passenger);
    }

    void printDataCar() {
        if(passenger != null){
        System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4) {
        this.passenger = passenger;
        }else{
            System.out.println("You need to assign 4 passengers"); 
        }
    }

    
}


// printDataCar = method
// void = We do not return anything, we assign the data.