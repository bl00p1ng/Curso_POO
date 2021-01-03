var car = new Car("AW572", new Account("Andrés López", "ANDL580"))
car.passengers = 4
car.printDataCar()

// UBERX
var uberX = new UberX("SXC53", new Account("Felipe Molina", "UISD6JASD6T832"), "Ford", "Focus")
uberX.passengers = 4;
uberX.printCarInfo();

// UBER BLACK
var uberBlack = new UberBlack("XVY842", new Account("Mariana Arango", "HS7WN27SHJ37JS"), typeCarAccepted = ["Renault Duster"], seatsMaterial = ["Tela", "Cuero"]);
uberBlack.passengers = 6;
uberBlack.printCarInfo();