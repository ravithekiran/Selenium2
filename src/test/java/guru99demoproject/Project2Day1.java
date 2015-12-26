package guru99demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project2Day1 {
	@Test
	public  void method1(){
		WebDriver driver=new FirefoxDriver();
		String uid="mngr22790";
		String pwd="zUgaqat";
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys(uid);
		WebElement passwd=driver.findElement(By.cssSelector("[type='password']"));
		passwd.sendKeys(pwd);
		//passwd.sendKeys("abc",Keys.UP);
		passwd.submit();
		String abc1="Manger Id : mngr22790";
		String abc=driver.findElement(By.cssSelector("tr[class='heading3']")).getText();
		Assert.assertTrue(abc.equals(abc1));
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}
}
