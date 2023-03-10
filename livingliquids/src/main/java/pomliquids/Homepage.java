package pomliquids;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	@FindBy(xpath = "//a[text()='PLATINUM']")
	private WebElement platinium;
	
	@FindBy(xpath ="//h3[text()='experience luxury from your home']")
	private WebElement text;
	
	//h3[text()='experience luxury from your home']

	private WebDriver driver;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnPlatinium() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", text);
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(platinium));
		platinium.click();
		driver.close();

	}

}
