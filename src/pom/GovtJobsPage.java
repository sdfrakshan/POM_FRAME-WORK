package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class GovtJobsPage extends BasePage {
	@FindBy(xpath="//li//a[@title='Indian Institute of Management Rohtak Recruitment']")
	//@FindBy(xpath="//a[@target='_blank']")
	//@FindBy(xpath="//span[.='View 39 Jobs']")
	private WebElement selectlink;

@FindBy(xpath="//li[@title='Trainee-Library']")
private WebElement iimjob;

public GovtJobsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void selectgovsector(WebDriver driver) {
	BasePage.element2(driver, selectlink);
	selectlink.click();
}

public void selectjob(WebDriver driver) {
	BasePage.element2(driver, iimjob);
	iimjob.click();
}
}
