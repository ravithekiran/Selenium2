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

@Test
public class ScreenCapture {
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
