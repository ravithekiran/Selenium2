package pomtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pomelements.LoginElements;

public class AnnotationSetup {
	WebDriver driver;
	LoginElements objLoginElements;
	
	@BeforeTest
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("http://portal2.bsnl.in/myportal/");
		driver.manage().window().maximize();
		/*//sleep is used to know page is fully loaded
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//direct login page
		//driver.get("http://portal2.bsnl.in/myportal/authorize.do");
		//wait is used to wait till page is loaded fully
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait expwait= new WebDriverWait(driver,20);
	}
	
@AfterTest
public void closeBrowser(){
	//driver.close();
	//driver.quit();
}
}
