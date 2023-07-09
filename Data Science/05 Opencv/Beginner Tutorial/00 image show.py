import os
import cv2

path = r"""F:\Aditya\Studies\College\00 Programing\02 Data Science\05 Opencv\Beginner Tutorial\data images"""

# r before """ helps to read the image in form of raw string
img_name = "21830_uhd.jpg"

# img = cv2.imread(path+'\\'+img_name)
# cv2.imshow('Image',img)
# cv2.waitKey(0)
# cv2.destroyAllWindows()

img = cv2.imread((path+'\\'+img_name), 0) # 1 -rgb  0 -grey  -1 -unchanged 
print(img) # it reads image a form of matrix of every pixel4 

img = cv2.resize(img,(600,600))
cv2.imshow('Image',img)
cv2.waitKey(0)
cv2.destroyAllWindows()


img_names = os.listdir('data images')
# print(img_names)

for i in img_names:
    full_path=path+'\\'+i
    img=cv2.imread(full_path)
    img=cv2.resize(img, (600, 900))
    cv2.imshow('image',img)
    cv2.waitKey(1500)
cv2.destroyAllWindows()