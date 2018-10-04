package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_constant;
import generic.Excel;
import pom.HomePage;
import pom.JobAlertPage;
import pom.LoginPage;

public class CreateJobAlertPageTC3 implements Auto_constant{

	static {
		 System.setProperty(key,value);
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		 driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=http%3A%2F%2Fmy.naukri.com");

		 String un =Excel.abc(excelpath, "sheet3", 3, 2);
		 String pwd =Excel.abc(excelpath, "sheet3", 4, 2);
		 
		 LoginPage l = new LoginPage(driver);
		 l.username(un, driver);
		 l.password(pwd, driver);
		 l.login(driver);
		 
		 HomePage h=new HomePage(driver);
		 h.createjobalert(driver);
		 
		 String keyskill =Excel.abc(excelpath, "sheet3", 6, 2);
		 String loc =     Excel.abc(excelpath, "sheet3", 7, 2);
		 String industryname =Excel.abc(excelpath, "sheet3", 10, 2);
		 String jobcat =Excel.abc(excelpath, "sheet3", 11, 2);
		 String jobrol =Excel.abc(excelpath, "sheet3", 12, 2);
		 String alertnam =Excel.abc(excelpath, "sheet3", 13, 2);
		 
		 JobAlertPage j=new JobAlertPage(driver);
		 j.keywordskill(keyskill, driver);
		 j.location(loc, driver);
		// j.experience();
		// j.salary();
		 j.industry(industryname, driver);
		 j.jobcategory(jobcat, driver);
		 j.jobrole(jobrol, driver);
		 j.alertname(alertnam, driver);
		 j.alertcheck(driver);
		 j.createalert(driver);
	}

}
