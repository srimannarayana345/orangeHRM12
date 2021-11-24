package ABC_Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver ;
	
	
	@Test
	public void Login_Test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("http://demowebshop.tricentis.com/");
		
		
		
	

	driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    driver.findElement(By.name("text-box single-line")).sendKeys("harika");
	//driver.findElement(By.name("login
	
	}
}
