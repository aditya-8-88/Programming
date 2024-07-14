import tkinter as tk
from tkinter import ttk
win=tk.Tk()
win.title('Loop')

lables=['Name : ','Age : ','Gender : ','City','State : ','Country : ']
for i in range(len(lables)):
    # cur_lable='lable' + str(i)
    cur_lable=ttk.Label(win, text=lables[i])
    cur_lable.grid(row=i, column=0, sticky=tk.W, padx=2, pady=3) # padx(left,right padding) and pady(top,bottom padding) 

# entry box
user_info={
    'name': tk.StringVar(),
    'age': tk.StringVar(),
    'gender': tk.StringVar(),
    'city': tk.StringVar(),
    'state': tk.StringVar(),
    'country': tk.StringVar() }
counter=0
for i in user_info:
    ttk.Entry(win, width=16, textvariable=user_info[i]).grid(row=counter, column=1, padx=2, pady=3)
    counter+=1

def printing():
    for i in user_info:
        print(user_info[i].get())

# submit button
tk.Button(win, text='Submit', command=printing).grid(row=7, column=0)
# ttk.user_info['name'].focus()
win.mainloop()