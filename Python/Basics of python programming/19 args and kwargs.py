# 1.
def all_total(*args): # *args can take as many inputs you give to it 
    total = 0
    print(args) # in *args the elements are stored in tuple
    for num in args:
        total+=num
    return total
print(all_total(1,2,3,4,5,6),'\n')
nums = [4,5,6,7]
print(all_total(*nums),'\n') # passing list as argument. We used *nums to unpack the list to enable all_total execute it.

# 2.
def multiply(num1,num2,*args): # at least 2 parameters need to be passed(num1&num2). No agrument can be written after *args(an exception of 2 values missing 
    total = 1
    print('',num1,'\n',num2,'\n',args) # num1 = 1 and num2 =2
    for num in args:
        total *= num
    return total
print(multiply(1,2,3,4))


# **kwargs operator stores data in form of dictionaries

def fn(num, **kwargs):
    print(num)
    for k,v in kwargs.items():
        print(f'{k} : {v}')

fn( 5,first_name = 'Aditya', last_name = 'Singh')
# for unpacking dictionaries we use '**dictionary'


# order passing parameters in a function --->  def fn (parameters, *args, default parameters, **kwargs)