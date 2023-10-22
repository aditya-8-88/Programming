print()
first_name= "Aditya"
last_name="Pratap Singh"
full_name=first_name + " " + last_name +" "
print(full_name)
print(full_name + " " + str(3)) # string data type is used & (+) sign can be used here
print(full_name * 2) # a way to print the string any number of times- {String * no. of times}

#arthemic operation of java ( += , -= , /= , *= ) can be used here as well.

print('\n\n\n\n\n')

word = "Aditya"
# positions( index number)
# A = 0 , -6
# d = 1 , -5
# i = 2 , -4
# t = 3 , -3
# y = 4 , -2
# a = 5 , -1

#indexing:-
print(word[1] + word[2] + word[-4]) # the index in [?] calls the letter in the word

#slicing (selecting sub sequences) :-

# 1.syntax -->  print([start argument : stop argument -1])
print(word[0:3] + '\t' + word[-3:5] + '\t' + word[2:] + '\t  ' + word[:3])
print('helloww'[0:3] + '\t' + 'Singh'[-3:5] + '\t' + 'Pratap'[2:] + '\t' + 'Aditya'[:3])

# 2.syntax -->   print([star argument : stop argument : step argument])
print('harshit'[0:5:2]) # it will print index 0 to 5-1 but 2 letters a gap of 2 steps.
# other examples are 'Aditya'[::2] etc
print('vishal'[-1::-1]) # prints string in reverse order and 'vishal'[::-1] will do the same. Other ex- 'vishal'[-1::-2] // 2 gaps from back 




# String Functions and Methods
name = 'AditYa PRATap SiNgH'
print(len(name)) #function for counting length of sentence
print(name.lower()) #method for lower case
print(name.upper()) #method for upper case
print(name.title()) #method for first letter of each word in capital
print(name.count("A")) #method for counting 'Capital a'
print(name)

word = '    aditya    '
dots = '......'
print(word.lstrip() + dots) # lstrip removes left spaces
print(word.rstrip() + dots) # rstrip removes right spaces
print(word.strip() + dots) # strip removes sidewise spaces just like trim in java
print(word.replace('a' , 'Z' ,1) + dots) # replacing a with Z once And for replacing all --> replace('a','Z')
print(word+dots)
print(name.find('a')) # it will give the index no of first a in the string 'name'
print(name.find('a', 7)) # it will give the index of 'a' after the index no 7 (here)
a = len(word)
print(word.center(a+1 , '*')) # center adds characters at the end ( * here) ; 'a' is the length of 'word' + the no. of char to be printed after it
# definition for center is not correct it needs to be judged again upon requirments