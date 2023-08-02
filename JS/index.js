//Equivalent place to the entry point of the application where we will be declaring our objects based on the classes
//call object car:
let car = new Car("AAW456", new Account("Andrés Herrera", "QWE234")); //To instantiate an object we will continue to use the "new" keyword.
car.passenger = 4;
car.printDataCar();

let uberX = new UberX(
  "ASW416",
  new Account("Andrea Ferreiro", "ANDA765"),
  "Chevrolet",
  "Spark"
);
uberX.passenger = 4;
uberX.printDataCar();

let user = new User("Núria Ruiz", "DNI123", "nur@gmail.com", "012e");
user.printDataUser();
