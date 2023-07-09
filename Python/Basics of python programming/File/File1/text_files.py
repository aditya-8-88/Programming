f1 = open('file1.txt')
#f1 = open(r'G: \new_folder\file1.txt') # another way opening file is to call it by it's location. here 'r' ensures that escape sequences are disabled 

print(f'cursor position - {f1.tell()}\n') # .tell() gives letter no 
print(f1.read())

print(f'cursor position - {f1.tell()}')
print('applying seek method')
f1.seek(0)  # seek method moves cursor to the letter no. we want (here 0)
print(f'cursor position - {f1.tell()}\n')

lines = f1.readlines() # reads line one at a time
print(f'total no. of line are {len(lines)} as follows:-')
for line in lines:
    print(line,end='')

print(f1.readline(), end= '' '\n') # read only one letters of one line  

print(f'cursor position - {f1.tell()}')
print(f1.read()) # it can't read any line as our cursor are at the end of file

f1.seek(0)
for line in f1.readlines()[:2]: # slicing with readlines to read first two lines (0 and 1)
    print(line, end='' )
print()
print(f1.name) # to print file name
f1.close() # to close a file
print(f1. closed,'\n') # to check if the file is closed

# w, a, r+
with open('file2.txt','w') as f2:
    f2.write('hello\n') # it creates a file if not and removes everything in it and prints what ever you want
with open('file2.txt','a') as f2:
    f2.write(' a means append here\n') # it creates a file if not and appends everything you prints, after it
with open('file2.txt','r+') as f2:
    f2.read() # mendatory to use otherwise r+ will start printing from the beginning by deleting previous content
    f2.write('please do it\n') # unlike above ones it do not create files. Helps to read and write files. 
f2.close()


# with open('file2.txt','r') as rf:
#     with open('file1.txt','r') as wf:
#         wf.write(rf.read()) # reading from file2 and write it in file1


with open('salary.txt', 'r') as rf:
    with open('output1.txt', 'a') as wf:
        for line in rf.readlines():
            name,salary = line.split(',')
            wf.write(f'{name}\'s salary is {salary}')



with open('html_file.html', 'r') as rf:
    with open('output2.txt', 'a') as wf:
        page = rf.read()
        link_exist = True
        while link_exist:
            pos = page.find('href')
            # print(pos)
            if pos == -1:
                link_exist = False
            else:
                first_quote = page.find('\"' , pos)
                second_quote = page.find('\"', first_quote+1)
                url = page[first_quote+1: second_quote]
                wf.write(url+'\n')
                page = page[second_quote:]

# error there below:-
# with open('emoji.txt','r', encoding='utf-8') as rf:
#     print(rf.encoding)
#     data = rf.read()
#     print(data)

# it with open(rlove_story.txtr, ‘rLsn.t.rr,s,..ta_ascs: a)
# 4 prinit(f.encoding)
# 4 data a f.read()
# it piine(da€â) A I
# with open.file.txt’, r.) as f:
# data = f.read(IeO)
# whiIe ien(data) > 0:
# ‘3rint(data)
# data = f.read(i00)