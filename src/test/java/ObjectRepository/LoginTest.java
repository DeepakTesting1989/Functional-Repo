package ObjectRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.businesslib.LoginBase;
import com.genericlib.Driver;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class LoginTest extends Driver {

	
	Driver dr = new Driver();
	
	 //SignIn sn = PageFactory.initElements(driver, SignIn.class);
	Properties prop=new Properties();
	
public void setUp() throws InterruptedException, IOException, TesseractException {
		
//		lt.BasicInfoFill();
//		Thread.sleep(3000);
		dr.getDriver();
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("D:\\WS\\FSCW\\config.properties");
		try {
		prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		LoginBase ln = new LoginBase(driver);
		
		ln.UserName().sendKeys(prop.getProperty("UserName"));
		
		//ln.SelectPassWord().sendKeys("Admin@12");
		ln.PassWord().sendKeys(prop.getProperty("Password"));
		Thread.sleep(3000);
		
		File src = driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[2]/div/div/div[4]")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/test-output/ccha.png";
		try {	
		FileHandler.copy(src , new File (path));
		
		ITesseract image = new Tesseract();
		
		String imageText;
		
		imageText = image.doOCR(new File(path));
		
		ln.CaptchaWrite().sendKeys(imageText);
		Thread.sleep(3000);
		ln.ClickLogin().click();
		Thread.sleep(4000);
		
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
		}

	}
    
}
