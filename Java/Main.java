package Java;
class Main {

    public static void main(String[] args) {
        System.out.println("Good morning");
        Account account = new Account("Andrés Herrera", "AND123", "handres@gmail.com", "123456");
        UberX uberX = new UberX("AMQ123", account, "Chevrolet", "Sonic");
        uberX.passenger = 4;
        uberX.printDataCar(); 

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876", "handrea@hotmail.com", "7890"));  
        car2.passenger = 3;
        car2.printDataCar();
    }
}


