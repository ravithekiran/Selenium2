package pomelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements {
	WebDriver driver;
 // By userIdPom=By.cssSelector("input#username");
	By loginPageLink=By.linkText("Sign in");
	By userIdPom=By.id("username");
  By paswordPom=By.cssSelector("input#password"); 	//location id  tag#id
  By signBtnPom=By.id("login-btn");
  
  
  public LoginElements(WebDriver driver){
	  this.driver=driver;
  }
  
  public void clickLoginLink(){
	  driver.findElement(loginPageLink).click();
  }
  public void setUserId(String username){
	 driver.findElement(userIdPom).sendKeys(username);
	 
  }
  public void setPassword(String password){
	  driver.findElement(paswordPom).sendKeys(password);
  }
  public void clickBtn(){
	  driver.findElement(signBtnPom).click();
  }
	  
  public void loginpom(String username,String password){
		  this.setUserId(username);
		  this.setPassword(password);
		  this.clickBtn();
	  }
  
  
}
