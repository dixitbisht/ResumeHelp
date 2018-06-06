package com.HelpResume.tasteCasehome;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.HelpResume.BaseClass.BaseClasses;
import com.HelpResume.Pages.CreateHomePage;
import com.HelpResume.Pages.NewCreateResume;
import com.HelpResume.Pages.SavEandNext;
import com.HelpResume.Pages.contactPage;
import com.HelpResume.Pages.loginPage;
import com.HelpResume.utilitiClass.UtilityClass;

public class ContectTest extends BaseClasses {

	loginPage Loginpage;
	 NewCreateResume newResume;
	 CreateHomePage homepage;
	 SavEandNext saveNnext;
	 contactPage contct;
	 //String seet= "ContactPage";
	public ContectTest(){
		super();
	}
  
	@BeforeMethod
	public void setup(){
		loadBrowser("chrome");
		 Loginpage=new loginPage();
		 newResume =new NewCreateResume();
		 homepage = new CreateHomePage();
		 saveNnext = new SavEandNext();
		 contct= new contactPage();
		 Loginpage.clickCreateResume();
		 newResume.clkCreatebtn();
		 homepage.firstTemplet(); 
		 saveNnext.submitButton();	
}
	
	@DataProvider
	public Object[][] getFromUtility(){
		Object data[][] =UtilityClass.ReadExcel("ContactPage");
		return data;
	}
	
	 @Test(priority=1, dataProvider="getFromUtility")
	public void getContact(String Name, String Address, String Email){
		contct.datafromExcel(Name, Address, Email);
		
	}
	
	
}