import pdb # pre-debugging class in python (FALTU HAI AS PYTHON KA ERROR SYSTEM IS ENOUGH)

pdb. set_trace() # checks each line while giving output and we need to run each line manually with below commands:-
# l means print the line number we are in
# n means to run the particular line
# c means to run further code with any debugging 
# q means to quit debugging 
# and most important thing that debugging will start from the line where pdb. set_trace() is written in your syntax 

name = input('Please type your name : ')
age = input('Please type your age : ')
print(f'heho {name} your age is {age}')
age2 = (age) + 5
print(f'{name} you will be {age2} in next five years')