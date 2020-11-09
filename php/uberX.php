<?php

require_once('account.php');
class UberX extends Car {
    public $brand;
    public $model;
    public function __construct($license, $driver, $model, $brand){
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
     }
    public function printDataUberX() {
        echo "UberX";
        echo"<br>";
        echo "Licencia: $this->license Brand: $this->brand Model: $this->model Driver: ".$this->driver->name;
        echo "<br>";
    }
}
?>