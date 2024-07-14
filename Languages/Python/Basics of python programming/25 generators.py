# generator are iterators but are like list,dict,etc(iterable)
# we use it when we add a data for use it once(by this way it minimizes the memory usage of our systems) i.e.,
# it uses elements of our data one at a time hence minimizing the memory allocations
# in case of lists or others whole data works as a unit therefore using more memory
def even(n):
    for i in range(0,n+1,2): # yield is a keyword for creating generators
        yield i 
print("The even numbers are: ")
l=even(10)
for num in l: # generators can be printed once using for loop
    print (num)
print()


# generator comprehension
cube = (i**3 for i in range(1,11))
for num in cube:
    print(num)



# proof of line 2,3 and 4
import time
t1 = time.time()
l = [i**2 for i in range(10000000)] # sidewise comment out 'g' and see task manager memory allocation  
print(time.time()-t1)

t2 =time.time()
g = (i**2 for i in range(10000000)) # sidewise comment out 'l' and see task manager memory allocation 
print(time.time()-t2)