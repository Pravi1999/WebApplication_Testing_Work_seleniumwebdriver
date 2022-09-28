from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.by import By
from selenium.webdriver import Firefox
import time
# from selenium.webdriver import s
# path='C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.872\\chromedriver.exe")
s = Service("C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.522\\geckodriver.exe")
# driver=Chrome(executable_path=path)
driver = webdriver.Firefox(service=s)
driver.get("http://www.thetestingworld.com/testings")

# Maximize the browser
driver.maximize_window()

driver.find_element(By.NAME, 'fld_username').send_keys('Hello')

driver.find_element(By.XPATH, '//input[@name="fld_email"]').send_keys('testingworldindia@gmail.com')
"""
#perform keyboard operations
obj= Select (driver.find_element(By.NAME,'sex'))
print(obj.first_selected_option.text)
print(obj.options)
for op in obj.options:
    print(op.text)
"""