package user_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocart {
	@FindBy(xpath="//*[@id=\"productListTable_length\"]/label/select")
	public static WebElement All;
	
	@FindBy(xpath="//*[@id=\"productListTable\"]/tbody/tr[5]/td[6]/a[2]")
	public static WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"cart\"]/tbody/tr/td[3]")
	public static WebElement Quantity;
	
	@FindBy(xpath="//*[@id=\"cart\"]/tfoot/tr[2]/td[4]/a")
	public static WebElement checkout;
	
	@FindBy(id="addressLineOne")
	public static WebElement Addressline1;
	
	@FindBy(id="addressLineTwo")
	public static WebElement Addressline2;
	
	@FindBy(id="city")
	public static WebElement city;
	
	@FindBy(id="postalCode")
	public static WebElement postalcode;
	
	@FindBy(id="state")
	public static WebElement state;
	
	@FindBy(id="country")
	public static WebElement country;
	
	@FindBy(xpath="//*[@id=\"billingForm\"]/div[7]/div/button")
	public static WebElement Add;
	
	

}
