from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
import time
s = Service("C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.786\\chromedriver.exe")
# driver=Chrome(executable_path=path)
driver = webdriver.Chrome(service=s)
driver.get("http://www.thetestingworld.com/testings")

# Maximize the browser
driver.maximize_window()
driver.find_element(By.NAME,'fld_username').send_keys('Hello')

act=ActionChains(driver)
act.send_keys(Keys.TAB).perform()

# execute till the above and commnet the above line
act.key_down(Keys.CONTROL).send_keys('a').perform()
time.sleep(12)

