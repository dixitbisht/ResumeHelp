package screenshort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.omg.PortableInterceptor.Current;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.HelpResume.BaseClass.BaseClasses;
import com.HelpResume.utilitiClass.UtilityClass;

public class facebook extends BaseClasses {
	
	
	
     @Test
	public static void scshort() throws IOException{
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
	 Driver= new FirefoxDriver();
		Driver.get("https://www.facebook.com/");
		SceenShort("login_page");
	}

	public static void SceenShort(String fileName) throws IOException{
		File screen =((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("C:/Users/user/maven/resume/src/main/java/screenshort"+fileName+".png"));
		
	}
	
}
