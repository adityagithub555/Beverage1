package pomliquids;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whiskey {

	
	@FindBy(xpath ="//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	private WebDriver driver;
	public Whiskey (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnAddtoCart() {
		addToCart.click();
	}
}
