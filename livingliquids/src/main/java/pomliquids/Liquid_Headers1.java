package pomliquids;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class Liquid_Headers1 {
		@FindBy(xpath ="(//li[@class='nav-item d-flex dropdown dropdown-on-hover position-static'])[5]/a")
		private WebElement spirits;
		
		@FindBy(xpath ="//a[text()='Whisky']")
		private WebElement whiskey;
		
		@FindBy(xpath ="//a[@class='d-inline-block fs-28 text-bravo btn-cart wbr-cmp-view-cart-button']")
		private WebElement addToCartIcon;
		
		
		//a[text()='Whisky']
		
		private WebDriver driver;
		public Liquid_Headers1 (WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		public void clickOnSpirits() {
			Actions act=new Actions(driver);
			act.moveToElement(spirits).click().build().perform();
			
		}
		public void clickonWhiskey() {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(whiskey));
			whiskey.click();
		}
		public void clickOnAddtoCartIcon() {
			addToCartIcon.click();
		}
	}



