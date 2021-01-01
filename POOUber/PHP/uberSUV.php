<?php
require_once('carAdvanced.php');

class UberSUV extends CardAdvanced {

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){

        parent::__construct($license,$driver);

    }

}

?>