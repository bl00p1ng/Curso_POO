from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("ADF875", Account("Felipe López", "GSG458"))       
    print(vars(car))
    print(vars(car.driver))