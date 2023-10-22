# Decorators ----> helps to make changes in our original function without typing our original function
def decorator(any_func):
    print('This is your function')
    any_func()
@decorator # shortcut of calling decorator functions (we can call it by normal function calling method)
def func():
    print('Hy there \n')

# -----------------------------------------EXAMPLE 1:-------------------------------------------
from functools import wraps
def decorator_function(any_function):
    @wraps(any_function)
    def wrapper_function(*args,**kwargs):
        '''this is wrapper function'''
        print('this is awesome function')
        return any_function(*args,**kwargs)
    return wrapper_function
@decorator_function
def func(a):
    print(f'this is function with argument {a}')
func(5)

@decorator_function
def add(a,b):
    '''adds data'''
    return a + b
print(add(2,3),'\n')

print(add.__doc__) # we use 'for functools import wraps' and '@wraps(any_function)' to print doc of add instead of 'wrapper_function'
print(add.__name__,'\n') # same here as above to print name 'add' instead of 'wrapper_function'


# -----------------------------------------EXAMPLE 2:-------------------------------------------
def only_int_allow(function):
    def wrapper_func(*args, **kwargs):
        if all([type(a) == int for a in args]):
            return function(*args, *kwargs)
        return "Only integer value is allowed"
    return wrapper_func
@only_int_allow
def add_all(*args):
    total = 0
    for i in args:
        total+=i
    return total
print(add_all(1,2,3,4,5,6),'\n')

# -----------------------------------------EXAMPLE 3:(argument in decorators)-------------------------------------------
def only_data_type_allow(data_type):
    def decorator(func):
        def wrapper(*args, **kwargs):
            if all([type(arg) == data_type for arg in args]):
                return func(*args, **kwargs)
            return "Invalid arguments"
        return wrapper
    return decorator
@only_data_type_allow(str)
def add_all(*args):
    string = ''
    for i in args:
        string += i
    return string
print(add_all('anurag', ' varnwal'))