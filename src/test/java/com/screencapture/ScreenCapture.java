package com.screencapture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

/**
 * 
 * This class is used to capture Screen when test case fails
 * @author Sandri
 *
 */
public class ScreenCapture {
	public static int a=10;
	/**
	 *<H3> 
	 *Captures Screenshot when test-case fails,<p>
	 *when actual and expected mismatch. Stores screenshot in folder "G".</p></H3>

	 */
	public void screen1() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		String exptitle=driver.getTitle();
		String acttitle="Google123";
		
		try
		{
			Assert.assertEquals(acttitle, exptitle);
			System.out.println("valid title");
		}
		catch(Throwable e){
				//Exception e){
				//
		System.out.println("invalid title");
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
			File srcfile=edriver.getScreenshotAs(OutputType.FILE);
			
				FileUtils.copyFile(srcfile, new File("G://abc1.png"));
		
		}
//		TakesScreenshot scr=(TakesScreenshot)driver;
//		File srcfile =scr.getScreenshotAs(OutputType.FILE);
				
		
	}


	}
