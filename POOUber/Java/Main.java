public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.license = "AMQ258";
        car.driver = "Andrés López";
        car.passenger = 4;

        System.out.println("Car License: " + car.license);
        System.out.println("Car Driver: " + car.driver);
        System.out.println("Car Passengers: " + car.passenger);        

    }

}