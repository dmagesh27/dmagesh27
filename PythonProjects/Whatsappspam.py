import pyautogui
import time

words = open("words.txt", 'r')
time.sleep(3)



for word in words:
    pyautogui.typewrite(words)
    pyautogui.press('enter')
    time.sleep(2)
