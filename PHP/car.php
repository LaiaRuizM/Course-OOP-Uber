<?php

require_once "Account.php";

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
}

