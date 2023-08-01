from account import Account # We import the class to be able to use it.

class Car:
    id          = int
    license     = str
    driver      = Account("","") # Driver -> is now type Account with the mandatory data to instantiate an object of this type.
    passenger   = int
    
    def __init__(self, license, driver):
       self.license = license
       self.driver = driver 