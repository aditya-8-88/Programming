name,age = 'ok',19

if name == 'ok' and age == 19:
    print('true')
else:
    print('false')

if name == 'not ok' or age ==19:
    print('true')
else:
    print('false')


# 'in' keyword
word = 'hello'
if 'o' in word:
    print('yes, found')
else:
    print('not found')


# checking empty or not
name1 = input('what is your name:- ')
if name1:
    print(f'hello {name1}')
else:
    print('why didn\'t you answered. Now go to Hell!!')