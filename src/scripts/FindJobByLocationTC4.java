package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_constant;
import generic.Excel;
import pom.HomePage;
import pom.JobsInChennai;
import pom.LoginPage;

public class FindJobByLocationTC4 implements Auto_constant{

	
	static {
		 System.setProperty(key,value);
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		 driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=http%3A%2F%2Fmy.naukri.com");

	
		 String un =Excel.abc(excelpath, "sheet4", 3, 2);
		 String pwd =Excel.abc(excelpath, "sheet4", 4, 2);
		 String loc =Excel.abc(excelpath, "sheet4", 6, 2);
		 
		 LoginPage l = new LoginPage(driver);
		 l.username(un, driver);
		 l.password(pwd, driver);
		 l.login(driver);
		 
		 HomePage h=new HomePage(driver);
		 h.searchjobbylocation(loc, driver);
		 h.search(driver);
		 
		 JobsInChennai j=new JobsInChennai(driver);
		 j.checktochennai(driver);
		// j.selectjob(driver);
	}

}
