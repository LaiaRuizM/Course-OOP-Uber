package Java;

class UberBlack extends Car {
    // We declare the attributes that are only UberBlack's attributes
    Map<String, Map<String, Integer>> typeCarAccepted;



    //todo Constructor method:
    public UberBlack(String license, Account driver){
        super(license, driver); // As if you called the constructor method of the car class and printDataCar method.
    }
}
