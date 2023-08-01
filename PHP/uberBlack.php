<?php
require_once("car.php"); 
class UberBlack extends Car { //Declare two global attributes which were pendings to UberBlack model
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, Account $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license, $driver);  
        $this->typeCarAccepted = $typeCarAccepted; 
        $this->seatsMaterial = $seatsMaterial; 
    }
}
?>