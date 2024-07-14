# dict comprehension are used to mimize the coding
# 1.
square = {f'Square of {num} is '  :num**2 for num in range(1,11)}
for i,j in square.items():
    print(f'{i} : {j}')
print(square)

# 2.
word = 'Adityay'
word_count = {char : word.count(char) for char in word}
print(word_count)

# 3.
even_odd = {i : ('even' if i%2==0 else 'odd') for i in range(1,11)}
print(even_odd)