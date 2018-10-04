package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import generic.Auto_constant;
import generic.Excel;
import pom.DisplayJobsPage;
import pom.HomePage;
import pom.LoginPage;

public class SearchJobTC1 implements Auto_constant{

	static {
		 System.setProperty(key,value);
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=http%3A%2F%2Fmy.naukri.com");
		 
		 String un =Excel.abc(excelpath, "sheet1", 3, 2);
		 String pwd =Excel.abc(excelpath, "sheet1", 4, 2);
		 String skills =Excel.abc(excelpath, "sheet1", 6, 2);
		 
		 LoginPage l = new LoginPage(driver);
		 l.username(un, driver);
		 l.password(pwd, driver);
		 l.login(driver);
		 
		 HomePage h=new HomePage(driver);
		 h.searchjob(skills, driver);
		 h.search(driver);
		 
		 
		 DisplayJobsPage d=new DisplayJobsPage(driver);
		 d.selectjob(driver);

		 driver.close();
	}

}
