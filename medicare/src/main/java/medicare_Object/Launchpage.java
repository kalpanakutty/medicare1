package medicare_Object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Launchpage {

	@Test
	public void launchpage(){
		System.setProperty("webdriver.chrome.driver",
				"/home/kalpanakutty49g/Downloads/chromedriver.exe"); 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:9001/medicare/");
		driver.findElement(By.id("login")).click();  
	};

}
