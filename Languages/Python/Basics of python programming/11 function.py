# 0 1 1 2 3 5 8 13 21 .... # Fibonacci Series

n=int(input('Enter no of terms you need in your fibonnaci series : '))
a=0
b=1
if n==0:
    exit()
if n==1:
    print('0',end=' ') 
    exit()
if n==2:
    print('0 1',end=' ')
    exit()
print('0 1',end=' ')
for i in range(1,n-1,1):
    c=int(a+b)
    print(f'{c}', end=' ')
    a=b
    b=c

# end=' ' helps to get a gap as well as prevents cursor to move in next line; try it out by removing it!!

# i added last ,1 in for loop to tell that range can also jump. Although 1 jump has no effect here as for loop was also doing the same work.




# def fibonacci(n):
#     fib_sequence = []
#     a, b = 0, 1
#     for _ in range(n):
#         fib_sequence.append(a)
#         a, b = b, a + b
#     return fib_sequence

# n = int(input("Enter the number of Fibonacci sequence elements: "))
# result = fibonacci(n)
# print(result)






# def fibonacci(n):
#     if n <= 0:
#         return []
#     elif n == 1:
#         return [0]
#     elif n == 2:
#         return [0, 1]
#     else:
#         fib_sequence = fibonacci(n - 1)
#         fib_sequence.append(fib_sequence[-1] + fib_sequence[-2])
#         return fib_sequence

# n = int(input("Enter the number of Fibonacci sequence elements: "))
# result = fibonacci(n)
# print(result)
