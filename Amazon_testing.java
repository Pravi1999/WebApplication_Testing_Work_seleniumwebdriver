package intro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_testing {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://google.com");
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();

		// login into amazon
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.id("ap_email")).click();
		driver.findElement(By.id("ap_email")).sendKeys("user_id");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		// search for items
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watches for ladies");

		driver.navigate().to(
				"https://www.amazon.in/Noise-ColorFit-Display-Monitoring-Smartwatches/dp/B09PNKXSKF/ref=sr_1_7?keywords=Watches&qid=1664092858&qu=eyJxc2MiOiI5LjQ2IiwicXNhIjoiOS45OCIsInFzcCI6IjcuODYifQ%3D%3D&sr=8-7");

		// add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.navigate().back();
		driver.navigate().to(
				"https://www.amazon.in/French-Connnection-Analog-Womens-Watch-FC20-63C-R/dp/B09BL7GNFD/ref=sr_1_16?crid=2V0SHUTIP4M97&keywords=watches+for+women&qid=1664101005&qu=eyJxc2MiOiI5LjgxIiwicXNhIjoiMTAuMjYiLCJxc3AiOiI4LjAzIn0%3D&sprefix=watches+for+%2Caps%2C793&sr=8-16");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.navigate().back();
		driver.navigate().to(
				"https://www.amazon.in/ADAMO-Analog-Rose-Womens-Watch-839KKM21/dp/B07QXKK81H/ref=sr_1_14?crid=2V0SHUTIP4M97&keywords=watches+for+women&qid=1664101005&qu=eyJxc2MiOiI5LjgxIiwicXNhIjoiMTAuMjYiLCJxc3AiOiI4LjAzIn0%3D&sprefix=watches+for+%2Caps%2C793&sr=8-14");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.navigate().back();

		driver.navigate().to(
				"https://www.amazon.in/ADAMO-Analog-Rose-Womens-Watch-839KKM21/dp/B07QXKK81H/ref=sr_1_14?crid=2V0SHUTIP4M97&keywords=watches+for+women&qid=1664101005&qu=eyJxc2MiOiI5LjgxIiwicXNhIjoiMTAuMjYiLCJxc3AiOiI4LjAzIn0%3D&sprefix=watches+for+%2Caps%2C793&sr=8-14");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.navigate().back();

		driver.navigate().to(
				"https://www.amazon.in/Timex-Analog-Gold-Womens-Watch-TW000Q810/dp/B014HDPQ8G/ref=sr_1_27?crid=2V0SHUTIP4M97&keywords=watches+for+women&qid=1664101005&qu=eyJxc2MiOiI5LjgxIiwicXNhIjoiMTAuMjYiLCJxc3AiOiI4LjAzIn0%3D&sprefix=watches+for+%2Caps%2C793&sr=8-27");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.navigate().back();

		// going to cart
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		// check if there are 5 elements in cart
		String i = driver.findElement(By.xpath("//input[@name='partialCheckoutCart']")).getAttribute("value");

		// make payment
		driver.findElement(By.xpath("//input[@data-feature-id='proceed-to-checkout-action']")).click();
		driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
		driver.findElement(By.xpath("//input[@id='pp-FEI4J4-92']")).click();
		driver.findElement(By.xpath("//input[@id='pp-FEI4J4-92']")).sendKeys("bcdsjfhsd");
		driver.findElement(By.xpath("//input[@name='ppw-claimCodeApplyPressed']")).click();
		driver.findElement(By.id("pp-FEI4J4-106")).sendKeys("120");
		driver.findElement(By.id("pp-FEI4J4-119")).click();
		driver.findElement(By.id("pp-FEI4J4-122")).click();

		// add a credit or debit card and payment
		Thread.sleep(1000);
		driver.findElement(By.id("pp-5O4skB-15")).click();
		driver.findElement(By.id("pp-5O4skB-15")).sendKeys("12234567890456789");
		driver.findElement(By.xpath("\\input[@name='ppw-widgetEvent:AddCreditCardEvent']")).click();
		driver.findElement(By.xpath("\\input[@data-pmts-component-id='pp-FEI4J4-5']")).click();

		// place the order
		driver.findElement(By.id("submitOrderButtonId-announce")).click();
		// go to logout page
		driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		driver.findElement(By.id("nav-item-signout"));
	}
}
