# import the element, car = file name, Car = class name (element that I want to bring here)
from car import Car;

if __name__ == "__main__":
    print("Hi, I am using Python here")
    car = Car()
    car.license = "AMS234"
    car.driver = "Andrés Herrera"
    print(vars(car))
    
    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Lourdes Herrera"
    print(vars(car2))