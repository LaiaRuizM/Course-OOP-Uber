class Account:
    id          = int
    name        = str
    document    = str 
    email       = str
    password    = str
    
    def __init__(self, name, document):
       self.name = name
       self.document = document 
       
# Self -> this reserved word is very similar to other languages with this. And as its name says, it makes reference to the data that compose the class, in this case self.name is calling the attribute name that is in line 3 of the class and, it is assigning the data that is passed in the method __init__ of line 8.