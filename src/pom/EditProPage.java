package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class EditProPage extends BasePage {
	 @FindBy(xpath="//span[text()='ADD RESUME HEADLINE']")
	 private WebElement addreslink;
	 
	 @FindBy(xpath="//textarea[@rel='required:resumeHeadline,custom:validChar']")
	 private WebElement txtbox;
	 
	 @FindBy(xpath="//button[.='Save']")
	 private WebElement savebtn;

	 public EditProPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void addresumeheadline(WebDriver driver){
			BasePage.element2(driver, addreslink);
			addreslink.click();
		}
		
		public void enterheadline(String headline, WebDriver driver){
			BasePage.element1(driver, txtbox);
			txtbox.sendKeys(headline);
		}
		
		public void save(WebDriver driver){
			BasePage.element2(driver, savebtn);
			savebtn.click();
		}
}
