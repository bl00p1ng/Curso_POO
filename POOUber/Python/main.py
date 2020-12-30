from car import Car

if __name__ == "__main__":
    car = Car()
    car.license = "AMQ678"
    car.driver = "Felipe López"
    car.pasengers = 6
    print(vars(car))