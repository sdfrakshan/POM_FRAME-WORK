package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class JobsInChennai extends BasePage {
        @FindBy(xpath="//a[@title='Chennai ']")
		private WebElement chenncheck;
		
        @FindBy(xpath="//li[@title='Job Openings for Devops Engineer at Merit Software Services']")
        private WebElement selectjoblink;
        
		public JobsInChennai(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void checktochennai(WebDriver driver){
			BasePage.element2(driver, chenncheck);
			chenncheck.click();
		}
		
		public void selectjob(WebDriver driver) {
			BasePage.element2(driver, selectjoblink);
			selectjoblink.click();
		}
}
