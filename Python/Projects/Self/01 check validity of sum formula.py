import time
start = time.time()

def formula(a):
    return (a*(a+1))/2
def layman(a):
    sum=0
    for i in range(a+1):
        sum+=i
    return sum

n=int(input('Enter number of times: '))
count=0
for i in range(n):
    if(formula(i)!=layman(i)):
        count=1
if(count!=1):
    print('pass')

end = time.time()
print("The time of execution of above program is :", (end-start) * 10**3, "ms")


# def layman(a):
#     sum=0
#     for i in range(a+1):
#         sum+=i
#     return sum
# def formula(a):
#     return (a*(a+1))/2

# print(layman(6)==formula(6))
# print(formula(1))