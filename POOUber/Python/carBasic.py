from car import Car

class CarBasic(Car):
    brand = str
    model = str

    def __init__(self, license, driver, brand, model):
        super(CarBasic, self).__init__(license, driver)
        self.brand = brand
        self.model = model