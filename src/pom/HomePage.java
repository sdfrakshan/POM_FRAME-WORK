package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage {
	//@FindBy(className="inpWrap")
	@FindBy(id="qsb-keyskill-sugg")
	private WebElement searchtb;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-large white-text']")
	private WebElement updateprobtn;
	
	@FindBy(linkText="CREATE CUSTOM JOB ALERTS")
	private WebElement createalertlink;
	
	//@FindBy(id="qsb-location-sugg")
	@FindBy(xpath="//input[@placeholder='Location/Locality']")
	private WebElement searchbyloctb;
	
	@FindBy(xpath="//div[.='Jobs']")
	private WebElement joblink;
	
	@FindBy(xpath="//div[@class='mTxt']")
	//@FindBy(xpath="//div[.='My Naukri']")
	private WebElement mynaukrlink;
	
	@FindBy(xpath="//a[@title='Edit Profile']")
	private WebElement editprofilelink;		
	
	@FindBy(xpath="//a[@title='Terms & Conditions']")
	private WebElement tclink;
	
	@FindBy(xpath="//a[@title='Careers with Us']")
	private WebElement careerlink;
	
	@FindBy(xpath="//div[.='Recruiters']")
	private WebElement recruiterslink;
	
	@FindBy(xpath="//a[@title='FAQs']")
	private WebElement FAQlink;
	
	@FindBy(xpath="//a[@title='Fraud Alert']")
	private WebElement fraudlink;
	
	@FindBy(xpath="//a[@title='Grievances']")
	private WebElement grievelink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchjob(String skills, WebDriver driver) {
		BasePage.element1(driver, searchtb);
		searchtb.sendKeys(skills);
	}
	
	public void search(WebDriver driver) {
		BasePage.element2(driver, searchbtn);
		searchbtn.click();
	}
	
	public void updateprofile(WebDriver driver) {
		BasePage.element2(driver, updateprobtn);
		updateprobtn.click();
	}
	
	public void createjobalert(WebDriver driver) {
		BasePage.element2(driver, createalertlink);
		createalertlink.click();
	}
	
	public void searchjobbylocation(String loc, WebDriver driver) {
		BasePage.element2(driver, searchtb);
		searchtb.click();
		BasePage.element1(driver, searchbyloctb);
		searchbyloctb.sendKeys(loc);
	}
	
	public void clickobjoblink(WebDriver driver) {
		BasePage.element2(driver, joblink);
		joblink.click();
	}
	
	public void mynaukri(WebDriver driver) {
		Actions a=new Actions(driver);
		BasePage.element2(driver, mynaukrlink);
		a.moveToElement(mynaukrlink);
		//mynaukrlink.click();
	}
	
	public void mynaukriclick(WebDriver driver) {
		BasePage.element2(driver, editprofilelink);
		editprofilelink.click();
	}
	
	public void tandclink(WebDriver driver){
		BasePage.element2(driver, tclink);
		tclink.click();
	}
	
	public void careerlink(WebDriver driver){
		BasePage.element2(driver, careerlink);
		careerlink.click();
}
	public void clickrecruiterslink(WebDriver driver){
		BasePage.element2(driver, recruiterslink);
		recruiterslink.click();
	}
	public void FAQ(WebDriver driver){
		BasePage.element2(driver, FAQlink);
		FAQlink.click();
}
	public void falert(WebDriver driver){
		BasePage.element2(driver, fraudlink);
		fraudlink.click();
}
	public void aboutcompanies(WebDriver driver){
		BasePage.element2(driver, grievelink);
		grievelink.click();
}
}
