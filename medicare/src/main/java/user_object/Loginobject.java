package user_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginobject {
	@FindBy(id="username")
	public static WebElement email;
    @FindBy(id ="password")
	public static WebElement password;
    @FindBy(xpath=("//*[@id=\"loginForm\"]/div[3]/div/input[2]"))
	public static WebElement login;
}
