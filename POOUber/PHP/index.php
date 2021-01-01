<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("AW456", new Account("Andres López", "AMS123"));
$car->printDataCar();

?>