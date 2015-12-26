package guru99demoproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestCase1 {
	@Test
	public void method1() {
		WebDriver driver = new FirefoxDriver();
		// EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		driver.get("http://live.guru99.com/index.php/");
		String homeTitle = "THIS IS DEMO SITE FOR";
		String actualTitle = (driver
				.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[1]/div/div/h2")).getText())
						.toUpperCase();

		Assert.assertEquals(homeTitle, actualTitle.trim());
		driver.findElement(By.linkText("MOBILE")).click();
		String mobTitle = "MOBILE";
		String actualmobTitle = (driver
				.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/h1")).getText())
						.toUpperCase();
		Assert.assertEquals(mobTitle, actualmobTitle);
		Select sortdrop = new Select(driver.findElement(By.cssSelector("[title='Sort By']")));
		sortdrop.selectByVisibleText("Name");
		List<WebElement> products = driver.findElements(By.cssSelector("h2.product-name"));
		// WebElement
		// grid=driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul"));
		// List<WebElement> items=products.findElements(By.tagName("a"));
		// System.out.println();
		// String[] items=new String[products.size()];
		for (WebElement i : products) {

			// System.out.println(sortdrop.getOptions());
			System.out.println(i.findElement(By.tagName("a")).getText());
		}
		driver.manage().window().maximize();
		// edriver.executeScript("scroll(0,1000)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// edriver.executeScript("scroll(1000,0)");
		// String x=Keys.chord(Keys.SHIFT,Keys.ENTER);
	}
}
