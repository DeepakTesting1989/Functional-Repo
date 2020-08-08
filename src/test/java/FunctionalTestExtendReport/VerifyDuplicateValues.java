package FunctionalTestExtendReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.businesslib.LoginBase;
import com.genericlib.Driver;
import com.genericlib.Xls_AllMethods;

import ObjectRepository.BaseFarmerKharifRegistration;
import ObjectRepository.LoginTest;
import SmokeTest.NewFarmerRegistration;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
 
public class VerifyDuplicateValues extends Driver {

	Xls_AllMethods read = new Xls_AllMethods("D:\\WS\\FSCW\\FarmerDetails.xlsx");
	LoginTest lt = new LoginTest();
	Driver dr = new Driver();
//	static Xls_AllMethods fileone = new Xls_AllMethods("F:/CSM_Project/New folder/JuniorForm/JuniorFormMappingData.xlsx");
//	XSSFWorkbook wb;
//	XSSFSheet sht;
//	String sheetName = "Result";
//    int rowCount = fileone.getRowCount(sheetName);
	
	
	@Test(priority=0)
	public void login() throws InterruptedException, IOException, TesseractException {
		
		lt.setUp();
		
	}
    
	
	@Test(priority=1)
	
	public void duplicateMobileNumber() throws InterruptedException, IOException, TesseractException {
		
		BaseFarmerKharifRegistration fr = new BaseFarmerKharifRegistration(driver);
		
		fr.ClickOnRegAccordian().click();
		fr.ClickNewFarmerRegistration().click();
		Thread.sleep(3000);

		String Tehsil = read.getCellData("NewFarmer", "Tehsil", 2);
		String MobileNumber = read.getCellData("NewFarmer", "MobileNumber", 2);
		String CultivatorNameOdia = read.getCellData("NewFarmer", "CultivatorNameOdia", 2);
		String CultivatorNameEnglish = read.getCellData("NewFarmer", "CultivatorNameEnglish", 2);
		String RelationType = read.getCellData("NewFarmer", "RelationType", 2);
		String RelationName = read.getCellData("NewFarmer", "RelationName", 2);
		String NumOfFamilyMember = read.getCellData("NewFarmer", "NumOfFamilyMember", 2);
		
		fr.SelectTehsil().sendKeys(Tehsil);
		Thread.sleep(3000);
		fr.ClickOnContinue().click();
		
		fr.EnterCulivator().sendKeys(CultivatorNameOdia);
		fr.EnterCulivatorEng().sendKeys(CultivatorNameEnglish);
		fr.SelectRelationType().sendKeys(RelationType);
		fr.EnterRelationName().sendKeys(RelationName);
		fr.EnterNumberofFMember().sendKeys(NumOfFamilyMember);
		fr.EnterMobileNumber().sendKeys(MobileNumber);
		
		fr.ClickSave().click();
		String expectedmMsg = driver.switchTo().alert().getText();
		System.out.println(expectedmMsg);
		if(expectedmMsg.equals("Aadhaar Number can not be left blank!"))
		 {
			System.out.println("Fail");
			//fileone.setCellData(sheetName, "Status", 17 , "Pass");	
		 }
		
		 else
		 {
			 System.out.println("Pass");
			// fileone.setCellData(sheetName, "Status", 17, "Fail");
		 }
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	}
}
