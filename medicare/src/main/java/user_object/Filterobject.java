package user_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filterobject {
	@FindBy(xpath="//*[@id=\"productListTable_length\"]/label/select")
	public static WebElement Dropdown;

}
