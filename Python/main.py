# Import the element, car = file name, Car = class name (element that I want to bring here)
# We import the two classes we will use and instantiate them in the constructor methods.
from car import Car;
from account import Account;
# from User import User;

if __name__ == "__main__":
    print("Hi, I am using Python!")
    car = Car("AMS234", Account("Andrés Herrera", "AND123"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("QWE567", Account("Lourdes Herrera", "ANDA876"))
    print(vars(car2))
    print(vars(car2.driver))
    
    print("User")
    user = Account("Nacho Figueroa", "NFSD3781H", "nach@gmail.com", "24683274928")
    print(vars(user))

# if __name__ == "__main__":
#     print("Hi, I am using Python here")
#     car = Car()
#     car.license = "AMS234"
#     car.driver = "Andrés Herrera"
#     print(vars(car))
    
#     car2 = Car()
#     car2.license = "QWE567"
#     car2.driver = "Lourdes Herrera"
#     print(vars(car2))