<?php
require_once "car.php";
require_once "uberX.php";
require_once "uberPool.php";
require_once "account.php";
require_once "payment.php";
require_once "cash.php";
require_once "payPal.php";
require_once "card.php";
require_once "user.php";

//Creating an object (variable) of uberX type in PHP:
$uberX = new UberX('ABC123', new Account('Laia Ruiz', 'LRM27'), "Chevrolet", "Spark");
//Inheritance to print and see the data:
$uberX->printDataCar();

$uberPool = new UberPool('TYU567', new Account('Andrea Ferran', 'ANDA765'), "Dodge", "Attitude");
$uberPool->printDataCar();

$cash = new Cash("CASH");
$cash->printDataPayment();

$payPal = new PayPal("PAYPAL", "oopUber@gmail.com");
$payPal->printDataPayment();

$card = new Card("CARD", "1234ZXCVBNMASDF", "012", "02/30");
$card->printDataPayment();

$user = new User("Laia Ruiz", "LR0123", "lrm@gmail.com", "*lr/");
$user->printDataUser();

?>
