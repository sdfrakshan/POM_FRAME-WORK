package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class BrowseJobsPage extends BasePage{

	@FindBy(xpath="//a[@title='Govt. Jobs']")
	//@FindBy(xpath="//a[.='Govt Jobs']")
	private WebElement govtlink;

public BrowseJobsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickgovtlink(WebDriver driver){
	BasePage.element2(driver, govtlink);
	govtlink.click();
}
}
