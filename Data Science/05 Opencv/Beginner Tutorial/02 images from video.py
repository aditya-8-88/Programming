# sourcery skip: use-named-expression
import numpy as np
import cv2
import os


# # creating a random image and saving it in a folder

# random_array= np.random.randint(255,size=(300,600,3))
# cv2.imwrite("Saves/random_image.png",random_array)
# img=cv2.imread("Saves/random_image.png") # here instead of saving in .png format we can save in .jpg format # a mini software for png to jpg and vica versa.
# cv2.imshow('image',img)
# cv2.waitKey(0)
# cv2.destroyAllWindows()

# taking images from a video and saving it in a folder

path=r'G:\00 Sunny\Movies\Hollywood\Marvel Studios\thor ragnarok.mkv'
cap= cv2.VideoCapture(path)
# os.mkdir("Saves/video images saves")
i=0
while cap.isOpened():
    ret, frame=cap.read()
    if not ret:
        print("unable to read frame:")
        break
    # image = cv2.resize(frame,(600,400))
    img_write=cv2.imwrite(f"Saves/video images saves/image {i}.jpeg",frame)
    if img_write:
        print(f"image {i}.jpeg successfully saved...")
    cv2.imshow('video show',frame)
    i+=1
    if cv2.waitKey(25) & 0xff ==ord('q'):
        break
cap.release()
cv2.destroyAllWindows()
