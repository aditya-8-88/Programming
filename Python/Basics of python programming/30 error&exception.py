# -----------------------------------------EXAMPLE 1:-------------------------------------------
class Animal:
    def __init__(self,name):
        self.name = name
    def sound(self):
        # we use raise keyword to raise an error
        raise NotImplementedError('you haven\'t defined sound function in all subclasses.') # raising error by ourself

class Dog(Animal):
    def __init__(self,name, breed):
        super().__init__(name)
        self.breed = breed
    def sound(self):
        return 'bhow bhow'

class Cat(Animal):
    def __init__(self,name, breed):
        super().__init__(name)
        self.breed = breed
    #def sound(self):
     #   return 'meaow meaow'

doggy = Dog('jack','pug')
print(doggy.sound(),'\n')
#kitty = Cat('hello','meaosdo')
#print(kitty.sound(),'\n')


 # -----------------------------------------EXAMPLE 2:-------------------------------------------
class Mobile:
    def __init__(self, name, no):
       self.name = name
       self.no = no

class MobileStore:
    def __init__(self):
        self.mobiles = []

    def add_mobile(self,new_mobile):
        if isinstance(new_mobile, Mobile):
            self.mobiles.append(new_mobile)
            #print(self.mobiles)
        else:
            raise TypeError('new mobile should be object of Mobile class')

onePlus = Mobile('one plus pro',24) 
str1 = 'samsung galaxy s8'
objMS1 = MobileStore() # MobileStore object 1
#print(objMS1.mobiles)
objMS1.add_mobile(onePlus)
obj2 = objMS1.mobiles
print(obj2[0].name,'\n')


# -----------------------------------------EXAMPLE 3(EXCEPTION HANDLING):-------------------------------------------
while True: # infinite loop till user enters correct value
    try:
        age = int(input('enter your age:'))
        #break
    except ValueError:
        print('maybe you entered string instead of number , try again')
    except:
        print('unexpected error ..')
    else: # it runs ony when try successfully runs (i.e., without exection 
        print(f'you entered {age}')
        break
    finally: # it always runs(even in case of exception)
        print('Hi')

if age < 18:
    print('You can\'t play this game.\n')
else:
    print('you can play this game.\n')
    
# -----------------------------------------EXAMPLE 4(EXCEPTION HANDLING):-------------------------------------------

def divide(a,b):
    try:
        return a/b
    except ZeroDivisionError as err:
        # print(’you cannot divide a number by zero’)
        print(err)
    except TypeError as err:
        print('numbers must be mot or f1oats')
    except :
        print('unexpected error')
print(divide(10,2),'\n')

# -----------------------------------------EXAMPLE 4(CREATING OWN EXCEPTION ):-------------------------------------------
class NameTooShortError(ValueError):
    pass
    def validate(name):
        if len(name) < 8:
            raise NameTooShortError('name is too short')
    username = input('Enter your name : ')
    validate(username)
    print(f'hello {username}')
# Name TooShort