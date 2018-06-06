package com.HelpResume.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.HelpResume.utilitiClass.UtilityClass;

public class BaseClasses {

	public static Properties or;
	public static WebDriver Driver;
	public static FileInputStream file;
	
	public static void loadBrowser(String browser){
		if(browser.equalsIgnoreCase("fx")){
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		Driver=new FirefoxDriver();}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			Driver=new ChromeDriver();
		}		
		
		//Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Driver.get(or.getProperty("URL"));
		}

	
	public BaseClasses() {
		 or=new Properties();
		try {
			file = new FileInputStream("C:/Users/user/maven/resume/src/main/java/com/HelpResume/configureClass/or.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			or.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
}
