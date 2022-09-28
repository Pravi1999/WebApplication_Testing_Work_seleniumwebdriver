# from selenium.webdriver import Chrome
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support import select

def test_verify_registation():
    # from selenium.webdriver import s
    # path="C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.872\\chromedriver.exe")
    s = Service("C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.786\\chromedriver.exe")
    # driver=Chrome(exe
    #
    #
    #
    # cutable_path=path)
    driver = webdriver.Chrome(service=s)
    driver.get("http://www.thetestingworld.com/testings")

    # Maximize the browser
    driver.maximize_window()
    print(driver.title)
    print("Title of the page is " +driver.title)

    print("Page URL is" +driver.current_url)

    # print(driver.page_source)
    print("Text on link is" +driver.find_element(By.CLASS_NAME,'display popup').text)
    print("value of button is" +driver.find_element(By.XPATH,'//input[@type="Label"]')).get_attribute('value')