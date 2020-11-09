<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberX.php");
require_once("user.php");
require_once("account.php");


$car = new Car("KOILA123", new Account("Gonzalo Rivera", "ASD12369","gonzalo@platzi.pe", "1253698"));
$car->printDataCar();

$uberX = new UberX("ASHA1258", new Account("Rolando Villa", "PÑLOI3256","rolando@platzi.pe", "1255633"), "Toyota", "Corolla");
$uberX->printDataUberX();

$user = new User("Mario Villa", "SDF125369","mario@platzi.pe", "4523699");
$user->printDataUser();
?>