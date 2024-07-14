def fn(num,*args):
    if args:
        return [i**num for i in args]
    else:
        return 'you didn\'t pass anything'
n = int(input('enter a num :'))
l = [1,2,3,4]
print(fn(n,*l))