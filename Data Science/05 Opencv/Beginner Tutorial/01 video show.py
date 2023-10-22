import numpy as np
import cv2

path=r'G:\00 Sunny\Movies\Hollywood\Marvel Studios\thor ragnarok.mkv'

# cap= cv2.VideoCapture(path)
# while cap.isOpened():
#     ret, frame=cap.read()
#     if not ret:
#         break
#     image = cv2.resize(frame,(600,400))
#     cv2.imshow('video show',image)

#     if cv2.waitKey(25) & 0xff ==ord('q'):
#         break
# cap.release()
# cv2.destroyAllWindows()



# cap= cv2.VideoCapture(path)
# while cap.isOpened():
#     ret, frame=cap.read()
#     if not ret:
#         break
#     frame = cv2.resize(frame,(600,400))
#     frame2=np.hstack((frame,frame))
#     frame4=np.vstack((frame2,frame2))
#     cv2.imshow('video show',frame4)

#     if cv2.waitKey(25) & 0xff ==ord('q'):
#         break
# cap.release()
# cv2.destroyAllWindows()



cap= cv2.VideoCapture(path)
cap1= cv2.VideoCapture(0)
while cap.isOpened():
    ret1, frame1=cap.read()
    ret2, c_frame=cap1.read()
    if not ret1 & ret2:
        break
    frame1 = cv2.resize(frame1,(600,400))
    c_frame = cv2.resize(c_frame,(600,400))

    frame2=np.hstack((frame1,c_frame))
    frame4=np.vstack((frame2,frame2))
    cv2.imshow('video show',frame4)

    if cv2.waitKey(25) & 0xff ==ord('q'):
        break
cap.release()
cv2.destroyAllWindows()