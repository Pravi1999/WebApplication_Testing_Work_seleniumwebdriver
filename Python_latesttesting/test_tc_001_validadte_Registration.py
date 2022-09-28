import selenium.webdriver.chrome
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.support.wait import WebDriverWait
import selenium.webdriver.support.expected_conditions as ec
from selenium.webdriver.common.by import By
import pytest
from selenium.webdriver.support import select

# @pytest.mark.skip("Don't want to execute on current built")
# @pytest.mark.Sanity


@pytest.fixture()
def setPath():

    s = Service("C:\\Users\\N B KASI REDDY\\AppData\\Local\\Temp\\Rar$EXa0.786\\chromedriver.exe")
    driver = webdriver.Chrome(service=s)
    global driver
    yield
    driver.close()


def test_registration_valid_data(setPath):
    wait = WebDriverWait(driver, 200)
    wait.until(ec.text_to_be_present_in_element(By.ID, 'countryId'), 'India')
    obj.select_by_varible_text('countryId')
    driver.get("http://www.thetestingworld.com/testings")
    driver.maximize_window()
    assert driver.title == "Login & Sign Up Forms"
    driver.get("http://www.thetestingworld.com/testings")

    # Maximize the browser
    driver.maximize_window()
    driver.find_element(By.NAME, 'fld_username').send_keys('Hello')

    driver.find_element(By.XPATH, '//input[@name="fld_email"]').send_keys('testingworldindia@gmail.com')
    driver.find_element(By.NAME, 'fld_password').send_keys('testingworldi')
    driver.find_element(By.NAME, 'fld_cpassword').send_keys("worldindia")

    driver.find_element(By.NAME, "fld_username").clear()
    driver.find_element(By.NAME, "fld_username").send_keys("worldindia")

    # working with the radio button
    driver.find_element(By.XPATH, '//input[@value="home"]').click()
    driver.find_element(By.XPATH, '//input[@value="office"]').click()
    obj = select(driver.find_element(By.ID,'countryId'))
    global obj
    obj.select_by_varible_text('India')
    # click on checkboxes
    driver.find_element(By.NAME, "terms").click()
    assert driver.current_url()

#@pytest.mark.Smoke
def test_registration_invalid_data(setPath):
    driver.get("http://www.thetestingworld.com/testings")
    driver.maximize_window()
    assert driver.title == 'Login & Sign Up Forms'


# a=101
# @pytest.mark.skipif(a>100, reason="Don't want to execute on current build")
# @pytest.mark.Smoke
def test_invalid_data(setPath):
    driver.get("http://www.thetestingworld.com")
    driver.maximize_window()
    # a=90
    # @not pytest.mark.skipif(a>100, reason="Don't want to execute on current build").mark()
    assert driver.title == 'Testing World Experienced in making experts'


