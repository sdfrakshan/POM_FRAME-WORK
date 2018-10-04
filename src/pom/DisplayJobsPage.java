package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class DisplayJobsPage extends BasePage {
	@FindBy(className="desig")
	private WebElement displayedjob;
	
	public DisplayJobsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectjob(WebDriver driver) {
		BasePage.element2(driver, displayedjob);
		displayedjob.click();
	}
}
