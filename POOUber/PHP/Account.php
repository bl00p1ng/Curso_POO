<?php

class Accouunt {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
      }
    
      public function PrintDataCar(){
        echo"license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
      }
}
?>