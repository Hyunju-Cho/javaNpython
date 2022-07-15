from selenium.webdriver import Edge
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

from urllib.request import urlretrieve #이미지 파일 다운로드
from tqdm import tqdm
import os

findstr='강아지'

url='xls_pyauto_sele_work/msedgedriver.exe'

web=Edge(url)
web.get('http://www.naver.com')

#네이버에 강아지 검색
elem=web.find_element(By.ID,'query')
elem.send_keys(findstr)
time.sleep(1)
elem.send_keys(Keys.ENTER)

#이미지 클릭
time.sleep(1)
elem=web.find_element(By.LINK_TEXT,'이미지')
elem.click()

#이미지 썸네일들 저장
time.sleep(1)
elem=web.find_elements(By.CSS_SELECTOR,'.sp_nimage .photo_tile .photo_bx .link_thumb>img')
for i in range(3):
    elem[i].click()
    time.sleep(1)

result=[]
for img in tqdm(elem): #이미지 주소 리스트에 넣음
    if "http" in img.get_attribute("src"):
        result.append(img.get_attribute("src"))

print(result)

#강아지 폴더 만들기
if not os.path.isdir("./{}".format(findstr)):
    os.mkdir("./{}".format(findstr))

#이미지 주소에 jpg라는 문자열 찾기
for index,link in tqdm(enumerate(result)):
    start=link.rfind(".")
    print('start = ',start)
    end=link.rfind("&")
    print('end = ',end)
    filetype=link[start:end]

    urlretrieve(link,"./{}/{}{}{}".format(findstr,findstr,index,filetype)) #이미지 저장

time.sleep(3)
web.quit()

