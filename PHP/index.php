<?php
require_once "car.php";
require_once "uberX.php";
require_once "uberPool.php";
require_once "account.php";

//Creating an object (variable) of uberX type in PHP:
$uberX = new UberX('ABC123', new Account('Laia Ruiz', 'LRM27'), "Chevrolet", "Spark");
//Inheritance to print and see the data:
$uberX->printDataCar();

$uberPool = new uberPool('TYU567', new Account('Andrea Ferran', 'ANDA765'), "Dodge", "Attitude");
$uberPool->printDataCar();
?>
