<?php
require_once("car.php"); 
class UberVan extends Car { 
    public $typeCarAccepted;
    public $seatsMaterial;
    //protected $passenger; -> In PHP add this property is not necessary

    public function __construct($license, Account $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license, $driver); 
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    //Override:
    public function setPassenger($passenger) {
        if ($passenger == 6) {
            $this->passenger = $passenger;
        }
        else {
            echo "You need to assign 6 passengers in UberVan";
        }
    }
}
?>