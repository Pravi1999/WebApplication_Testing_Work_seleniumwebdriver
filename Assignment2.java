package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:/software files/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.rahulshettyacademy.com/angularpractice/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//enter name
driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input[@name='name']")).click();
driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input[@name='name']")).sendKeys("xyzta");
//enter email
driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@name='email']")).click();
driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@name='email']")).sendKeys("sita122@gmail.com");
//enter password
driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).click();
driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("rammnsjcs");
//click on checkbox
driver.findElement(By.id("exampleCheck1")).click();
driver.findElement(By.id("exampleFormControlSelect1")).click();
//Select gender
driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']//option[text()='Male']")).click();
driver.findElement(By.id("inlineRadio1")).click();
//Enter dob
driver.findElement(By.xpath("//input[@name='bday']")).click();
driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("2000-09-09");
//click on submit
driver.findElement(By.xpath("//input[@value='Submit']")).click();
//get the text

System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
}
	
}
