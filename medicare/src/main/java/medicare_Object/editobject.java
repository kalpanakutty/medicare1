package medicare_Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class editobject {
	@FindBy(id="listProducts")
	public static WebElement ViewProducts;
	@FindBy(xpath="//*[@id=\"productListTable\"]/tbody/tr[1]/td[6]/a[2]")
	public static WebElement editbtn;
	@FindBy(id="name")
	public static WebElement name;
	@FindBy(id="quantity")
	public static WebElement Quantity;
	@FindBy(name="submit")
	public static WebElement save;

}
