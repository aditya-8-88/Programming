# python for loop only works on iterators if you pass a iterable like list,etc then python firstly converts it into iterator and then loops it
# 1. Lambda function ---> shortened way of creating fuctions
def add(a,b):
    return a+b
add2 = lambda a,b : a+b
print(add2(2,3))

mul = lambda a,b : a*b
print(mul(2,3))

print(add) # we get memory location of any function when it is printed without paranthesis
print(add2) # same here
print(mul,'\n') # same here



# 2. Enumerate function ---> helps to track the times for loop running (below pos stores that value)
names = ['abc', 'def', 'ghi']
for pos,name in enumerate(names):
    print(f'{pos} --->  {name}')
print()



# 3.(i) Map functions ----> smart way of calling a function. Syntax --> map( function name without(), data like list_tuple_etc). It is iterator.
l1 = list(map(len, names)) # in case of multiple for loops on map(only) we have just one time output if not converted to list,tuple etc
print(l1,'\n')



# 3.(ii) self made map function (code of map function)
l = [1,2,3,4,5,6]
def my_map(function_name,z):
    return [function_name(i) for i in z]
print(my_map(lambda a:a**3 , l), '\n') 



# 4. Filter function ---->  same as maps (syntax) but returns your desired list ,tuple etc
nums = [0,1,2,3,4,5,6,7,8,9]
l2 = list(filter(lambda num : num%2==0 , nums)) # like maps they can  also be printed once using for loop
print(l2,'\n')



# 5. Zip function ----> helps to combine items
users = ['user1','user2','user3','user4']
names = ['a','b','c'] # 'd' is not present therefore printing takes place upto user3 only
z1 = zip(users, names) # more than two items can also be combined
print(list(z1),'\n')
l= [(1,2),(4,3),(5,6)]
l1,l2 = zip(*l) # unzipping items by just using * operator
print(l1,l2)
l3 = [max(pair) for pair in l]
print(l3,'\n')



# 6. any and all function ----> any means at least one and all means at most all
l = [1,2,3,4,5,6]
l1= [True if i%2==0 else False for i in l]
print(l1)
print(all(l1))
print(any(l1),'\n')



# 7. Advanced max and min function 
students={
    "name1":{ "score":34,"age":15},
    "name2":{"score":89,"age":16},
    "name3":{"score":99,"age":17}
}
Highest_scorer1=max(students, key=lambda item: students.get(item).get("score")) # defining fn, executing fn, calling fn in same line
Highest_scorer2=max(students, key=lambda item: students.get(item)["score"]) # do same work as above do
print(f"{Highest_scorer1} scored the highest")
print(f"{Highest_scorer2} scored the highest \n")



# 8. Sorted function
guitars=[
    {'model' : 'Yamaha' , 'price': 8000},
    {'model' : 'Naptune' , 'price': 50000},
    {'model' : 'Venus' , 'price': 35000},   
    {'model' : 'Taylor' , 'price': 450000}
]
print( sorted(list(map(lambda item: item.get('price'), guitars))))
print( sorted( guitars , key = lambda item: item.get('price')), '\n') # sorting list guitars on bases of prices



# 9. doc Strings ----> returns the text written by programmer to identify it's functions
print(len.__doc__) # like this you can check any doc of any pre built or self built functions
def fn():
    '''this function returns nothing. \n escape sequences works here.'''
print(fn.__doc__ , '\n')



# 10. returning fuction in a function
def outer_fn(msg):
    def inner_fn():
        print(f'I am inner functiion dude! {msg} ')
    return inner_fn()

outer_fn('hi hello \n') # outer_fn('hi hello')() can be also used for the same if we return inner_fn without ()



