<?php

require_once "account.php";

class Car {
    //Atributtes
    public $id;  
    public $license;   
    public $driver;   
    public $passenger;  
    
    //Constructor method with two parameters
    public function __construct($license, Account $driver){
        $this->license = $license; //Keyword: this
        $this->driver = $driver;
    }

    //Method stated to print the data
    public function printDataCar(){
    echo 
    "License: ".$this->license. 
    " Driver: ".$this->driver->name.
    " Document: ".$this->driver->document; //To bring driver object which is from Account, we have to declare the Account.php file -> require_once "Account.php"
    }

    //Getter -> Return the value of the passenger property:
    public function getPassenger() {
        return $this->passenger;
    }

    //Setter -> To make our setter function we need to do some validation. Uber only allows us to have 4 passengers (behavior that we will modify later with polymorphism), so our setter function would look like this:

    public function setPassenger($passenger) {  
        if ($passenger == 4) {
            $this->passenger = $passenger;
        }
        else {
            echo "You need to assign 4 passengers";
        }
    }
}

