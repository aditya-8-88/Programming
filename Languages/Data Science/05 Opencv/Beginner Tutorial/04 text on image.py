import cv2
import numpy as np
 
img_path = r"""F:\Aditya\Studies\College\00 Programing\02 Data Science\05 Opencv\Beginner Tutorial\data images\21830_uhd.jpg"""
 
image = cv2.imread(img_path)
image = cv2.resize(image, (400,900))
 
text = "Hello"
org = (100, 200)
font = cv2.FONT_HERSHEY_COMPLEX
fontScale = 2
color = (0,0,255)  #(B, G, R)
thickness = 3
lineType = cv2.LINE_AA
bottomLeftOrigin = False
# bottomLeftOrigin = True #for making text inverse
 
# Syntax>> cv2.putText(image, text, org, font, fontScale, color[, thickness[, lineType[, bottomLeftOrigin]]])
 
img_text = cv2.putText(image, text, org, font, fontScale, color, thickness, lineType, bottomLeftOrigin)
 
cv2.imshow("Text Image", img_text)
 
cv2.waitKey(0)
cv2.destroyAllWindows()


# printing text with reflection

# import cv2
# import numpy as np
 
# img_path = r"C:\Users\kashz\AI Life\AI Projects - IAIP, PTs (Web + Channel)\02 OpenCV\000 opencv tutorial\data\images\adult-beautiful-beauty-1464523.jpg"
 
# image = cv2.imread(img_path)
 
# image = cv2.resize(image, (1280, 720))
 
# text = "Model"
# org = (100, 200)
# font = cv2.FONT_HERSHEY_COMPLEX
# fontScale = 6
 
# color = (0,0,255)  #(B, G, R)
# thickness = 3
# lineType = cv2.LINE_AA
# bottomLeftOrigin = True
 
# # cv2.putText(image, text, org, font, fontScale, color[, thickness[, lineType[, bottomLeftOrigin]]])
# img_text = cv2.putText(image, text, org, font, fontScale, color, thickness, lineType, bottomLeftOrigin)
 
# img_text = cv2.putText(image, text, org, font, fontScale, color, thickness, lineType, bottomLeftOrigin=False)
 
# cv2.imshow("Text Image", img_text)
 
# cv2.waitKey(0)
# cv2.destroyAllWindows()


# Text with different color and font with size

# import cv2
# import numpy as np
 
# img_path = r"C:\Users\kashz\AI Life\AI Projects - IAIP, PTs (Web + Channel)\02 OpenCV\000 opencv tutorial\data\images\adult-beautiful-beauty-1464523.jpg"
 
# image = cv2.imread(img_path)
 
# image = cv2.resize(image, (1280, 720))
 
# text = "Indian AI Production"
# org = (50, 100)
# font = cv2.FONT_HERSHEY_COMPLEX_SMALL
# fontScale = 4
 
# color = (87,67,23)  #(B, G, R)
# thickness = 3
# lineType = cv2.LINE_AA
# bottomLeftOrigin = True
 
# # cv2.putText(image, text, org, font, fontScale, color[, thickness[, lineType[, bottomLeftOrigin]]])
# img_text = cv2.putText(image, text, org, font, fontScale, color, thickness, lineType, bottomLeftOrigin)
 
# img_text = cv2.putText(image, text, org, font, fontScale, color, thickness, lineType, bottomLeftOrigin=False)
 
# cv2.imshow("Text Image", img_text)
 
# cv2.waitKey(0)
# cv2.destroyAllWindows()


# Font Style

# //! Only a subset of Hershey fonts
# enum HersheyFonts {
#     FONT_HERSHEY_SIMPLEX        = 0, //!< normal size sans-serif font
#     FONT_HERSHEY_PLAIN          = 1, //!< small size sans-serif font
#     FONT_HERSHEY_DUPLEX         = 2, //!< normal size sans-serif font (more complex than FONT_HERSHEY_SIMPLEX)
#     FONT_HERSHEY_COMPLEX        = 3, //!< normal size serif font
#     FONT_HERSHEY_TRIPLEX        = 4, //!< normal size serif font (more complex than FONT_HERSHEY_COMPLEX)
#     FONT_HERSHEY_COMPLEX_SMALL  = 5, //!< smaller version of FONT_HERSHEY_COMPLEX
#     FONT_HERSHEY_SCRIPT_SIMPLEX = 6, //!< hand-writing style font
#     FONT_HERSHEY_SCRIPT_COMPLEX = 7, //!< more complex variant of FONT_HERSHEY_SCRIPT_SIMPLEX
#     FONT_ITALIC                 = 16 //!< flag for italic font
# };


# LineTyle

# cv::LineTypes {
#   cv::FILLED = -1,
#   cv::LINE_4 = 4,
#   cv::LINE_8 = 8,
#   cv::LINE_AA = 16


