import pyautogui

pyautogui.hotkey('win','r')
pyautogui.write('mspaint')
pyautogui.hotkey('enter')

pyautogui.sleep(1)
img = pyautogui.locateOnScreen('pyauto_work/A.png', confidence=0.9)
pyautogui.click(img)

pyautogui.move(0,300)
pyautogui.click()
pyautogui.write('abcde')

pyautogui.sleep(2)
win1=pyautogui.getActiveWindow()
win1.close()

pyautogui.sleep(1)
pyautogui.hotkey('n')