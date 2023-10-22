# a method of creating list in one single line
# 1.
square = [i**2 for i in range(1,21,2)]
print(square)

# 2.
negative  = [-i for i in range(1,50,3)]
print(negative)

# 3.
names = ['Aditya','Vishal','Harshit','Mohit']
first_letter = [name[0] for name in names]
print(first_letter)

# 4.
l1 = ['abc','def','efg']
rev = [word[::-1] for word in l1]
print(rev)

# 5.
even_num = [i for i in range(1,11) if i%2 == 0]
odd_num = [i for i in range(1,11) if i%2 != 0]
print(even_num)
print(odd_num)

# 6.
l1 = [True,False,3,[1,'Aditya',3.02],[56,'dfbs'],40.25]
onlyIntFloat = [str(i) for i in l1 if (type(i)==int or type(i)==float)]
print(onlyIntFloat)

# 7.
series1 = [i*2 if i%2==0 else -i for i in range(1,11)]
print(series1)

# 8. printing same sublist sometimes in a list
nestedList = [[i for i in range(3)] for j in range(3)]
print(nestedList)
