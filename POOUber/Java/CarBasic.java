class CarBasic extends Car {

    String brand;
    String model;

    public CarBasic(String license, Account driver, String brand, String model) {

        super(license, driver);
        this.brand = brand;
        this.model = model;

    }

}
