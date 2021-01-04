public class Car {
    private Integer id;
    private String license;
    private Account driver;
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

    public Integer getPassenger() {

        return passenger;

    }

    public void setPassenger(Integer passenger) {

        if (passenger == 4) {
            
            this.passenger = passenger;
            
        } else {

            System.err.println("⚠  Necesitas asignar por lo menos 4 pasajeros");

        }

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    

    

}
