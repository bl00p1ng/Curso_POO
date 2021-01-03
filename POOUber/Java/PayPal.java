public class PayPal extends Payments {

    String email;

    public PayPal(Integer id, String email) {
        
        super(id);
        this.email = email;

    }

    void printPaypalInfo() {

        System.out.println("PayPal Email →" + email);

    }
    
}
