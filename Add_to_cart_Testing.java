package intro;

import java.sql.Driver;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

public class Add_to_cart_Testing {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Corn", "Beetroot", "Cauliflower" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// Add_to_cart_Testing a=new Add_to_cart_Testing();

		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		w.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		// After entering promo code
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {

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