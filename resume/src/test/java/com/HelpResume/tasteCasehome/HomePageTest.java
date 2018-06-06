package com.HelpResume.tasteCasehome;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HelpResume.BaseClass.BaseClasses;
import com.HelpResume.Pages.CreateHomePage;
import com.HelpResume.Pages.NewCreateResume;
import com.HelpResume.Pages.loginPage;
import com.HelpResume.utilitiClass.UtilityClass;

public class HomePageTest extends BaseClasses {
	loginPage Loginpage;
	 NewCreateResume newResume;
	 CreateHomePage homepage;
	
	public HomePageTest(){
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
	public void nextcreatepage() throws IOException, InterruptedException{
		NewCreateResume nxt=Loginpage.clickCreateResume();
	   nxt.clkCreatebtn();
	   Thread.sleep(8000);
	  SceenShort("login_page");
	}
	
	/*@Test(priority=2)
	public void firstTemplet() throws IOException{
		nextcreatepage();
		homepage.firstTemplet();
	}*/
	
	public static void SceenShort(String fileName) throws IOException{
		File screen =((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("C:/Users/user/maven/resume/src/main/java/screenshort"+fileName+".png"));
		
	}
	
	
	/*@AfterMethod
	public static void TearDown(){
		Driver.quit();
	}*/
}
