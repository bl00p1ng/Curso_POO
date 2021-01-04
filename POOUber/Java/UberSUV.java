import java.util.ArrayList;
import java.util.Map;

class UberSUV extends CarAdvanced {    
    
    protected Integer passenger;

    public UberSUV(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {

        super(license, driver, typeCarAccepted, seatsMaterial);

    }

    @Override
    public void setPassenger(Integer passenger) {

        if (passenger == 6) {

            this.passenger = passenger;

        }

    }

}
