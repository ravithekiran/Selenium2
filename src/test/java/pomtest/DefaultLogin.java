package pomtest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagefactpackage.HomePage;
import pomelements.LoginElements;
import org.apache.log4j.Logger;
public class DefaultLogin extends AnnotationSetup{

	LoginElements objLoginElements;
	HomePage HomePageElements;
	/**
	 * Java Doc 
	 */
	//ClassLoader loader = Test.class.getClassLoader();
	 //System.out.println(loader.getResource("pomtest.DefaultLogin.class"));
	Logger log = Logger.getLogger("devpinoyLogger");//devpinoyLogger
	@Test(priority=0)
	
   
	public void moveToLogin(){
		objLoginElements=new LoginElements(driver);
		//log.error("Clicking on Login Link");
		log.debug("Clicking on Login Link");
		//log.info("Clicking on Login Link");
		objLoginElements.clickLoginLink();
	}
	
	@Test(priority=1)
	public void doingLogin(){
		objLoginElements=new LoginElements(driver);
		//log.error("Entering Logging Details");
	      log.debug("Entering Logging Details");
		//log.info("Entering Logging Details");
		objLoginElements.loginpom("ravithekiran@gmail.com", "27031028");
		//log.error("Creating Reference to Home Page");
		 log.debug("Entering Logging Details");
		//log.info("Creating Reference to Home Page");
		HomePageElements=new HomePage(driver);
		//System.out.println(x);
		//log.error("Checking Logged correctly or not");
		  log.debug("Entering Logging Details");
		//log.info("Checking Logged correctly or not");
		Assert.assertTrue(HomePageElements.dashboardname().contains("Welcome to BSNL Payment Porta1l"));
	}

}
