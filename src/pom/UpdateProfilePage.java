package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class UpdateProfilePage extends BasePage {
	@FindBy(xpath="//a[.='Update']")
	private WebElement updatereslink;
	
	public UpdateProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void updateres(WebDriver driver) {
		 BasePage.element2(driver, updatereslink);
		updatereslink.click();
	}
	
}
