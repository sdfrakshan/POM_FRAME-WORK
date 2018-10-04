package generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
public static void element1(WebDriver driver, WebElement element) {
	try {
	WebDriverWait w=new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.visibilityOf(element));
	System.out.println("element was found");
	}
	catch(Exception e) {
		System.out.println("element was not found");
	}
}
public static void element2(WebDriver driver, WebElement element) {
	try {
	WebDriverWait w=new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.elementToBeClickable(element));
	System.out.println("element was found");
	}
	catch(Exception e) {
		System.out.println("element was not found");
	}
}
}
