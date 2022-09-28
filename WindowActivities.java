package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				  
		  driver.manage().window().maximize();
		  driver.get("http://google.com");
		  driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		  driver.navigate().back();
		  driver.navigate().forward();
		 
	}

}
