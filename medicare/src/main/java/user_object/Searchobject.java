package user_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchobject {
	@FindBy(xpath="//*[@id=\"listProducts\"]/a")
	public static WebElement ViewProducts;
	@FindBy(xpath="//*[@id=\"productListTable_filter\"]/label/input")
	public static WebElement Search;

}
