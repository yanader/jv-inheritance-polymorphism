package vehicles;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("2010", "Micra");
        Motorcycle tesla = new Motorcycle("2010", "model e", true);

//        toyota.start();
//        toyota.drive();
        tesla.start();
//        tesla.accelerate();
        tesla.drive();
    }
}
