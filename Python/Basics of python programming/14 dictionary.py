# dictionaries represent real life data for which list are not enough (dic can store complex data whereas lists are complicated even)
# dictionaries are the unordered collection of data in key : value pair.
# For example:-
print()
user = {
    'name': 'Aditya', 
    'age': 24
    }
# or simply like --> user = {'name': 'Aditya', 'age': 24} 
print(user)
print(type(user))
user1 = dict(name = 'Aditya', age = 24)
print(user1)
user1 =  {'name': 'Aditya', 'age': 24, 'age':34} # here by default later age(34) will overight the first one
print(user1,'\n')

print(user['name']) # there is no indexing in dictionaries, we call it by it's key
if 'name' in user1: # checking if the key is present or not in the dictionary 
    print('present')
if 'Aditya' in user1.values(): # checking if the value is present or not in the dictionary 
    print('present')
for i in user1: # prints all keys in user1 dictionary and for values use .value() keyword like above
    print(i, end=' ') 
print('\n')


user1_value_method = user1.values() # stores all values like but not list instead <type> is 'dict_values'
print(user1_value_method) # just like value method there is a keys method as well ---> .keys()
print(type(user1_value_method),'\n') # we can print the value by for loop using 'user1[i]' in print command 
 

# item method ---> most used in python dict
for i in user1.items():
    print(i) # prints items in tuples i.e., every pair of key and value in a tuple
for i, j in user1.items():
    print(f'key is {i} and value is {j}')
print()


# how to add data in empty dictionaries
user_info1={}
user_info1['name'] = 'Aditya'
user_info1['age'] = 56
print(user_info1,'\n')


# adding and removing data in dict
user1['fav_char']=['a','b','c'] # key fav_char is added to dict user1
print(user1.values())
popped_item = user1.pop('age') # key is used for popping the data and something is to be passed as argument here
print(popped_item) 
print(type(popped_item))
print(user1.values(),'\n')

print('\n\n\n\n\n')

# .popitem() method
user1 = {'name': 'Aditya', 'age': 24, 'fav_char' : 'a b c'}
popped_item = user1.popitem() # deletes last key and it's data 
print(popped_item) 
print(type(popped_item)) # <type> 'tuple' (here)
print(user1,'\n')


# update method 
user1 = {'name': 'Aditya', 'age': 24, 'fav_char' : 'a b c'}
more_info = {'name' : 'Aditya Pratap Singh', 'state': 'Uttar pradesh', 'hobbies' : 'Anything knowledgable'}
user1.update(more_info) # name is update i.e., pervious one is replaced and if .update({}) is empty then then not details are further updated
print(user1, '\n')


# fromkeys method ----> sets same value to different keys
d = dict.fromkeys(('name', 'age', 'gender') , 'unknown') # value 'unknown' is set to all 3 keys here
print(d)
d1 = dict.fromkeys(range(1,4), 'unknown') # using the keyword range for making 1 to 10 keys
print(d1,'\n')
print('\n\n\n\n\n')


# get method 
print(d.get('names')) # in d dict there is no key as 'names' but get is useful as it doesn't return an error  instead it returns 'None' 
print(d.get('names', 'not found!')) #  we can also print our desired output as well

### by default 'None' is a false statement if passed in if or if...else.. then else is executed as if became false 

d.clear() # clears the dict
print((d))
d = d1 # same memory location that is any changes are applied to both
d2 = d1.copy() # here they have different memory locations any changes will not alter the other
if d is d1:
    print('same memory location of d and d1')

if d2 is d1:
    print('same memory location of d2 and d1')
else:
    print('not same memory location of d2 and d1')



# dictionary as group of data
#user2={}
#users={
#    user1:{}, # 'data1'
#    user2:{}  # 'data2'
#}



# EXERCISES BELOW:-


# 1. finding cube
def cube_with_dict(n):
    d={}
    for i in range(1,n+1):
        d[i] = i**3
    return d
n=int(input('enter a number : '))
print(cube_with_dict(n),'\n')

# 2. letter counting
def letter_count(str1):
    d={}
    for i in str1:
        d[i] = str1.count(i) # dictionaries don't store duplicate data
    return d
print(letter_count('Aditya happy boy'))