package com.genericlib;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshots {
	
	static WebDriver driver;
//	
//	@Test
//
//	public static void getScreenshot() throws Exception {
//		
//		driver =  new ChromeDriver();
//		driver.navigate().to("http://117.245.133.165/SAMS_OL_App_Audit/ONLINE_CAF/JunUserRegistration.aspx");
//		EventFiringWebDriver edDriver = new EventFiringWebDriver(driver);
//		File srcfile = edDriver.getScreenshotAs(OutputType.FILE);
//		File dstfile = new File("");
//		FileHandler.copy(srcfile, dstfile);
//	}

	
	public static void failedTest(String testMethodName) throws IOException {
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Deepak Softwares\\21-05-2020\\FailTest\\"+ testMethodName +"_"+ ".jpg"));
	}
	

}
