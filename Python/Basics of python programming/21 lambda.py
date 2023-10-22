# uses of lambda are below

isEven = lambda num : num%2==0
print(isEven(5))
print()

last_char = lambda s : s[-1]
print(last_char('Aditya'))
print(last_char(['abc','cdf','fgh']))
print()

fn = lambda s : True if len(s)>5 else False
print(fn('abcd'))
print(fn('abcdefg'))