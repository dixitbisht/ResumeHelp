package com.HelpResume.tasteCasehome;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HelpResume.BaseClass.BaseClasses;
import com.HelpResume.Pages.CreateHomePage;
import com.HelpResume.Pages.NewCreateResume;
import com.HelpResume.Pages.SavEandNext;
import com.HelpResume.Pages.loginPage;

public class SaveNnextTest extends BaseClasses {
	
	loginPage Loginpage;
	 NewCreateResume newResume;
	 CreateHomePage homepage;
	 SavEandNext saveNnext;
	public SaveNnextTest(){
		super();
	}
   
	@BeforeMethod
	public void setup(){
		loadBrowser("chrome");
		 Loginpage=new loginPage();
		 newResume =new NewCreateResume();
		 homepage = new CreateHomePage();
		 saveNnext = new SavEandNext();
		 Loginpage.clickCreateResume();
		 newResume.clkCreatebtn();
		 homepage.firstTemplet();
	}
	
	@Test
	public void createpage(){
		saveNnext.submitButton();
	}

}
