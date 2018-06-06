package com.HelpResume.tasteCasehome;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HelpResume.BaseClass.BaseClasses;
import com.HelpResume.Pages.CreateHomePage;
import com.HelpResume.Pages.NewCreateResume;
import com.HelpResume.Pages.loginPage;
import com.HelpResume.utilitiClass.UtilityClass;

public class TasteCases extends BaseClasses {
	 loginPage Loginpage;
	 NewCreateResume newResume;
	 CreateHomePage homepage;
	
	public TasteCases(){
		super();
	}
     
	@BeforeMethod
	public void setup(){
		loadBrowser("chrome");
		 Loginpage=new loginPage();
		 newResume =new NewCreateResume();
		 homepage = new CreateHomePage();

	}
	 
	@Test(priority=1)
	public void loginChatPage(){
	Loginpage.ClickLivechat();
	Loginpage.LiveChatDesciption();
	}
	
	
   @Test(priority=2)
	public void varifylog(){
		boolean flag=Loginpage.VarifypageLogo();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3)
	public  void varifytitle(){
		String TITLE=Loginpage.verifyPageTitle();
		org.testng.Assert.assertEquals(TITLE, "ResumeHelp: Instantly Create Your Resume");
	}
		
	@AfterMethod
	public static void TearDown(){
		Driver.quit();
	}

	
	}
	

