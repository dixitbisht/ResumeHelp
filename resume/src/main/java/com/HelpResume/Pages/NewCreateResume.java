package com.HelpResume.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HelpResume.BaseClass.BaseClasses;

public class NewCreateResume extends BaseClasses {

@FindBy(xpath=".//*[@id='btnCreateResume']")
	WebElement CreateResumeBtn;
	
@FindBy(xpath=".//*[@id='chat-widget']")
WebElement liveChat;

@FindBy(xpath=".//*[@id='login']")
WebElement LOGIN;


public NewCreateResume(){
	PageFactory.initElements(Driver, this);
}
	
public void clickliveChat(){
	liveChat.click();
}

public void clicklogin(){
	LOGIN.click();
}

public CreateHomePage clkCreatebtn(){
	CreateResumeBtn.click();
	return new CreateHomePage();
}

}


