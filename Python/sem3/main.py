# # # # # result = "{:.2f}".format(float(16) / float(3))
# # # # # print(result)
# # # # # l=[x if x%2==1 else 10 for x in range(10) ]
# # # # # print(l)

# # # # def fibonacci_tail_recursive(n, a=0, b=1):
# # # #     if n == 0:
# # # #         return a
# # # #     elif n == 1:
# # # #         return b
# # # #     else:
# # # #         return fibonacci_tail_recursive(n - 1, b, a + b)

# # # # # Example usage
# # # # for i in range(10):
# # # #     result = fibonacci_tail_recursive(i)
# # # #     print(result,end=" ")  # Output: 5


# # # import tkinter as tk

# # # def on_button_click():
# # #     label.config(text="Button Clicked!")

# # # # Create the main window
# # # root = tk.Tk()
# # # root.title("Tkinter Example")
# # # root.geometry("300x150")
# # # # Create a label widget
# # # label = tk.Label(root, text="Hello, Tkinter!")

# # # # Create a button widget
# # # button = tk.Button(root, text="Click me!", bg="white", command=on_button_click)

# # # # Pack the label and button widgets into the window
# # # label.pack(pady=10)
# # # button.pack()

# # # # Start the main event loop
# # # root.mainloop()



# # import tkinter as tk

# # def add_numbers():
# #     try:
# #         # Get values from entry widgets and convert to float
# #         num1 = float(entry1.get())
# #         num2 = float(entry2.get())

# #         # Perform addition
# #         result = num1 + num2

# #         # Update the result label
# #         result_label.config(text=f"Result: {result}")
# #     except ValueError:
# #         # Handle the case where input values are not valid numbers
# #         result_label.config(text="Invalid input. Please enter numbers.")

# # # Create the main window
# # root = tk.Tk()  
# # root.title("Addition Calculator")

# # # Create entry widgets for input
# # entry1 = tk.Entry(root, width=10)
# # entry2 = tk.Entry(root, width=10)

# # # Create a button to trigger the addition
# # add_button = tk.Button(root, text="Add", command=add_numbers)

# # # Create a label to display the result
# # result_label = tk.Label(root, text="Result: ")

# # # Place widgets using the grid layout manager
# # entry1.grid(row=0, column=0, padx=5, pady=5)
# # entry2.grid(row=0, column=1, padx=5, pady=5)
# # add_button.grid(row=1, column=0, columnspan=2, pady=5)
# # result_label.grid(row=2, column=0, columnspan=2, pady=5)

# # # Start the main event loop
# # root.mainloop()
# # def count(s):
# #     for i in string.split():
# #         s="&".join(i)
# #     return s
# # print(count("python is a great language"))
# x=['hello']
# print(x[0][0])
# x[0][0]="bye"