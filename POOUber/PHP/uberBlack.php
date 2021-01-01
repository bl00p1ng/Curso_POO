<?php
require_once('carAdvanced.php');

class UberBlack extends CardAdvanced {

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){

        $this->license = $license;
        $this->driver = $driver;
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;

    }

}

?>