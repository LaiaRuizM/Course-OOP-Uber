package Java;

import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    // We declare the attributes that are only UberBlack's attributes
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;


    //todo Constructor method:
    public UberBlack(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver); // As if you called the constructor method of the car class and printDataCar method.
    }
}
