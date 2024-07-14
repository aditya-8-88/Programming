# pronounciation tk-inter

# starter code
from codecs import getencoder
import tkinter as tk
# from tkinter import *
from tkinter import ttk
# from tkinter import ttk # ttk is a sub class in tkinter
from csv import DictWriter
import os
win=tk.Tk()
win.title('GUI App')


# creating lables
# ttk.Label(win, text='Enter your name : ').pack()
name_label=ttk.Label(win, text='Enter your name : ')
name_label.grid(row=0, column=0, sticky=tk.W) # using grid(pack is other type, sticky is used with W(west) to stick all things to west side
name_label.configure(foreground='Red',background='#FFFF00')
email_label=ttk.Label(win, text='Enter your email : ')
email_label.grid(row=1, column=0, sticky=tk.W)
age_label=ttk.Label(win, text='Enter your age : ')
age_label.grid(row=2, column=0, sticky=tk.W)
gender_label=ttk.Label(win, text='Select your gender : ')
gender_label.grid(row=3, column=0, sticky=tk.W)
feild_lable=ttk.Label(win,text='Choose Field : ')
feild_lable.grid(row=4, column=0, sticky=tk.W)


# creating entry boxes
name_var=tk.StringVar()
name_entrybox = ttk.Entry(win, width=16, textvariable= name_var)
name_entrybox.grid(row=0, column=1)
name_entrybox.focus()
email_var=tk.StringVar()
email_entrybox = ttk.Entry(win, width=16, textvariable= email_var)
email_entrybox.grid(row=1, column=1)
age_var=tk.StringVar()
age_entrybox = ttk.Entry(win, width=16, textvariable= age_var)
age_entrybox.grid(row=2, column=1)



# creating combobox
gender_var=tk.StringVar()
gender_combobox=ttk.Combobox(win, width=13, textvariable=gender_var, state='readonly')
gender_combobox['values']=('male','female','other')
gender_combobox.current(0)
gender_combobox.grid(row=3, column=1)


# RadioButton
type=tk.StringVar()
radiobtn1=ttk.Radiobutton(win, text='Student', value='Student', variable=type)
radiobtn1.grid(row=4, column=1)
radiobtn1=ttk.Radiobutton(win, text='Teacher', value='Teacher', variable=type)
radiobtn1.grid(row=4, column=2)


# check button
checkbtn_var=tk.StringVar()
checkbtn=ttk.Checkbutton(win, text='If you want to subscribe.', variable=checkbtn_var)
checkbtn.grid(row=5, columnspan=3, sticky=tk.W)


# creating button + printing output + writing in text and csv file
def action():
    user_name=name_var.get()
    user_email=email_var.get()
    user_age=age_var.get()
    user_gender=gender_var.get()
    user_type=type.get()
    if(checkbtn==0):
        subscription='No'
    else:
        subscription='Yes' 
    
    # printing normal output
    print(f'{user_name} is {user_age} years old.')
    
    # writing to text file
    with open('tkinter_GUI_App_Data_TEXT.txt','a') as wf:
        wf.write(f'{user_name},{user_email},{user_age},{user_gender},{user_type},{subscription}\n')
    
    # writing to csv file
    with open('tkinter_GUI_App_Data_CSV.csv','a', newline='') as f:
        dict_writer = DictWriter(f, fieldnames=['User Name', 'User Email Address', 'User Age', 'User Gender','User Type', 'Subcribed'])
        if os.stat('tkinter_GUI_App_Data_CSV.csv').st_size==0:
            dict_writer.writeheader()
        dict_writer.writerow({
            'User Name' : user_name,
            'User Email Address' : user_email,
            'User Age' : user_gender,
            'User Gender' : user_gender,
            'User Type' : user_type,
            'Subcribed': subscription
        })
    
    name_entrybox.delete(0,tk.END)
    email_entrybox.delete(0,tk.END)
    age_entrybox.delete(0,tk.END)

submit_button = tk.Button(win, text='Submit', command=action)
submit_button.grid(row=6, column=0)
submit_button.configure(foreground='blue')



win.mainloop()