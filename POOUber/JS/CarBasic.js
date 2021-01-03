class CarBasic extends Car {

    constructor(license, driver, brand, model) {

        super(license, driver);
        this.brand = brand;
        this.model = model;

    }

    printCarInfo() {

        console.log(`License → ${this.license}`);
        console.log(`Driver Name → ${this.driver.name}`);
        console.log(`Driver Document → ${this.driver.document}`);
        console.log(`Brand → ${this.brand}`);
        console.log(`Model → ${this.model}`);
        
    }
    
}