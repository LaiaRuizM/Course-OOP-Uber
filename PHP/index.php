<?php
require_once "Car.php";
require_once "Account.php";

$car = new Car('ABC123', new Account('Laia Ruiz', 'LRM27'));
    $car->printDataCar();

//    echo 'Hi World';
