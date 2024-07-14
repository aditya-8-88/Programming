# basic variable knowledge 
num1=4
num2=4.45       #here we don't use any data types (as you see it here)
word1="name"
num3=5/2
print(num1," ",num2," ",num3," ",word1) #here we use comma(,) instead of (+) in java

# other ways of input:-
name,age = "Aditya","24" # 24 in "" to avoid future string integer complications
print('hello '+name+' your age is '+age)
x=y=z=1
print(x+y+z)

# how to check variable type:
str,num,char,float,l1='Aditya',2,'s',20.3,['a','ght',5,2.560]
print(type(str), type(num), type(char), type(float), type(l1))




# Scope of variables in functions
print('scope of variables')
x=5 # global variable
def fn():
    global x # try commenting out this line 
    x=7 # local variables
    return x
print(x)
print(fn())
print(x)