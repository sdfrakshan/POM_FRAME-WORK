package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage extends BasePage {
	
	 @FindBy(id="usernameField")
	 private WebElement usernametb;
	 
	 @FindBy(id="passwordField")
	 private WebElement passwordtb;
	 
	 @FindBy(xpath="//button[text()='Login']")
	 private WebElement loginbtn;
	 
	 public LoginPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void username(String em, WebDriver driver) {
		 BasePage.element1(driver, usernametb);
		 usernametb.sendKeys(em);
	 }
	 
	 public void password(String pwd, WebDriver driver) {
		 BasePage.element1(driver, passwordtb);
		 passwordtb.sendKeys(pwd);
	 }
	 
	 public void login( WebDriver driver) {
		 BasePage.element2(driver, loginbtn);
		 loginbtn.click();
	 }
}
