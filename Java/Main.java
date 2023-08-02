package Java;
class Main {

    public static void main(String[] args) {
        System.out.println("Good morning");
        Account account = new Account("Andrés Herrera", "AND123", "handres@gmail.com", "123456");
        UberX uberX = new UberX("AMQ123", account, "Chevrolet", "Sonic");
        //uberX.passenger = 3; //An uberX can have 4 empty seats, not only 3, so we should encapsulate this information. We modificate this information in Car.java class adding an access modifier because there is where we have the passenger attribute.
        uberX.printDataCar(); 

        // Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876", "handrea@hotmail.com", "7890"));  
        // car2.passenger = 3;
        // car2.printDataCar();
    }
}


