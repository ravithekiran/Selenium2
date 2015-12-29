package pagefactpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a Homepage class with Pagefactory model
 * @author Ravi Kiran Sandri
 * @version 1.0
 *
 */
public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath=".//*[@id='main-content']/h3/small")
	WebElement dashboardname;
	/**
	 * This method initializes driver and intializes elements in home Page
	 * @param driver Holds specified browser instances. 
	 */
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * It is used to get name of the user from webpage. 
	 * @return  name of user logged in.
	 */
	public String dashboardname(){
	return 	dashboardname.getText();
	}
}
