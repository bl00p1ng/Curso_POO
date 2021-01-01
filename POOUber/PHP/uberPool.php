<?php
require_once('carBasic.php');

class UberPool extends CarBasic {

    public function __construct($license, $driver, $brand, $model) {

        $this->license = $license;
        $this->driver = $driver;
        $this->brand = $brand;
        $this->model = $model;

    }

}

?>