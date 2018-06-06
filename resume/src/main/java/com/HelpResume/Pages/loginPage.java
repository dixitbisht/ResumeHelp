package com.HelpResume.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HelpResume.BaseClass.BaseClasses;
import com.HelpResume.utilitiClass.UtilityClass;

public class loginPage extends BaseClasses {

	
	@FindBy(xpath="html/body/div[1]/header/ul/li[2]/a")
    WebElement Resume;
	
	@FindBy(linkText="Resources")
	WebElement Resources;
	
	@FindBy(xpath=".//*[@id='chat-widget']")
	WebElement LiveChat;
	
	@FindBy(xpath="html/body/div[1]/header/ul/li[6]/a")
	WebElement Signin;
	
	@FindBy(xpath="html/body/div[1]/header/div[1]/img")
	WebElement ResumeHelpLogo;
	
	@FindBy(xpath="html/body/div[1]/header/div[2]/div[2]/a")
	WebElement CreateResume;
	
	@FindBy(xpath=".//*[@id='lc_chat_name']")
	WebElement liveChatFullName;
	
	@FindBy(xpath=".//*[@id='lc_chat_email']")
	WebElement liveChatMail;
	
	@FindBy(xpath=".//*[@id='lc_chat_phone']")
	WebElement LiveChatPhonNO;
	
	@FindBy(xpath=".//*[@id='lc_chat_dropdown']/option[5]")
	WebElement ReasonType;
	
	@FindBy(xpath=".//*[@id='lc_chat_dropdown']")
	WebElement LiveChatReason;
	
	@FindBy(xpath=".//*[@id='lc_prechat_submit']")
	WebElement liveChatSubmit;
	
	@FindBy(xpath=".//*[@id='lc_minimize']/i")
	WebElement minimise;
	
	public loginPage(){
	PageFactory.initElements(Driver, this);
	}
	
	public String verifyPageTitle(){
		String d=Driver.getTitle();
		return d;
	}
	
	public boolean VarifypageLogo(){
		return ResumeHelpLogo.isDisplayed();
	}
	
   public  CreateHomePage clickONCreateYourResume(){
	   Resume.click();
	   return new CreateHomePage();
   }
   
   public  void ClickLivechat(){
	   LiveChat.click();
	
   }
	
public  void LiveChatDesciption(){
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	liveChatFullName.sendKeys(or.getProperty("Username"));
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	liveChatMail.sendKeys(or.getProperty("Mailid"));
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	LiveChatPhonNO.sendKeys(or.getProperty("phoneNo."));
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	LiveChatReason.click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ReasonType.click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	liveChatSubmit.click();	
}



public NewCreateResume clickCreateResume(){
	   CreateResume.click();
	   return new NewCreateResume();
}
	
	
		

		
	
	
}
