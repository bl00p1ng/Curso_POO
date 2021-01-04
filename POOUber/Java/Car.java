public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
        passenger = 4;
        System.out.println("Passengers → " + passenger);
    }

    void printDataCar() {
        
        if (license != null && driver != null && passenger != null) {
            
            System.out.println("License: " + license + " - Driver: " + driver.name + " Passengers: " + passenger);

        } else {

            System.err.println("⚠  Aegurate de completar todos los campos");

        }
        
    }

    public Integer getPassenser() {

        return passenger;

    }

    public void setPassenger(Integer passenger) {

        if (passenger == 4) {
            
            this.passenger = passenger;
            
        } else {

            System.err.println("⚠  Necesitas asignar por lo menos 4 pasajeros");

        }

    }

}
