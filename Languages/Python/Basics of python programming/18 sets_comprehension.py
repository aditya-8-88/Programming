# sets comprehension are used to mimize the coding (oftenly used)
# 1.
s = {k**3 for k in range(0,10)}
print(s)

# 2.
names = ['Aditya','mohit','kapoor']
first_letter = {name[0] for name in names}
print(first_letter)