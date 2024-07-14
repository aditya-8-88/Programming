# uses of lambda are below

# lambda arguments: expression
isEven = lambda num : num%2==0 # lamda is used to create short function
print(isEven(5))
print()

last_char = lambda s : s[-1]
print(last_char('Aditya'))
print(last_char(['abc','cdf','fgh']))
print()

fn = lambda s : True if len(s)>5 else False
print(fn('abcd'))
print(fn('abcdefg'))