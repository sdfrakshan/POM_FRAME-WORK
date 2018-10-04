package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class TermsPage extends BasePage{
	@FindBy(xpath="//a[.='Privacy Policy']")
	private WebElement prilink;
	
	public TermsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void privacy(WebDriver driver) {
		BasePage.element2(driver, prilink);
		prilink.click();
	}
}
