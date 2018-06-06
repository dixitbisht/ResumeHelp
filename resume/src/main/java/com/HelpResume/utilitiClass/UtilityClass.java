package com.HelpResume.utilitiClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.HelpResume.BaseClass.BaseClasses;
import com.gargoylesoftware.htmlunit.javascript.host.Screen;


public class UtilityClass extends BaseClasses {

	public static 	Properties or;
	public static WebDriver Driver;
	public static WebElement we;
	public static FileInputStream file;
	public static Workbook book;
	public static Row rowNo;
	public static int Cell;
	public static int Row;
	public static org.apache.poi.ss.usermodel.Sheet seet;
	public static long PAGE_LOAD_TIMEOUT =20;
	public static long IMPLICIT_WAIT = 10;
	
	
	/*public static void loadBrowser(String browser) throws IOException{
	setproperties();
	if(browser.equalsIgnoreCase("fx")){
	System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
	Driver=new FirefoxDriver();}
	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		Driver=new ChromeDriver();
	}		
	}*/

	public  static void getURL(String url){
		Driver.get(url);
	}


	/*public static WebElement getElements(String locator, String locatorType){
		WebElement WE = null;
		//String locatorName=or.getProperty(locator);
		if(locatorType.equalsIgnoreCase("xp"))
		{	
			WE=Driver.findElement(By.xpath(locator));
		}
		else if(locatorType.equalsIgnoreCase("NM"))
		{
			WE=Driver.findElement(By.className(locator));
		}
		else if(locatorType.equalsIgnoreCase("id"))
		{
			WE=Driver.findElement(By.id(locator));
		}
		else if(locatorType.equalsIgnoreCase("LT"))
		{
			WE=Driver.findElement(By.linkText(locator));
		}
		else if(locatorType.equalsIgnoreCase("name"))
		{
			WE=Driver.findElement(By.name(locator));
		}
		return WE;
	}
*/
	public static void Mouseover(WebElement action){
		Actions acsn=new Actions(Driver);
		acsn.moveToElement(action).build().perform();
	}

	public static void FNclick(WebElement clk){
		clk.click();

	}

	public static void LeftClick(WebElement leftclk){
		Actions act=new Actions(Driver);
		act.contextClick(leftclk).build().perform();
	}


	public static void doubleclik(WebElement dblclk){
		Actions act=new Actions(Driver);
		act.doubleClick(dblclk).build().perform();
	}



	public static void dropDown(int select){
		Select slct=new Select(we);
		slct.selectByIndex(select);
	}

	public static void sendkey(WebElement nam){
		nam.sendKeys();
	}

	public static void quite(){
		Driver.quit();
	}

	public static void setproperties() throws IOException{
		or=new Properties();
		FileInputStream file = new FileInputStream("or.properties");
		or.load(file);
	}
	
	public static  Object[][] ReadExcel(String sheet){
		try {
			file =new FileInputStream("C:/Users/user/maven/resume/src/main/java/com/HelpResume/configureClass/Book1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		 try {
			book =new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		seet=book.getSheet(sheet);
		
		Object[][] obj=new Object[seet.getLastRowNum()][seet.getRow(0).getLastCellNum()];
	    /*Row=seet.getLastRowNum();
		Cell=rowNo.getLastCellNum();
		 rowNo=seet.getRow(0);
		 Object[][] obj =new Object[Row][Cell];*/
		/*for(int i=0; i<=Row-1; i=i+1){	 
		for(int j=0; j<=Cell-1; j=j+1){	*/
		
		for(int i=0; i<seet.getLastRowNum(); i=i++){
			for(int j=0; j<seet.getRow(0).getLastCellNum(); j=j++){	
		obj[i][j]=seet.getRow(i+1).getCell(j).toString();
		}
		}

		return obj;
		}
	
		
	public static void SceenShort(String fileName) throws IOException{
		File screen =((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("/resume/src/main/java/screenshort"+fileName+".jpg"));
		
	}
	
	
	}
	





