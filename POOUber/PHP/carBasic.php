<?php

class CarBasic extends Car {

    public $brand;
    public $model;

    public function __construct($license, $driver, $brand,, $model) {
        
        parent::__construct($license, $driver, $brand. $model);
        $this->brand = $brand;
        $this->model = $model;

    }

}

?>