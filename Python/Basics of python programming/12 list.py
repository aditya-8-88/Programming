# list vs array across all languages
# List in Python --> we can store anything in it , highly flexible, widely used
# Array in any programing language are efficient as they store same type of data but less flexible, used in data science etc
# EXCEPTION - javascript array are as same as python list

# string vs list in python
# strings are immutable and list are mutable(can be changed) here.
print()

mixed = [4 , 'aditya' , 3.287345 , None] # we can store int, float, string in it combined as well as individually
print(mixed) # printing the list
print(mixed[:2]) # printing the particular index of the list(it starts from 0 like strings)
print(mixed[::-1]) # printing the list in reverse order using arguments
print(mixed[::2]) # using step argument like in string for a gap(here 2)
mixed[0] = 'sibbu' # index 0 (int data type) is changed to string
print(mixed)
mixed.append('mango') # used to add data at the end of a list and increasing list limit by one
print(mixed,'\n')


fruit1 = ['mango','banana']
fruit2 = ['grapes','oranges']
print(fruit1+fruit2)# concating lists
fruit2.extend(fruit1)
print(fruit2)
fruit2 = ['grapes','oranges']
fruit2.append(fruit1) # see output for difference between extend and append
print(fruit2)
fruit1.insert(2,'apple') # inserting data at index no. 2 (data is added at end of list as index 2 is absent)
print(fruit1)

fruit1 = ['banana','mango','apple','grapes','apple','oranges','guava']
print(fruit1)
popped_value=fruit1.pop(0) # deletes data at index 0 in the list and returns the same value and if none index is passed then deletes last data and returns the same
print(fruit1,'\n',popped_value)
del fruit1[::2] # del deletes things with a gap of 2
print(fruit1) # output --> ['apple', 'apple', 'guava']
fruit1.remove('apple') # deletes apple at index 0 but not apple at index 1
print(fruit1)
if 'apple' in fruit1:
    print('yes it is present')


print()


fruit1 = ['banana','mango','apple','grapes','apple','oranges','guava','kiwi', 'papaya']
print(fruit1.count('apple')) # counts
print(sorted(fruit1)) # prints sorted data of the list but don't change original list
print(fruit1)
fruit1.sort() # sorts the list in alphabetical or increasing order
print(fruit1) 
fruit1_copy = fruit1 # we can use fruit1.copy() as well to copy the list to fruit1_copy
print(fruit1_copy)
fruit1.clear() # empties the whole list
print(fruit1)


print()


num1=[1,2,3,4,5]
num2=[2,5,5,4,6]
num3=[2,3,4,5,1]
num4=[1,2,3,4,5]
num2.reverse()
print(num2)
print(num1 == num2)
print(num1 == num3)
print(num1 is num4) # '==' checks the equality of values and 'is' checks if they belongs to same location in computer memory


print()


user_info1= 'aditya,18,hello,50'.split(',') # splits each term after ',' and stores in the list user_info
print(user_info1)
print(','.join(user_info1)) # converts list into string again and ',' here separates them in string format by a comma
print(user_info1) # list 'user_info1' is not converted to string


print()


matrix=[[1,2,3],[4,5,6],[7,8,9]] # 2D list # we can use 'for loop' in 'for loop' to print all elements of 2D lists
print(matrix[1][2]) # to print ement 6 --> index 1 sub-index 3
Lnum= list(range(1,11)) # creates a list ranging 1 to n-1
print(Lnum)
Lnum.append(1)
print(Lnum.index(1,3)) # gives index of data (1 here) after a particular index if assigned ( 3 here)
Lnum.append(1)
print(Lnum.index(1,11,19),'\n') # to find 1 from index 11 to 19 in Lnum(although index 19 doesn't exist but we got output as at 11th index we found '1')




# EXERCISES BELOW:-


# 1. Squaring elements of list
# from itertools import count
def fn(l):
    Lsqr=[]
    for i in (l):
        Lsqr.append(i**2)
    return Lsqr
num=list(range(0,10))
print(fn(num),'\n')


# 2. Print list in reverse
lwordNum1=[1,2,3,'word1','word2']
# print(lwordNum1[::-1]) # simplest way
revList= []
for i in (lwordNum1):
    #popped_word=i.pop() # extracting last element is another way 
    revList.insert(0,i)# inserting all elements at 0th index one by one -->revList
print(revList,'\n')


# 3. Reverse the elements of elements of list instead of reversing the list
l1 = ['abc', 'def', 'ghi']
l2 = []
for i in (l1):
    l2.append(i[::-1])
print(l2,'\n')


# 4. Filtering odd even function
l1 = [0,1,2,3,4,5,6,7,8,9]
def filterOddEven(l1):
    l2,l3,l4=[],[],[]
    for i in (l1):
        if i%2== 0:
            l2.append(i)
        else:
            l3.append(i)
    l4.append(l2)
    l4.append(l3)
    return l4
print(filterOddEven(l1),'\n')


# 5. comman element finder fn
l1,l2,l3=[1,2,5,6],[4,9,2,1],[]
def commanFinder(l1,l2):
    for i in l1:
        if i in l2:
            l3.append(i)
    return l3
print(commanFinder(l1,l2))

print()
# 6. Counting lists inside a list
def count_list(l1):
    count =0
    for i in l1:
        if type(i) == list:
            count+=1
    return count # if we use print statement we get output + 'None'. Why?  
l1= [1,2,3,[4,5],[6,7,8],[10,9]]
print(count_list(l1))
