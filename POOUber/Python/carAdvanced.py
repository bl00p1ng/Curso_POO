from car import Car

class CarAdvanced(Car):
    typeCarAccepted = []
    seatsMaterial   = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super(CarAdvanced, self).__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial   = seatsMaterial