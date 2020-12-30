public class Main {

    public static void main(String[] args) {

        Car car = new Car("AMQ258", new Account("Andrés López", "AND123"));
        car.passenger = 4;
        car.printDataCar();                

    }

}