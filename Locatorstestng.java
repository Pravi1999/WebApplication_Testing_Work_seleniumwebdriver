package intro;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.input.model.DragData;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Locatorstestng {

	public static void main(String[] args) throws InterruptedException{

	String name="xsrahul";
	System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait - 5 secondsS wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	String password=getPassword(driver);
	driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
	//driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	System.out.println(driver.findElement(By.tagName("p")).getText());
	//assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	Thread.sleep(1000);
	//assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
	assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " +name+ ",");
	driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	driver.close();

		/*
	 
	  
	  driver.get("https://www.spicejet.com");
	
	driver.get("http://www.rahulshettyacademy.com/dropdownspractise/");
	driver.findElement(By.id("autoSugest")).sendKeys("ind");
	Thread.sleep(2000);
	List<WebElement> options=driver.findElement(By.cssSelector("li[class='ui-menu-item']a"));
	for(WebElement option : options)
	{
		if(option.getText().equalsIgnoreCase("India"))
		{
			option.click();
			break;
		}
	}
	*/
	}

public static String getPassword(WebDriver driver) throws InterruptedException
{
	  driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
	  driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	  String passwordText=driver.findElement(By.cssSelector(".infoMsg")).getText();
	  
	  //temporary password "rahulshettyacademy"
	  
	  //passwordText.split("'");
	  String[] passwordArray=passwordText.split("'");
	  String[] passwordArray2 = passwordArray[1].split("'");
	  String password=passwordArray[1].split("'")[0];
	 
	  return password;
	  
}
}