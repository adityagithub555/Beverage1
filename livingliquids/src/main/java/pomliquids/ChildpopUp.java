package pomliquids;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildpopUp {
	@FindBy(xpath = "(//a[@class='d-inline-block no-decor mx-2'])[2]")
	private WebElement google;

	private WebDriver driver;

	public ChildpopUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnGoogle() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", google);
		Thread.sleep(5000);
		google.click();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		String childbrowserUrl = driver.getCurrentUrl();
		System.out.println(childbrowserUrl);

	}
}
