import cv2
import numpy as np
import os

# w=1280
# h=720
# channel=3
# fps=60
# sec=10

# fourcc = cv2.VideoWriter_fourcc(*'mp4v')  # Use mp4v codec
# video = cv2.VideoWriter('Saves/video from images/test1.mp4', fourcc, float(fps), (w,h))

# for _ in range(fps*sec):
#     img = np.random.randint(0,255,(h,w,channel), dtype=np.uint8)
#     video.write(img)

# video.release()


w=1280
h=720
channel=3
fps=30
sec=60

fourcc = cv2.VideoWriter_fourcc(*'mp4v')  # Use mp4v codec
video = cv2.VideoWriter('Saves/video from images/test2.mp4', fourcc, float(fps), (w,h))

path=r"F:\Aditya\Studies\College\00 Programing\03 Opencv\Beginner Tutorial\Saves\video images saves"
img_list = os.listdir(path)
num_frames = min(fps * sec, len(img_list)) 
for i in range(num_frames):
    img_name = img_list[i]
    # print(img_name)
    img = cv2.imread(f"F:\Aditya\Studies\College\00 Programing\03 Opencv\Beginner Tutorial\Saves\video images saves\{img_name}")
    cv2.imshow('Image',img)
    video.write(img)
    cv2.waitKey(1)
    cv2.destroyAllWindows()
    # img_path = os.path.join(path,img_name)
    # img = cv2.imread(img_path)
    # cv2.resize(img,(w,h))

video.release()