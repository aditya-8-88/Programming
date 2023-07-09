# while loop
i=0
while i<=2:
    print(f'hello  world {i}')
    i+=1 # i need to be increased in case of while loop


# for loop
for i in range(3): # i will run from 0-9 by default another syntax--> for i in range(1,11) -->here i will go from 1 to 10
    print(f'hello world : {i}')

# break and continue keywords
for i in range(6):
    if i==1:
        continue # if i=4 then 4 will not be printed and loop will continue
    if i==4:
        break # if i=7 then 7 will not be printed and loop will break
    print(i)
print()

# step argument
for i in range(1,6,2): # where 2 is the step argument
    print(i) 
for i in range(6,0,-1):
    print(i)
print()

# loop and string
for i in 'adi':
    print(i)

# program with while loop
str1 = input('enter your name:- ')
str2=''
i=0
while i<len(str1):
    if str1[i] not in str2: # Learn the use of 'not in' here
        str2+=str1[i]
        print(f'{str1[i]} : {str1.count(str1[i])}')
    i+=1


# # program with for loop
# str1 = input('enter your name:- ')
# str2=''
# for i in range(len(str1)):
#     if str1[i] not in str2: # Learn the use of 'not in' here
#         str2+=str1[i]
#         print(f'{str1[i]} : {str1.count(str1[i])}')
#     i+=1



# guessing game
import random
win_num=random.randint(1,10)
#win_num =5
user_num=int(input('guess a number in range 1 to 10 :- '))
if user_num<=10 and user_num>=1:
    count=0
    i=0
    while i<1:
        if user_num == win_num:
            count+=1
            print(f'you won! taking {count} chances')
            break
        else:
            count+=1
            if user_num<win_num:
                print('too low, try again :- ')
            else:
                print('too high, try again :- ')
            user_num=int(input())
            if user_num<=10 and user_num>=1:
                pass
            else:
                print('you entered number out of range.')            
else:
    print('you entered number out of range.')