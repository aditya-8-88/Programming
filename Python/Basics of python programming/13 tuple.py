# tuple are like lists but immutable and faster than lists
# syntax difference is lists have [] this whereas tuple have () this
# we use tuples when we don't need to change the data or if the data is universal ex- days in week, months in year etc



print()
example=('one','two','three',1,2,3)
# no append, no insert, no pop, no remove
# Usable methods --> count, index. Further len function and slicing can be used here

# min, max and sum can also be used here
numbers = tuple(range(0,11)) # numbers = (0,1,2,3,4,5,6,7,8,9,10)
print(min(numbers)+max(numbers))
print(sum(numbers))

# tuple vs Integer (in case of single element)
num1 = (1,) 
num2 = (2)
print(type(num1)) # ',' is mendatory for being tuple in one element
print(type(num2)) # it integer

# tuples without paranthesis
guitors = 'yamaha', 'baton rough', 'taylor' # by default it's tuple in python

# tuple unpacking
guitor1,guitor2,guitor3  = (guitors)
print(guitor1+'     '+guitor2+ '        '+guitor3 )

# lists in tuple (here lists can be changed)
favourite =('hello', 'world', [2, 3, 'Aditya'])
favourite[2].pop() # and all other functions and  methods like remove, append etc
print(favourite,'\n')

# Here's an example to demostrate that a list can contain a tuple( ya, which  can't be changed)
# l=[('hello', 'world', [2, 3, 'Aditya']),4,5]
# print(l)
# l[0].pop()
# for i in l:
#     print(type(i))


# fuctions returing two values
def fun1(int1, int2):
    add = int1 + int2
    multiply = int1*int2
    return add, multiply # it will return a tuple where both values will be  returned
add, multiply = fun1(22, 33) # this way we can print elements of tuple separtely 
print(type(fun1(22, 33))) # see here!!
print(add)
print(multiply)
