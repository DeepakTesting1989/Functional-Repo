package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseFarmerKharifRegistration {
	
	WebDriver driver;
	
	public BaseFarmerKharifRegistration(WebDriver driver) {
	
		this.driver=driver;
	}
		
	
	/*Add Farmer Page*/
	
		By Regdaccordian = By.xpath("//a[@class='menuitem submenuheader th_menuitembg'][contains(text(),'Registration')]"); //--Common locator
		By newForm = By.xpath("//a[contains(text(),'Farmer Kharif Registration')]");      //--Common locator
		By tehsil = By.id("ddlTahsil");
		By refisteralready = By.id("ddlRegister");
		By farmerCode = By.id("txtFarmerCode");
		By continuebtn = By.id("btnContinue"); 
		By culname = By.id("txtCultivator");
		By culnameeng = By.id("txtCultivatorEng");
		By relation = By.id("ddlRelationType");
		By relationName = By.id("txtRelationName");
		By numofFamily = By.id("txtFamilyCnt");
		By mobileNum = By.id("txtMobile");
		By adhaarNum = By.id("txtAadhar");
		By bankName = By.id("ddlBankName");
		By branchName = By.id("ddlBranchName");
		By accoutNum = By.id("txtAcctno");
		By pinCode = By.id("txtPincode");
		By dos = By.id("txtDateOfSale");
		By block = By.id("ddlBlock");
		By gp = By.id("ddlGP");
		By vill = By.id("ddlVillage");
		By gen = By.id("ddlGend");
		By catg = By.id("ddlCast");
		By PPCPADDY = By.id("ddlPPC");
		By villageland = By.id("gvPanelgrid_ctl02_ddlVillage");
		By ricycle = By.id("gvPanelgrid_ctl02_ddlRI");
		By kathaNum = By.id("gvPanelgrid_ctl02_txtKhataNo");
		By plotNo = By.id("gvPanelgrid_ctl02_txtPlotNo");
		By RTName = By.id("gvPanelgrid_ctl02_txtRT");
		By relationwithowner = By.id("gvPanelgrid_ctl02_ddlRelation");
		By cosentLetter = By.id("gvPanelgrid_ctl02_ddlConsentLetter");
		By ownerName = By.id("gvPanelgrid_ctl02_txtOwnName");
		By ownerAadharName = By.id("gvPanelgrid_ctl02_txtOwnAadhar");
		By ownerMobileNum = By.id("gvPanelgrid_ctl02_txtOwnMob");
		By totalArea = By.id("gvPanelgrid_ctl02_txtArea");
		By cultivatedArea = By.id("gvPanelgrid_ctl02_txtCultivatedArea");
		By landType = By.id("gvPanelgrid_ctl02_ddlKisam");
		By irrigationSource = By.id("gvPanelgrid_ctl02_ddlSource");
		By remove = By.id("//a[@id='gvPanelgrid_ctl02_LinkButton1']//font//font[contains(text(),'Remove')]");
		By addmore = By.id("gvPanelgrid_ctl03_ButtonAdd");
		By digitizedsubmitted = By.id("ddlDeclSts");
		By savebutton = By.id("btnContinue");
		By saveandcontinue = By.id("btnSave");
		By addlanddetails = By.id("btnAddSameKhata");
		By cancelbtn = By.id("btnCancel");
		
		
		public WebElement ClickOnRegAccordian() {
			
			return driver.findElement(Regdaccordian);
		}
		
		public WebElement ClickNewFarmerRegistration() {
			
			return driver.findElement(newForm);
		}
		
		public WebElement SelectTehsil() {
			
			return driver.findElement(tehsil);
		}
		
		public WebElement SelectIfAlreadyRegistered() {
			
			return driver.findElement(refisteralready);
		}
		
		public WebElement EnterFarmerCode() {
			
			return driver.findElement(farmerCode);
		}
		
		public WebElement ClickOnContinue() {
			
			return driver.findElement(continuebtn);
		}
		
		public WebElement EnterCulivator() {
			
			return driver.findElement(culname);
		}
		
		public WebElement EnterCulivatorEng() {
			
			return driver.findElement(culnameeng);
		}
		
		public WebElement SelectRelationType() {
			
			return driver.findElement(relation);
		}
		
		public WebElement EnterRelationName() {
			
			return driver.findElement(relationName);
		}
		
		public WebElement EnterNumberofFMember() {
			
			return driver.findElement(numofFamily);
		}
		
		public WebElement EnterMobileNumber() {
			
			return driver.findElement(mobileNum);
		}
		
		public WebElement EnterAadharNumber() {
			
			return driver.findElement(adhaarNum);
		}
		
		public WebElement SelectBankName() {
			
			return driver.findElement(bankName);
		}
		
		public WebElement SelectBanchName() {
			
			return driver.findElement(branchName);
		}
		
		public WebElement EnterAccountNum() {
			
			return driver.findElement(accoutNum);
		}
		
		public WebElement EnterPincode() {
			
			return driver.findElement(pinCode);
		}
		
		public WebElement SelectDateofSale() {
			
			return driver.findElement(dos);
		}
		
		public WebElement SelectBlock() {
			
			return driver.findElement(block);
		}
		
		public WebElement SelectGpWord() {
			
			return driver.findElement(gp);
		}
		
		public WebElement SelectFarmerVillage() {
			
			return driver.findElement(vill);
		}

		public WebElement SelectGender() {
			
			return driver.findElement(gen);
		}
		
		public WebElement SelectCatagory() {
			
			return driver.findElement(catg);
		}
		
		public WebElement SelectPPCPADDY() {
			
			return driver.findElement(PPCPADDY);
		}
		
		public WebElement SelectlandVillage() {
			
			return driver.findElement(villageland);
		}
		
		public WebElement SelectRICircle() {
			
			return driver.findElement(ricycle);
		}
		
		public WebElement EnterKhataNumber() {
			
			return driver.findElement(kathaNum);
		}
		
		public WebElement EnterPlotNumber() {
			
			return driver.findElement(plotNo);
		}
		
		public WebElement EnterNameofRT() {
			
			return driver.findElement(RTName);
		}
		
		public WebElement SelectRTRelation() {
			
			return driver.findElement(relationwithowner);
		}
		
		public WebElement IfReceivedLetter() {
			
			return driver.findElement(cosentLetter);
		}
		
		public WebElement EnterOwnerName() {
			
			return driver.findElement(ownerName);
		}
		
		public WebElement EnterOwnersAadhaar() {
			
			return driver.findElement(ownerAadharName);
		}
		
		public WebElement EnterOwnersMobileNumber() {
			
			return driver.findElement(ownerMobileNum);
		}
		
		public WebElement EnterTotalArea() {
			
			return driver.findElement(totalArea);
		}
		
		public WebElement EnterCultivatedArea() {
			
			return driver.findElement(cultivatedArea);
		}
		
		public WebElement Selectlandtype() {
			
			return driver.findElement(landType);
		}
		
		public WebElement SelectSourceofIrrigation() {
			
			return driver.findElement(irrigationSource);
		}
		
		public WebElement RemoveLand() {
			
			return driver.findElement(remove);
		}
		
		public WebElement SelectAddMore() {
			
			return driver.findElement(addmore);
		}
		
		public WebElement Isdigitizedhardcopysubmitted() {
			
			return driver.findElement(digitizedsubmitted);
		}
		
		public WebElement ClickSave() {
			
			return driver.findElement(savebutton);
		}
		
		public WebElement ClickSaveANDContinue() {
			
			return driver.findElement(saveandcontinue);
		}
		
		public WebElement ClickAddSameKhata() {
			
			return driver.findElement(addlanddetails);
		}
		
		public WebElement ClickCancelButton() {
			
			return driver.findElement(cancelbtn);
		}
		
}
