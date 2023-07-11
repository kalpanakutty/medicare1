package registertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import registerobject.Registerpage;
public class Registertestcase {
@Test()
public void launchpage() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver",
			"/home/kalpanakutty49g/Downloads/chromedriver.exe"); 
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:9001/medicare/");
	Thread.sleep(3000);
	driver.findElement(By.id("login")).click();
//Registerpage
	PageFactory.initElements(driver,Registerpage.class);
	Registerpage.Registerhere.click();
	Thread.sleep(20000);
	Registerpage.Firstname.sendKeys("Kalpanakutty49@yahoo.com");
	Thread.sleep(3000);
	Registerpage.Lastname.sendKeys("dada");
	Registerpage.email.sendKeys("kalpana@123");
	Registerpage.contact.sendKeys("12345");
	Registerpage.passsword.sendKeys("ladu");
	Registerpage.confirmpassword.sendKeys("ladu");
	Thread.sleep(30000);
	Registerpage.checkbutton.click();
	Thread.sleep(30000);
	Registerpage.Nextbilling.click();
	
	//Address
	Thread.sleep(3000);
	Registerpage.Address1.sendKeys("lulu mall");
	Registerpage.Address2.sendKeys("lulu mall");
	Registerpage.city.sendKeys("coimbatore");
	Registerpage.postalcode.sendKeys("641042");
	Registerpage.state.sendKeys("Tamilnadu");
	Registerpage.country.sendKeys("India");
	Thread.sleep(30000);
	Registerpage.Next.click();
	
	//confirmation
	Thread.sleep(30000);
	Registerpage.confirm.click();
	
	//login
	Thread.sleep(30000);
	Registerpage.login.click();
//	
//	//Details
	Registerpage.Email.sendKeys("Kalpana@123");
	Registerpage.Password.sendKeys("ladu");
	Thread.sleep(30000);
	Registerpage.button.click();
	
	
	
	
	
	
	
	}
}
