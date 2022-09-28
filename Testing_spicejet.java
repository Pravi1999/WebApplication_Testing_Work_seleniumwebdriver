package intro;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing_spicejet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();
		String textcountry = "India";
/*
		// select country
		driver.findElement(By.id("autosuggest")).sendKeys(textcountry);
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']//a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}

		}*/

		// round trip
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();

		// one way
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		

		// from and to destination
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getText());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[2]/a")).click();
	
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[1]/a")).click();
		
		// pick today date
		driver.findElement(By.id("ctl00_mainContent_view_date1")).getText();
		driver.findElement(By.xpath("//td[@class='ui-datepicker-days-cell-over ui-datepicker-current-day ui-datepicker-today']")).click();

		// increasse adult count
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while (i < 5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());

		// checkboxes
		assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);

		// to exec comment below line
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
			assertTrue(true);
		} else {
			assertTrue(false);

		}


		// currency selection
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.deselectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
			// senior citizen select
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);


		// search option
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
