package intro;

import java.sql.Driver;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_cart_Testing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Corn", "Beetroot", "Cauliflower" };
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		//Add_to_cart_Testing a=new Add_to_cart_Testing();
		addItems(driver, itemsNeeded);
		
		

	}
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String[] itemname = products.get(i).getText().split("-");
			String formattedName = itemname[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				// Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
			
		}
	}
	
	
}