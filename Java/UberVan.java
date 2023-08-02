package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    // We declare the attributes that are only UberBlack's attributes
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    //todo Constructor method:
    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver); // As if you called the constructor method of the car class and printDataCar method.
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    @Override //We override this method that comes from the car class = Polymorphism
    public void setPassenger(Integer passenger) {
        // super.setPassenger(passenger); -> We delete this because is the behaviour of Car class (what is the comparison with 4). 
        // We add the follow and assign passenger as an attribute above (private Integer passenger):
        if(passenger == 6) {
        this.passenger = passenger;
        }else{
            System.out.println("You need to assign 6 passengers"); 
        }
    }
}

// UberVan and UberBlack are the same, we can copy the info!