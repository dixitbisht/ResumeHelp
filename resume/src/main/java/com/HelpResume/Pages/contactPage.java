package com.HelpResume.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HelpResume.BaseClass.BaseClasses;

public class contactPage extends BaseClasses {
	
	
	@FindBy(xpath=".//*[@id='txtName']")
	WebElement Name;

	@FindBy(xpath=".//*[@id='txtAddress']")
	WebElement address;
	
	@FindBy(xpath=".//*[@id='txtEmail']")
	WebElement mail;
	
	@FindBy(xpath=".//*[@id='txtPhone']")
	WebElement phone;
	
	
	public contactPage(){
		PageFactory.initElements(Driver, this);
	}
	
	public void datafromExcel(String name, String Address, String Mail){
		
		Name.sendKeys(name);
		address.sendKeys(Address);
		mail.sendKeys(Mail);
		
	}
}
