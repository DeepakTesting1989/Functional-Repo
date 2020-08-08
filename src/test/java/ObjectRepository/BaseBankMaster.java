package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseBankMaster {

	WebDriver driver; 
	
	public BaseBankMaster(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By masterMenu = By.xpath("//a[@class='menuitem submenuheader th_menuitembg'][contains(text(),'Master')]");
	By millerMaster = By.xpath("//a[contains(text(),'Miller Master')]");
	By bankMaser = By.xpath("//a[contains(text(),'Bank Master')]");
	By FPSBank = By.xpath("//a[contains(text(),'FPS Bank Data')]");
	By FarmerBanKData = By.xpath("//a[contains(text(),'Farmer Bank Data')]");
	
	
	public WebElement ClickOnMaster() {
		
		return driver.findElement(masterMenu);
	}
	
	public WebElement ClickOnMillerMaster() {
		
		return driver.findElement(millerMaster);
	}
	
	public WebElement ClickOnBankMaster() {
		
		return driver.findElement(bankMaser);
	}
	
	public WebElement ClickOnFPSBankData() {
		
		return driver.findElement(FPSBank);
	}
	
	public WebElement ClickOnFarmerBanKData() {
		
		return driver.findElement(FarmerBanKData);
	}
	
	
}
