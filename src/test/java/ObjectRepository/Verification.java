package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verification {

	WebDriver driver;
	
	public Verification(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By reportLink = By.xpath("//a[contains(text(),'Reports')]");
	public WebElement ClickOnReportMenu(){
		
		return driver.findElement(reportLink);
	}
	
  
	
	By framerRedg = By.xpath("//a[contains(text(),'Farmers Registration')]");
	public WebElement ClickOnRarmerRedg(){
		
		return driver.findElement(framerRedg);
	}
	
	
	//RI Report
	By riReport = By.xpath("//div[@class='fpslinks']//li[2]//a[1]");
	public WebElement ClickOnRIReportLink(){
		
		return driver.findElement(riReport);
	}
	
	By tehsil = By.id("ddlTehsil");
	public WebElement SelectTehsil(){
		return driver.findElement(tehsil);
	} 
	
	By RICircle = By.id("ddlRI");
	public WebElement SelectRICircle(){
		return driver.findElement(RICircle);
	} 
	
	By showbtn = By.id("btnShow");
	public WebElement SelectShowButton(){
		return driver.findElement(RICircle);
	} 
	
	By exportExcel = By.id("btnExcel");
	public WebElement ClickExportExcel(){
		return driver.findElement(RICircle);
	} 
	
	By takePrint = By.id("btnPrint");
	public WebElement ClickTakePrint(){
		return driver.findElement(takePrint);
	} 
	
	
	//Bank Veification
	By bankReport = By.xpath("//div[@class='fpslinks']//li[3]//a[1]");
	public WebElement ClickOnBankVerify(){
		return driver.findElement(bankReport);
	}
	
	By bank = By.id("ddlBankName");
	public WebElement SelectBank(){
		return driver.findElement(bank);
	}
	
	
	//Verify of land Irrigation
	By irrgationReport = By.xpath("//div[@class='contArea']//li[5]//a[1]");
	public WebElement ClickOnLandIrrigationVerify(){
		return driver.findElement(irrgationReport);
	}
	
	
	//Verify ShareCoppersReport
	By shareCoppersReport = By.xpath("//div[@class='contArea']//li[6]//a[1]");
	public WebElement ClickOnShareCopperNoConsentL(){
		return driver.findElement(shareCoppersReport);
	}
	
	
	//Final Verification
	By masterlink = By.xpath("//a[@class='menuitem submenuheader th_menuitembg'][contains(text(),'Master')]");
	public WebElement ClickOnMasterMenu(){
		return driver.findElement(masterlink);
	}
	
	By manageMaster = By.xpath("//a[contains(text(),'Manage Farmer Data')]");
	public WebElement ClickOnManageMasterData(){
		return driver.findElement(manageMaster);
	}
	
	By updateRIReport = By.xpath("//a[contains(text(),'Update RI Report')]");
	public WebElement ClickOnUpdateRIReport(){
		return driver.findElement(updateRIReport);
	}
	
	By updateBankReport = By.xpath("//a[contains(text(),'Update Bank Report')]");
	public WebElement ClickOnUpdateBankReport(){
		return driver.findElement(updateBankReport);
	}
	
}
