package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.BasePage;

public class JobAlertPage extends BasePage {
	
	@FindBy(id="Sug_kwdsugg")
	 private WebElement keytb;
	@FindBy(id="Sug_locsugg")
	 private WebElement loctb;
	//@FindBy(xpath="//input[@readonly='readonly']")
	//@FindBy(id="cjaExp")
	@FindBy(className="smArw")
	 private WebElement expdb;
	@FindBy(id="cjaMinSal")
	 private WebElement saldb;
	@FindBy(id="cjaInd")
	 private WebElement industb;
	@FindBy(id="cjaJob")
	 private WebElement jobcattb;
	@FindBy(id="cjaRole")
	 private WebElement jobroletb;
	@FindBy(id="nyja")
	 private WebElement alertnametb;
	@FindBy(className="ssasel")
	 private WebElement alertcheckb;
	@FindBy(id="cjaSubmit")
	 private WebElement submitbtn;
	
	public JobAlertPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void keywordskill(String keyskill, WebDriver driver) throws AWTException {
		BasePage.element1(driver, keytb);
		keytb.sendKeys(keyskill);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public void location(String loc, WebDriver driver) throws AWTException {
		BasePage.element1(driver, loctb);
		loctb.sendKeys(loc);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void experience() {
		Select s=new Select(expdb);
		s.selectByValue("2");
	}
	public void salary() {
		Select s=new Select(saldb);
		s.selectByValue("2");
	}
	public void industry(String industryname, WebDriver driver) throws AWTException {
		BasePage.element1(driver, industb);
		industb.sendKeys(industryname);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public void jobcategory(String jobcat, WebDriver driver) throws AWTException {
		BasePage.element1(driver, jobcattb);
		jobcattb.sendKeys(jobcat);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	} 
	public void jobrole(String jobrol, WebDriver driver) throws AWTException {
		BasePage.element1(driver, jobroletb);
		jobroletb.sendKeys(jobrol);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	} 
	public void alertname(String alertnam, WebDriver driver) {
		BasePage.element1(driver, alertnametb);
		alertnametb.sendKeys(alertnam);
	} 
	public void alertcheck(WebDriver driver) {
		BasePage.element2(driver, alertcheckb);
		alertcheckb.click();
	} 
	public void createalert(WebDriver driver) {
		BasePage.element2(driver, submitbtn);
		submitbtn.click();
	} 
	
}
