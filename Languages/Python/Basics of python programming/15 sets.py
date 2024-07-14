# set data type is an unordered collection of unique items
# sets can store anything except list and dictionaries and also helps to remove duplicate in list and dictionaries see line 4 and 5

l = [1,2,3,3,4,5,6,6,6,6]
print(list(set(l)))

s = {1,2,2,3,4,4.0,'str1','st','st'} # 4.0 = 4 therefore only one is printed(which ever comes first Ex:- here 4 is ahead of 4.0 )
print(s)
s.add(4)
s.remove(1) # sometimes gives excetion when the element you are removing is absent
s.discard(5) # it will act like .remove() as well as will not give exception  
s1 = s.copy() # s1 and s have different locations in memory.
print(s1)  # every time ouput is different and unordered. 
s1.clear()
print(s1)
print(s,'\n')

# union and intersection in sets
s1= {1,2,3,4,5,6,7}
s2= {4,5,6,7,8,9,10}
print(type(s1))
union =  s1|s2
intersection = s1 & s2
print(f'Union is {union} \nintersection is {intersection}')