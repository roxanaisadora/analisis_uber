var car = new Car("ASDF3652", new Account("Andrea Sanchez", "ASD123365214", "andrea@platzi.pe","2365214"))
car.passenger = 4;
car.printDataCar();

console.log("UberX")
var uberX = new UberX("DFGG5942", new Account("Marcos Caceres", "DFG236589","marcosc@platzi.pe","569324"),"toyota", "corolla")
uberX.passenger = 6;
uberX.printDataUberX();

console.log("****User****")
var user = new User("Damian Rios", "KLOIS12536", "damian@platzi.pe","523698563")
user.printDataUser();