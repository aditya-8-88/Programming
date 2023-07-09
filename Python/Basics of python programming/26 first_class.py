# in this block we have classes, decorators.

# -----------------------------------------EXAMPLE 1:-------------------------------------------
class Person:
     def __init__(self, first_name, last_name, age):
        print('hello world')
        self.first_name = first_name
        self.last_name = last_name
        self.age = age

obj1 = Person('Aditya','Singh',4)
print(obj1.first_name)
obj2 = Person('Vishal','Singh',1)
print(obj2.age)
print()


# # ---------------------------------------EXAMPLE 2:----------------------------------------
class Family:
    def __init__(self, f_name, m_name, b_name, members):
        self.father_name = f_name
        self.mother_name = m_name
        self.brother_name = b_name
        self.members = members

    def info(self):         # here we defined "info" as a "INSTANCE METHOD" method
        return f"{self.father_name} {self.mother_name} {self.brother_name} {self.members}"

obj_rohan = Family('Chanchal', 'Tapasi', 'Soham', 4)
obj_megh = Family('Tripurari', 'Bithika', None, 3)

print(obj_rohan.info())         # print(Family.info(obj_rohan))
print(obj_megh.info())          # print(Family.info(obj_megh))
print()

# -----------------------------------------EXAMPLE 3:-------------------------------------------
class Person:
    def __init__(self, f_nme, l_name, age): # default constructor
        self.first_name = f_nme
        self.last_name = l_name
        self.age = age
    
    @classmethod # pre defined decorator in python
    def for_string(cls,string): # my constructor, we use cls just self in instance methods
        first,last,age = string.split(',')
        return cls(first,last,int(age))
    
    def age_checking(self):       # INSTANCE METHOD' ---> works for all objects
        if self.age >= 18:
            return f"yes, The person  '{self.first_name}'' is adult"
        return f"discount_percent, The person '{self.first_name}' is discount_percentt adult"

obj_rohan = Person('Rohan', 'Mukherjee', 24)
obj_soham = Person('Soham', 'Mukherjee', 16)
obj_emon = Person('Baisakhi', 'Chakraborty', 22)
p1 = Person.for_string('Harshit,Vashitha,24')

print(obj_rohan.age_checking())
print(obj_soham.age_checking())
print(obj_emon.age_checking())
print(p1.age_checking())
print()

# -----------------------------------------EXAMPLE 4:-------------------------------------------
class Laptop:
    discount_percent = 40 # it is class variable
    def __init__(self, brand, m_name, price):
        self.brand = brand
        self.model_name = m_name
        self.price = price

    @staticmethod # pre defined decorator
    def hello(): # it neither takes self nor cls
        print('hi, static method is been called')

    def discount(self):
        print(f"original price is : {self.price}")
        print(f"your discount : {self.price*(self.discount_percent/100)}") # calling class variable with class name 'Laptop' here
        return f"after {self.discount_percent} dicount price is : {self.price-(self.price*(self.discount_percent/100))}"

laptop1 = Laptop('HP', 'PV12345', 50000)
laptop1.discount_percent = 50 # a way to manually set-up discount on laptop since 40 is set as default (see after class declaration)
print(laptop1.discount())
Laptop.hello()
print()


# -----------------------------------------EXAMPLE 5:(using class instance)  not working properly for some reasons-------------------------------------------
class Person1:
    count_instances = 0
    def __init__(self, f_nme, l_name, age):
        Person1.count_instances #+=1 # getting an error here
        self.first_name = f_nme
        self.last_name = l_name
        self.age = age
    
    @classmethod # pre defined decorator in python
    def count_instances(cls):
        return f"You have created {cls.count_instances} instances of {cls.__name__} class"
       
    def age_checking(self):       # these method is 'INSTANCE METHOD', which works with all objects
        if self.age >= 18:
            return f"yes, The person  '{self.first_name}'' is adult"
        return f"discount_percent, The person '{self.first_name}' is discount_percentt adult"

obj_rohan = Person1('Rohan', 'Mukherjee', 24)
obj_soham = Person1('Soham', 'Mukherjee', 16)
obj_emon = Person1('Baisakhi', 'Chakraborty', 22)

#print(obj_rohan.age_checking())
#print(obj_soham.age_checking())
#print(obj_emon.age_checking())
print(Person1.count_instances())
print()