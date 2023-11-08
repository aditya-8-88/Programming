# Reading file 'read.txt' that contain text and writing file'reader.txt' that contains unique words only using 'class'. 
class TextFileHandeling:
   #constructor
    def __init__(self,path,mode):
        self.path=path
        self.mode=mode

    #function defined which will read file and return words in file
    def reading_file(self):
        file_read= open(self.path,self.mode)
        lines=file_read.read() 
        words=lines.split()   #split strings into words
        return words
        file_read.close()      
    
    # function for writing in file which take words and write unique words
    def writing_file(self,words):
        unique=[]
        file_write= open(self.path,self.mode)
        for i in words:
            if i not in unique:
                unique.append(i.lower())
                file_write.write(str(i)+" ")
        return file_write
        file_write.close()
#class objects are created
read_file=TextFileHandeling('D:\\python_practise\\read.txt','r')
write_file=TextFileHandeling('D:\\python_practise\\reader.txt','w')
#functions are called
words= read_file.reading_file()
write_file.writing_file(words)