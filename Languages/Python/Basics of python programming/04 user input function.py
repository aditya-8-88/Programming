# 1.
# a way by which user can input form keyboard
name = input('What is your name :- ')
# print ('hello '+name)
age = int(input('And your age :- ')) # only strings can be taken as input unlike java
print('hello '+name+' '+'your age is '+age)

# 2.
# A smart way to to take input simultaneously unlike java
name1,age1 = input('enter your name and age comma separating them ').split(",") #split fn helps taking several inputs in 1 line
print('Your name is '+name1+' and your age is '+age1)

# 3.
# A smart way of inputing as well as printing
name2,age2 = input('enter your name and age without separation ').split() #split fn helps taking 2 inputs in 1 line
age2= int(age2)
print(f"your name is {name2} and age is {age2+4}") #a way in python 3.6 and arthematic operations can also be done here like done with age2
print("your name is {} and age is {}".format(name2, age2+4)) #a way in python 3.0 and arthematic operations can also be done here like done with age2




# 3 of 3 here is not efective here