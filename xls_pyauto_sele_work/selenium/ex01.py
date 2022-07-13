from selenium.webdriver import Edge
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

url='xls_pyauto_sele_work/msedgedriver.exe'

web=Edge(url)
web.get('http://www.naver.com')

elem=web.find_element(By.ID,'query')
elem.send_keys('제주도 여행')
time.sleep(1)
elem.send_keys(Keys.ENTER)

time.sleep(1)
elem=web.find_element(By.LINK_TEXT,'이미지')
elem.click()

time.sleep(1)
elem=web.find_elements(By.CSS_SELECTOR,'.sp_nimage .photo_tile .photo_bx .link_thumb>img')
for i in range(3):
    elem[i].click()
    time.sleep(1)

time.sleep(3)
web.quit()

