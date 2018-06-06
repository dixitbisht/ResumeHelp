package com.HelpResume.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HelpResume.BaseClass.BaseClasses;

public class CreateHomePage extends BaseClasses{
	
	
	@FindBy(xpath=".//*[@id='rgSkinWrap']/div/div[1]/div/button")
	WebElement firstTemplet;
	
	@FindBy(xpath=".//*[@id='rgSkinWrap']/div/div[2]/div/button")
    WebElement SecondElement;
	
	
	public CreateHomePage(){
		PageFactory.initElements(Driver, this);
	}
	
	public SavEandNext firstTemplet(){
		firstTemplet.click();
		return new SavEandNext();
	}
	public SavEandNext secondTemplet(){
	    SecondElement.click();	
	    return new SavEandNext();
		}
	
	
		
	}


