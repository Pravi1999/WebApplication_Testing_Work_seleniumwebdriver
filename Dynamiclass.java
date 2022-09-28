package intro;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamiclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).getText());
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[text()='AGR']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).getText());
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//div[text()='AMD']")).click();
		driver.findElement(By.xpath("//td[@class='ui-datepicker-days-cell-over  ui-datepicker-today']"));
		
		

		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
	}

}
