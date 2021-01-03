class CarAdvanced extends Car {

    constructor(license, driver, typeCarAccepted, seatsMaterial) {

        super(license, driver)
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }

    printCarInfo() {

        console.log(`License → ${this.license}`);
        console.log(`Driver Name → ${this.driver.name}`);
        console.log(`Driver Document → ${this.driver.document}`);

        for (const type of typeCarAccepted) {

            console.log(`Type → ${type}`);

        }

        console.log("Seats Material ↓");
        for (const material of this.seatsMaterial) {
            
            console.log(material);
        }

    }
    
}