package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.thread.ThreadExecutionException;

import com.google.common.escape.Escaper;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='icon-geico']")
	WebElement logo;
	
	@FindBy(xpath ="(//input[@class='zip-code-input'])[1]")
	WebElement zipCode;
	@FindBy(xpath = "(//span[@class='lang-toggle'])[1]")
	WebElement espanol;
	
	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}
	public void clickZipCode() {
		zipCode.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
