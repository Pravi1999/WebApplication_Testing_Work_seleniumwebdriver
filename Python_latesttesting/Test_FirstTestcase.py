# from selenium.webdriver import Chrome
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support import select
import time
def testcase():
    # from selenium.webdriver import s
    # path="C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.872\\chromedriver.exe")
    s = Service("C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.786\\chromedriver.exe")
    # driver=Chrome(executable_path=path)
    driver = webdriver.Chrome(service=s)
    driver.implicitly_wait(10)
    driver.get("http://www.thetestingworld.com/testings")

    # Maximize the browser
    driver.maximize_window()
    driver.find_element(By.NAME,'fld_username').send_keys('Hello')
    #driver.set_page_load_timeout(2)
    #time.sleep(10)
    driver.find_element(By.XPATH, '//input[@name="fld_email"]').send_keys('testingworldindia@gmail.com')
    driver.find_element(By.NAME,'fld_password').send_keys('testingworldi')
    driver.find_element(By.NAME,'fld_cpassword').send_keys("worldindia")

    driver.find_element(By.NAME,"fld_username").clear()
    driver.find_element(By.NAME,"fld_username").send_keys("worldindia")

    # working with the radio button
    driver.find_element(By.XPATH,'//input[@value="home"]').click()
    driver.find_element(By.XPATH,'//input[@value="office"]').click()

    driver.get_screenshot_as_file('C:\\Users\\N B KASI REDDY\\PycharmProjects\\PythonBasicProgramming\\T'
                                  'est Automation\\library\\beforeregistimage.png')
    """
    #click on checkboxes
    driver.find_element(By.NAME,"terms").click()

    #work on button
    driver.find_element(By.XPATH,'//input[@type="submit"]').click()

    #click on link
    driver.find_element(By.LINK_TEXT, 'Read Detail').click()

    #work on dropdown list
    obj=select(driver.find_element(By.NAME))
    obj.select_by_index(1)
    obj.select_by_value('2')

    #select any value by text

    obj.select_by_visible_text("male")
    # obj.deselect_by_value()"""
    driver.close()
