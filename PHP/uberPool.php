<?php
require_once("car.php"); 
class UberPool extends Car { //Same syntax as Java
    public $brand;
    public $model;

    public function __construct($license, Account $driver, $brand, $model){
        parent::__construct($license, $driver);  //Equivalent to "super" in Java
        $this->brand = $brand; //New additional data
        $this->model = $model; //New additional data
    }
}
?>