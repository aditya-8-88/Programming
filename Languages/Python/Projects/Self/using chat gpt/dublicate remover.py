# import os
# import hashlib
# import filecmp
# import sys
# import shutil
# import subprocess

# def hash_file(filename):
#     """"This function returns the SHA-1 hash
#     of the file passed into it"""

#     # make a hash object
#     h = hashlib.sha1()

#     # open file for reading in binary mode
#     with open(filename,'rb') as file:

#         # loop till the end of the file
#         chunk = 0
#         while chunk != b'':
#             # read only 1024 bytes at a time
#             chunk = file.read(1024)
#             h.update(chunk)

#     # return the hex representation of digest
#     return h.hexdigest()

# def create_shortcut(src, dest):
#     """This function creates a shortcut at dest
#     that points to src"""
#     shell = win32com.client.Dispatch("WScript.Shell")
#     shortcut = shell.CreateShortCut(dest)
#     shortcut.Targetpath = src
#     shortcut.WorkingDirectory = os.path.dirname(src)
#     shortcut.save()

# def remove_duplicates(folder_path):
#     """Remove duplicate files from the folder and place them in the recycle bin."""
#     # Dictionary to store the duplicates
#     duplicates = {}

#     # Iterate through all the files in the folder
#     for root, dirs, files in os.walk(folder_path):
#         for file in files:
#             file_path = os.path.join(root, file)

#             # Check if the file is a duplicate
#             if file_path in duplicates:
#                 print("Removing duplicate file:", file_path)
#                 # Remove the duplicate file
#                 try:
#                     shutil.move(file_path, os.path.join(os.environ['SystemRoot'], "System32", "dumpbin"))
#                 except Exception as e:
#                     print("Error:", e)
#                 continue

#             # Add the file to the duplicates dictionary
#             with open(file_path, "rb") as f:
#                 file_contents = f.read()
#                 if file_contents in duplicates.values():
#                     duplicates[file_path] = file_contents
#                     print("Removing duplicate file:", file_path)
#                     try:
#                         shutil.move(file_path, os.path.join(os.environ['SystemRoot'], "System32", "dumpbin"))
#                     except Exception as e:
#                         print("Error:", e)

#     print("Duplicate files removed successfully!")

# if __name__ == '__main__':
#     # Ask the user for the folder path
#     folder_path = input("Enter the path of the folder to search for duplicates: ")

#     # Call the function to remove duplicates
#     remove_duplicates(folder_path)



































# import os
# import shutil

# def find_duplicates(path):
#     """Find duplicates in a folder and its subdirectories"""
#     duplicates = {}
#     for root, dirs, files in os.walk(path):
#         for file in files:
#             full_path = os.path.join(root, file)
#             file_size = os.path.getsize(full_path)
#             if file_size in duplicates:
#                 duplicates[file_size].append(full_path)
#             else:
#                 duplicates[file_size] = [full_path]
#     return [duplicates[key] for key in duplicates if len(duplicates[key]) > 1]

# def create_shortcut(src, dst):
#     """Create a shortcut to the file at src at the location dst"""
#     shell = win32com.client.Dispatch("WScript.Shell")
#     shortcut = shell.CreateShortCut(dst)
#     shortcut.Targetpath = src
#     shortcut.save()

# def remove_duplicates(duplicates):
#     """Remove duplicate files and place them in the recycle bin"""
#     for group in duplicates:
#         for i in range(1, len(group)):
#             src = group[i]
#             dst = os.path.join(os.path.dirname(src), "shortcut_to_" + os.path.basename(src))
#             create_shortcut(src, dst)
#             shutil.move(src, os.path.join(os.path.expanduser("~"), "Recycle Bin"))

# if __name__ == "__main__":
#     location = input("Enter the location where you want to search for duplicates: ")
#     folder = input("Enter the name of the folder you want to search for duplicates: ")
#     path = os.path.join(location, folder)
#     duplicates = find_duplicates(path)
#     remove_duplicates(duplicates)
































import os
import shutil

def remove_duplicates(folder_path):
    # Create a dictionary to store the file names and their corresponding file paths
    files = {}

    # Loop through all the files in the directory
    for root, dirs, filenames in os.walk(folder_path):
        for filename in filenames:
            file_path = os.path.join(root, filename)

            # Check if the file name is already in the dictionary
            if filename in files:
                # If it is, move the duplicate file to the recycle bin
                print(f"Removing duplicate file: {file_path}")
                shutil.move(file_path, os.path.join(os.environ['SystemRoot'], "System32", "dumpbin"))
            else:
                # If it's not, add the file name and path to the dictionary
                files[filename] = file_path

    # Create shortcuts to the first occurrence of each file in the directory
    for file_name, file_path in files.items():
        shortcut_path = os.path.join(folder_path, f"{file_name}.lnk")
        if not os.path.exists(shortcut_path):
            print(f"Creating shortcut: {shortcut_path}")
            os.system(f'cmd /c mklink "{shortcut_path}" "{file_path}"')

# Ask the user for the directory to search for duplicates
folder_path = input("Enter the path of the folder to search for duplicates: ")

# Call the remove_duplicates function with the user-specified folder path
remove_duplicates(folder_path)
