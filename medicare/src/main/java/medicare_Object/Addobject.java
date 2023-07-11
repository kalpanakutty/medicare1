package medicare_Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addobject {
@FindBy(id="name")
	public static WebElement Name;
@FindBy(id="brand")
	public static WebElement Brand;
@FindBy(id="description")
	public static WebElement Description;
@FindBy(id="unitPrice")
	public static WebElement Unitprice;
@FindBy(id="quantity")
	public static WebElement Quantity;
@FindBy(id="file")
	public static WebElement upload;
@FindBy(id="categoryId")
	public static WebElement Category;
@FindBy(name="submit")
	public static WebElement save;
	
	
}
