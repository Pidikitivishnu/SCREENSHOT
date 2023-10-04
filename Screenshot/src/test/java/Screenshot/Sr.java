package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sr {

	public static void main(String[] args) throws Throwable {
		
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.ilovepdf.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    TakesScreenshot ts=(TakesScreenshot) driver;
	   File source=ts.getScreenshotAs(OutputType.FILE);
	   File Destination=new File("./target/demo.png");
	   FileUtils.copyFile(source, Destination);
	   
	  
	   
	 
	   
	   
	   
	   
	    
	}

}
