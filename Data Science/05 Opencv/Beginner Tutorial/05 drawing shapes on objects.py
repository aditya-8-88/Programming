import cv2
import numpy as np
 
img_path = r"""F:\Aditya\Studies\College\00 Programing\02 Data Science\05 Opencv\Beginner Tutorial\data images\Image_2.jpg"""
 
image = cv2.imread(img_path)
image = cv2.resize(image, (800,550))

pt1=(230,40)
pt2=(420,270)
color=(0,255,0)
thickness=4

image_rect=cv2.rectangle(image,pt1,pt2,color,thickness)

cv2.imshow("Showing Image",image_rect)
cv2.waitKey(0)
cv2.destroyAllWindows()


 