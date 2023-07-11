package user_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {
	@FindBy(xpath="/html/body/div/div[1]/div/div[4]/a")
	public static WebElement continueshopping;
	@FindBy(id="dropdownMenu1")
	public static WebElement dropdown;
	@FindBy(id="logout")
	public static WebElement Logout;

}
