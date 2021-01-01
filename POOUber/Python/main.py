from uberX import UberX
from uberPool import UberPool
from uberBlack import UberBlack
from uberSUV import UberSUV
from account import Account

if __name__ == "__main__":
    # UBER X
    uberX = UberX("ADF875", Account("Felipe López", "GSG458"), "Chevrolet", "Spark")    
    print(vars(uberX))
    print(vars(uberX.driver))

    # UBER POOL
    uberPool = UberPool("XCV765", Account("Marti Monteller", "G7WBYF837YHD"), "Ford", "Fiesta")
    print(vars(uberPool))
    print(vars(uberPool.driver))

    # UBER BLACK
    uberBlack = UberBlack("HSH625", Account("Alejandra Tabares", "HSB934HUS953N"), ["Renault Duster"], ["Cuero", "Tela"])
    print(vars(uberBlack))
    print(vars(uberBlack.driver))

    # UBER SUV
    uberSUV = UberSUV("JKS098", Account("Juan Londoño", "LKDS89KLMSD6"), ["Tesla Model X"], ["Cuero"])
    print(vars(uberSUV))
    print(vars(uberSUV.driver))