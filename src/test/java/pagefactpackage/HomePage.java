package pagefactpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath=".//*[@id='main-content']/h3/small")
	WebElement dashboardname;
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String dashboardname(){
	return 	dashboardname.getText();
	}
}
