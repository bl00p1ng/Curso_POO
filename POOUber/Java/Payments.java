public class Payments {

    Integer idPayment;

    public Payments(Integer id) {
        
        this.idPayment = id;

    }

    void printPaymentId() {

        System.out.println("Payment Id → " + this.idPayment);

    }

}