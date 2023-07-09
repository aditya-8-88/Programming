from pathlib import Path
import os
folder_name=r"F:\Aditya\Studies\College\00 Programing\00 Programming Language\c"
for i in list(Path(folder_name).rglob('*')):
    if i.suffix.lower()==(".exe"):
        os.remove(i)