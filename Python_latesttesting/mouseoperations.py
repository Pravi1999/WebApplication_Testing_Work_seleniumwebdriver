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
# Mouse operations
act = ActionChains(driver)
act.click().perform()
act.context_click().perform()

#click on the logout or click with element locator
driver.find_element(By.XPATH,'//a[text()="Logout"]').perform()

act.click().perform()

act.context_click().perform()
act.context_click(driver.find_element(By.XPATH,'//a[text()="login"]')).perform()

act.double_click().perform()
act.double_click(driver.find_element(By.XPATH,'//a[text()="login"]')).perform()

act.move_to_element(driver.find_element(By.XPATH,'//xpath[contins(text()="TUTORIA")]')).perform()

