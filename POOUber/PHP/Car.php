<?php
require_once('account.php');

class Car {
  
  public $id;
  public $licence;
  public $driver;
  public $passengers;

  public function __construct($license, Account $driver){

    $this->license = $license;
    $this->driver = $driver;

  }

  public function PrintDataCar(){

    echo "License: ", $this->license, " -  Driver: ", $this->driver->name;

  }
}

?>