import logging

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

def take_screendhot(driver,name):

    driver.get_screenshot_as_file('C:\\Users\\N B KASI REDDY\\PycharmProjects\\PythonBasicProgramming\\T'
                                  'est Automation\\library' +name+'.png')

s = Service("C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.786\\chromedriver.exe")
driver = webdriver.Chrome(service=s)
"""
driver.get("http://demo.guru99.com/test/guru99home/")
driver.maximize_window()
driver.switch_to.frame("googlefcInactive")
driver.find_element(By.XPATH,'//a[contains(text(),"Selenium")]').click()

#driver.switch_to.frame(driver.find_element(By.XPATH,'//a[contains(text(),"Read more"]'))
#driver.find_element(By.XPATH,'//a[contains(text(),"Read more")]').click()
#driver.switch_to.default_content()
#driver.find_element(By.XPATH,'').click()

"""
#step 2
log = logging.getLogger(__name__)
log.setLevel(logging.DEBUG)

#step3
warn = logging.FileHandler('Warning_logs.txt')
warn.setLevel(logging.WARNING)
info = logging.FileHandler('Infor_logs.txt')
info.setLevel(logging.INFO)

#step 4
formatter = logging.Formatter('%(asctime)s - %(name)a - %(levelname)a - %(message)s')
#step 5
warn.setFormatter(formatter)
info.setFormatter(formatter)

driver.get("http://www.thetestingworld.com/testings")
driver.maximize_window()
log.info("[ My URL is opened]")
log.warning(" [There is a delay in opening of the browser]")

"""Allwindow=driver.window_handles
print(Allwindow)
mainWin=""
driver.maximize_window()
driver.find_element(By.XPATH,'//label[text()="Login"]').click()
driver.find_element(By.NAME, '_txtUserName').send_keys('text')
driver.find_element(By.NAME, '_txtPassword').send_keys('text')
driver.find_element(By.XPATH,'//input[@type="submit" and @value="Login"]').click()
driver.find_element(By.XPATH,'//a[contains(text(),"MyAccount")]').click()
driver.find_element(By.XPATH,'//a[contains(text(),"Delete")]').click()
allTabs=driver.window_handles
print(allTabs)
for tab in allTabs:
    driver.switch_to.window(tab)
    print(driver.current_url)
    if(driver.current_url=="http://www.thetestingworld.com//testing//manage_customer.php"):
        driver.find_element(By.XPATH,'//button[test()="start Download"]').click()
for win in Allwindow:
    driver.switch_to(win)
    print(driver.current_url)  
if(driver.current_url=="https://www.naukri.com/"):
    print("This is my curent window")
    mainWin=win
else:
    driver.close()
#driver.switch_to(mainWin)
print(driver.current_url)
take_screendhot(driver,'deeta')
driver.execute_script("window.scrollTo(0,400);")
"""