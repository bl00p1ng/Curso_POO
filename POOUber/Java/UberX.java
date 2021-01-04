class UberX extends CarBasic {
    
    public UberX(String license, Account driver, String brand, String model) {
        
        super(license, driver, brand, model);

    }

    @Override
    void printDataCar() {
        
        super.printDataCar();
        System.out.println("Modelo → " + model + " Brand → " + brand);

    }

}
