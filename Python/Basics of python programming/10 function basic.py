# In Python, we may define functions and have them return a value.
# Here's an example of a function that combines two data types.

def add_data(var1,var2):
    return var1+var2 # Print can be used here, but return provides more value to a function.

# num1 =int(input('Enter first number:- '))
# num2 =int(input('enter second number:- '))
# print('total:',add_data(num1,num2))

# str1=input('enter first sentence : ')
# str2=input('enter second sentence : ')
# print(add_data(str1,str2))


# fn = add_data # now fn is as same as add_data
# print(fn(12,13))
# print(fn.__name__) # it gives name of original function


# print(help(len),'\n') # here if i don't know the use of len then i can call for a help 
# print(help(help))


# # Default Vaules to bypass errors
# def default(str1='none' , str2='none' , num1=18):
#     print(f'First name : {str1}',end=' ')
#     print(f'Last name : {str2}',end=' ')
#     print(f'Your age : {num1}',end=' ')
#     print()
# default('Aditya','Singh', 19) # passing some specific values, output --> First name : Aditya Last name : Singh Your age : 19 
# default() # passing no value, output --> First name : none Last name : none Your age : 18
# default('adi') #passing few values, output --> First name : adi Last name : none Your age : 18