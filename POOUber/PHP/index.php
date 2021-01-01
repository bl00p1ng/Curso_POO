<?php

require_once('uberX.php');
require_once('uberPool.php');

$uberX = new UberX("DFJ159", new Account("Andrés López", "AND741G779"), "Chrevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("FHV648", new Account("Felipe López", "FLPLPZ061201"), "Ford", "Fiesta");
$uberPool->printDataCar();

?>