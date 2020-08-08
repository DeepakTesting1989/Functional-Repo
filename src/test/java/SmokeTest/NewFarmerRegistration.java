package SmokeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.businesslib.LoginBase;
import com.genericlib.Driver;
import com.genericlib.Xls_AllMethods;

import ObjectRepository.BaseFarmerKharifRegistration;
import ObjectRepository.LoginTest;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class NewFarmerRegistration extends Driver {
	
	LoginTest lt = new LoginTest();
	Driver dr = new Driver();
	Xls_AllMethods read = new Xls_AllMethods("D:\\WS\\FSCW\\FarmerDetails.xlsx");
	
	
	
	
	//Simple, Medium, Complex
	@Test(priority=0)
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
	
	@Test(priority=1)
	public void EntryForm() throws InterruptedException {
		BaseFarmerKharifRegistration fr = new BaseFarmerKharifRegistration(driver);
		fr.ClickOnRegAccordian().click();
		fr.ClickNewFarmerRegistration().click();
		Thread.sleep(3000);
		String Tehsil = read.getCellData("NewFarmer", "Tehsil", 2);
		String CultivatorNameOdia = read.getCellData("NewFarmer", "CultivatorNameOdia", 2);
		String CultivatorNameEnglish = read.getCellData("NewFarmer", "CultivatorNameEnglish", 2);
		String RelationType = read.getCellData("NewFarmer", "RelationType", 2);
		String RelationName = read.getCellData("NewFarmer", "RelationName", 2);
		String NumOfFamilyMember = read.getCellData("NewFarmer", "NumOfFamilyMember", 2);
		String MobileNumber = read.getCellData("NewFarmer", "MobileNumber", 2);
		String AadhaarNumber = read.getCellData("NewFarmer", "AadhaarNumber", 2);
		String BankName = read.getCellData("NewFarmer", "BankName", 2);
		String BranchName = read.getCellData("NewFarmer", "BranchName", 2);
		String AccountNumber = read.getCellData("NewFarmer", "AccountNumber", 2);
		String Pincode = read.getCellData("NewFarmer", "Pincode", 2);
		String Season = read.getCellData("NewFarmer", "Season", 2);
		String KMS = read.getCellData("NewFarmer", "KMS", 2);
		String DateOfSale = read.getCellData("NewFarmer", "DateOfSale", 2);
		String Block = read.getCellData("NewFarmer", "Block", 2);
		String GPorWordnum = read.getCellData("NewFarmer", "GPorWordnum", 2);
		String VillageorLocality = read.getCellData("NewFarmer", "VillageorLocality", 2);
		String Gender = read.getCellData("NewFarmer", "Gender", 2);
		String Category = read.getCellData("NewFarmer", "Category", 2);
		String PPCorPaddy = read.getCellData("NewFarmer", "PPCorPaddy", 2);
		String landVillage = read.getCellData("NewFarmer", "landVillage", 2);
		String KhataNum = read.getCellData("NewFarmer", "KhataNum", 2);
		String PlotNum = read.getCellData("NewFarmer", "PlotNum", 2);
		String NameofRT = read.getCellData("NewFarmer", "NameofRT", 2);
		String RelationwithRT = read.getCellData("NewFarmer", "RelationwithRT", 2);
		String receivedConsentLetter = read.getCellData("NewFarmer", "receivedConsentLetter", 2);
		String OwnerName = read.getCellData("NewFarmer", "OwnerName", 2);
		String OwnerAadhaarNum = read.getCellData("NewFarmer", "OwnerAadhaarNum", 2);
		String OwnerMobileNum = read.getCellData("NewFarmer", "OwnerMobileNum", 2);
		String TotalArea = read.getCellData("NewFarmer", "TotalArea", 2);
		String CultivatedArea = read.getCellData("NewFarmer", "CultivatedArea", 2);
		String TypeofLand = read.getCellData("NewFarmer", "TypeofLand", 2);
		String IrrigationSource = read.getCellData("NewFarmer", "IrrigationSource", 2);
		String Declaration = read.getCellData("NewFarmer", "Declaration", 2);
		
		
		
		fr.SelectTehsil().sendKeys(Tehsil);
		Thread.sleep(3000);
		fr.ClickOnContinue().click();
		fr.EnterCulivator().sendKeys(CultivatorNameOdia);
		fr.EnterCulivatorEng().sendKeys(CultivatorNameEnglish);
		fr.SelectRelationType().sendKeys(RelationType);
		fr.EnterRelationName().sendKeys(RelationName);
		fr.EnterNumberofFMember().sendKeys(NumOfFamilyMember);
		fr.EnterMobileNumber().sendKeys(MobileNumber);
		fr.EnterAadharNumber().sendKeys(AadhaarNumber);
		
		fr.SelectBankName().sendKeys(BankName);
		Thread.sleep(3000);
		fr.SelectBanchName().sendKeys(BranchName);
		fr.EnterAccountNum().sendKeys(AccountNumber);
		fr.EnterPincode().sendKeys(Pincode);
		fr.SelectDateofSale().sendKeys(DateOfSale);
		fr.SelectBlock().sendKeys(Block);  
		Thread.sleep(4000);
		fr.SelectGpWord().sendKeys(GPorWordnum);
		Thread.sleep(4000);
		fr.SelectFarmerVillage().sendKeys(VillageorLocality);
		fr.SelectGender().sendKeys(Gender);
		Thread.sleep(3000);
		fr.SelectCatagory().sendKeys(Category);
		Thread.sleep(3000);
		fr.SelectPPCPADDY().sendKeys(PPCorPaddy);
		fr.SelectlandVillage().sendKeys(landVillage);
		Thread.sleep(3000);
		fr.EnterKhataNumber().clear();
		fr.EnterKhataNumber().sendKeys(KhataNum);
		fr.EnterPlotNumber().click();
		Thread.sleep(3000);
		fr.EnterPlotNumber().sendKeys(PlotNum);
		fr.EnterKhataNumber().click();
		Thread.sleep(3000);
		fr.EnterNameofRT().sendKeys(NameofRT);
		Thread.sleep(5000);
		fr.SelectRTRelation().sendKeys(RelationwithRT);
		Thread.sleep(3000);
		fr.IfReceivedLetter().sendKeys(receivedConsentLetter);
		Thread.sleep(3000);
		fr.EnterOwnerName().sendKeys(OwnerName);
		Thread.sleep(3000);
		fr.EnterOwnersAadhaar().sendKeys(OwnerAadhaarNum);
		Thread.sleep(3000);
		fr.EnterOwnersMobileNumber().sendKeys(OwnerMobileNum);
		Thread.sleep(3000);
		fr.EnterTotalArea().clear();
		fr.EnterTotalArea().sendKeys(TotalArea);
		fr.EnterCultivatedArea().click();
		Thread.sleep(3000);
		fr.EnterCultivatedArea().clear();
		fr.EnterCultivatedArea().sendKeys(CultivatedArea);
		Thread.sleep(3000);
		fr.Selectlandtype().sendKeys(TypeofLand);
		Thread.sleep(3000);
		fr.SelectSourceofIrrigation().sendKeys(IrrigationSource);
		fr.Isdigitizedhardcopysubmitted().sendKeys(Declaration);
		fr.ClickSave().click();
		
	}
}