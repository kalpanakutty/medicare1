package medicare_Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Enableobject {
	@FindBy(xpath=("/html/body/div[2]/div[1]/div/h1"))
	public static WebElement AvalibleProducts;
	@FindBy(xpath="//*[@id=\"productsTable\"]/tbody/tr[1]/td[7]/label/div")
public static WebElement disable;
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
public static WebElement popout1;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/button")
	public static WebElement popout2;
	@FindBy(xpath="//*[@id=\"productsTable\"]/tbody/tr[1]/td[7]/label/div")
public static WebElement Enable;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/button")
public static WebElement popout3;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/button")
	public static WebElement popout4;
	//logout
	@FindBy(xpath="//*[@id=\"dropdownMenu1\"]")
	public static WebElement Logout;
	@FindBy(id="logout")
	public static WebElement Logout2;
	
}
