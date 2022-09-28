package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassengerUPdatedjava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		 driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		  Thread.sleep(2000);
		  int i=1;
		  while(i<5)
		  {
			  driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			  i++;
			 }
		  
	   driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		  
	   
	}

}
