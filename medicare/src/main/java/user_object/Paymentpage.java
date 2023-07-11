package user_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paymentpage {
	@FindBy(id="cardNumber")
	public static WebElement cardno;
	
	@FindBy(id="expityMonth")
	public static WebElement MM;
	
	@FindBy(id="expityYear")
	public static WebElement YY;
	
	@FindBy(id="cvCode")
	public static WebElement CV;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/div[2]/a")
    public static WebElement Pay;
}