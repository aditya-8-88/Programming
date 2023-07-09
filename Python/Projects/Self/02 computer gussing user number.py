# check what actually is happening with the commented while loops below

import random

top_of_range = input("COMPUTER will guess your number!!\nWhat number would you want as top of range in which you will play? (0,")
if top_of_range.isdigit():
    top_of_range = int(top_of_range)
    if top_of_range <= 0:
        print('Please type a number larger than 0 next time.')
        quit()
else:
    print('Please type a number next time.')
    quit()

user_guess = input("Type your number: ")
user_guess = int(user_guess)
if user_guess<0 & user_guess>top_of_range:
    print('out of range!!')
    exit(0)

random_number = random.randint(0, top_of_range)
arr =[]
arr.append(random_number)
guesses = 1

while True:
    if random_number == user_guess:
        print(f'Computer guesses are : {arr}')
        print(f"Computer got it! in {guesses} guesses")
        break

    if random_number > user_guess:
        random_number = random.randint(0, random_number)
        # while random_number in arr:
        #     random_number = random.randint(0, random_number)
            
    if random_number < user_guess:
        random_number = random.randint(random_number, top_of_range)
        # while random_number in arr:
        #      random_number = random.randint(random_number, top_of_range)

    arr.append(random_number)
    guesses+=1












# developer mode for checking above tasks tasks:


# import random

# for i in range(0,50):
#     top_of_range= 10000
#     # top_of_range = input("COMPUTER will guess your number!!\nWhat number would you want as top of range in which you will play? (0,")
#     # if top_of_range.isdigit():
#     #     top_of_range = int(top_of_range)
#     #     if top_of_range <= 0:
#     #         print('Please type a number larger than 0 next time.')
#     #         quit()
#     # else:
#     #     print('Please type a number next time.')
#     #     quit()

#     user_guess = 561
#     # user_guess = input("Type your number: ")
#     # user_guess = int(user_guess)

#     random_number = random.randint(0, top_of_range)
#     arr =[]
#     arr.append(random_number)
#     guesses = 1

#     while True:
#         if random_number == user_guess:
#             # print(f'Computer guesses are : {arr}')
#             print(f"Computer got it! in {guesses} guesses")
#             break

#         if random_number > user_guess:
#             random_number = random.randint(0, random_number)
#             # while random_number in arr:
#             #     random_number = random.randint(0, random_number)
            
#         if random_number < user_guess:
#             random_number = random.randint(random_number, top_of_range)
#             # while random_number in arr:
#             #      random_number = random.randint(random_number, top_of_range)

#         arr.append(random_number)
#         guesses+=1