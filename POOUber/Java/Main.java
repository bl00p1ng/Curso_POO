public class Main {

    public static void main(String[] args) {

        // CAR
        Car car = new Car("AMQ258", new Account("Andrés López", "AND123"));
        car.passenger = 4;
        car.printDataCar();
        
        // UBERX
        UberX uberX = new UberX("HZI833", new Account("Felipe Molina", "HS73N73HD73JD"), "Ford", "Focus");
        uberX.printCarInfo();

        // CARD
        Card card = new Card(3246, 5429983212272529L, (short)611, "06/23");
        card.printPaymentId();
        card.printCardInfo();

        // PAYPAL
        PayPal paypal = new PayPal(3645, "andres@example.com");
        paypal.printPaymentId();
        paypal.printPaypalInfo();

        // CASH
        Cash cash = new Cash(2454);
        cash.printPaymentId();

    }

}