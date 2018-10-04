package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class TraineeLibJobPage extends BasePage {
@FindBy(xpath="//button[@class='blueBtn']")
private WebElement applybtn;

public TraineeLibJobPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void applyjob(WebDriver driver) {
	BasePage.element2(driver, applybtn);
	applybtn.click();
}
}
