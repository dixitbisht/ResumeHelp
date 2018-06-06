package com.HelpResume.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HelpResume.BaseClass.BaseClasses;

public class SavEandNext extends BaseClasses {
	
	@FindBy(xpath=".//*[@id='btnSaveAndNext']")
	WebElement SaveNnext;
	

	public SavEandNext(){
		PageFactory.initElements(Driver, this);
	}
	
	public void submitButton(){
		SaveNnext.click();
	}
	
}
