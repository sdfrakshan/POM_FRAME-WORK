package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import generic.Auto_constant;
import generic.Excel;
import pom.HomePage;
import pom.LoginPage;

public class AmbitionTC10 implements Auto_constant{

	static {
		 System.setProperty(key,value);
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=http%3A%2F%2Fmy.naukri.com");
			 String un =Excel.abc(excelpath, "sheet3", 3, 2);
			 String pwd =Excel.abc(excelpath, "sheet3", 4, 2);
			 
		    LoginPage l = new LoginPage(driver);
			 l.username(un, driver);
			 l.password(pwd, driver);
			 l.login(driver);
			 
			 HomePage h=new HomePage(driver);
			 h.aboutcompanies(driver);
}
}