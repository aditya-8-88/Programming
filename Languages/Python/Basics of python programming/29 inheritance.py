# inheritance is the act of copying or stealing functions and variables from parent/base class to chile/derived class
# multi level inheritance ---> it involves inheritance of data from 'one class to several classes' as well as 'one to other and other to another... '
# multiple inhertances ---> inheriting multiple classes in one class
# method over riding(over riding the data of parent class) is process where we see how python actually works (see Example 8)
# isinstance(function_name, class_name) ---> checks if function_name present in class_name
# issubclass(class1_name, class2_name) ---> checks if class1_name is sub class of class2_name
#
# __init__,__doc__,__name__ etc are called dunder/magic methods
# polymorphism is a concept in which same thing has multiple forms of doing different tasks.  


# -----------------------------------------EXAMPLE 6:-------------------------------------------
class Phone:
    def __init__(self,brand_name,model_name, price):
        self.brand_name = brand_name
        self.model_name = model_name
        self._price = max(price,0) #----this is simple trics for checking negative value----
        # if price > 0: #----checking for negative price----
        #     self._price = price
        # else:
        #     self._price = 0

        # self.complete_specification = f"{self.brand_name} {self.model_name} and price is {self._price}"
    @property #----------this decorator will make us call complete_specification method without () , see last line of program
    def complete_specification(self):
        return f"{self.brand_name} {self.model_name} and price is {self._price}"
    def price(self,new_price):
        self._price = max(new_price,0)
    def make_a_call(self,phone_number):
        print(f'calling {phone_number}')
    def full_name(self):
        return f'{self.brand_name} {self.model_name}'
phone1 = Phone('Nokia', '1100', -1000)
print(phone1.full_name())
# phone1._price = -500
latest_price=phone1.price(phone1._price)
# print(latest_price)
print(phone1.complete_specification,'\n')


# -----------------------------------------EXAMPLE 7:(inheritance)-------------------------------------------

class SmartPhone(Phone):
    def __init__(self,brand_name,model_name, price,ram,internal_memory):
        super().__init__(brand_name,model_name, price)
        self.ram = ram
        self.internal_memory = internal_memory
    def full_name(self):
        return f'{self.brand_name} {self.model_name} {self.ram} {self.internal_memory}' # some more elements than the previous one
obj1 = SmartPhone('Vivo', 'S1', 15000,'4GB','64GB')
print(obj1.full_name())
#latest_price=obj1.price(obj1._price)
#print(obj1.complete_specification)
print(obj1.__dict__,'\n')

# -----------------------------------------EXAMPLE 7:(method over riding)-------------------------------------------

class Sub_SmartPhone(SmartPhone):
    def __init__(self,brand_name,model_name, price,ram,internal_memory,front_camera,rear_camera):
        super().__init__(brand_name,model_name, price,ram,internal_memory)
        self.front_camera = front_camera
        self.rear_camera = rear_camera
    def full_name(self):
        return f'{self.brand_name} {self.model_name} {self.ram} {self.internal_memory} {self._price} {self.front_camera}' # some more elements than the previous one
obj2 = Sub_SmartPhone('Samsung', 'Pro', 15000,'4GB','64GB','20MP','12MP')
print(obj2.full_name())
#latest_price=obj2.price(obj2._price)
#print(obj2.complete_specification)
#print(obj2.__dict__)
print('below is how pyhton goes like ----> (METHOD RESOLUTION ORDER) \n')
print(help(Sub_SmartPhone))