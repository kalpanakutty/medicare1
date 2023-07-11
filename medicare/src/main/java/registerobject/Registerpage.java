package registerobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage {
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/div[3]/div/a")
	public static WebElement Registerhere;
	
	@FindBy(id="firstName")
	public static WebElement Firstname;
	
	@FindBy(id="lastName")
	public static WebElement Lastname;
	
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(id="contactNumber")
	public static WebElement contact;
	
	@FindBy(id="password")
	public static WebElement passsword;
	
	@FindBy(id="confirmPassword")
	public static WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id=\"registerForm\"]/div[7]/div/label[1]")
	public static WebElement checkbutton;
	
	@FindBy(xpath="//*[@id=\"registerForm\"]/div[8]/div/button")
	public static WebElement Nextbilling;
	
	//Address
	@FindBy(id="addressLineOne")
	public static WebElement Address1;
	
	@FindBy(id="addressLineTwo")
	public static WebElement Address2;
	
	@FindBy(id="city")
	public static WebElement city;
	
	@FindBy(id="postalCode")
	public static WebElement postalcode;
	
	@FindBy(id="state")
	public static WebElement state;
	
	@FindBy(id="country")
	public static WebElement country;
	
	@FindBy(xpath="//*[@id=\"billingForm\"]/div[7]/div/button[2]")
	public static WebElement Next;
	
	//confirmation
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/div/div/a")
	public static WebElement confirm;
	
	//login
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/div/div/div/a")
	public static WebElement login;
	
	//details
	@FindBy(id="username")
	public static WebElement Email;
	
	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[3]/div/input[2]")
	public static WebElement button;
	
}
