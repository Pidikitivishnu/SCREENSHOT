package Screenshot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement iframe=driver.findElement(By.id("frm2"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("firstName")).sendKeys("vishnu");
		driver.findElement(By.id("lastName")).sendKeys("pidikiti"); 
		driver.findElement(By.id("malerb")).click();
        
		//driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("pidikitivishnu424@gmail.com");
		driver.findElement(By.id("password")).sendKeys("vishnu");
		List<WebElement> tag= driver.findElements(By.cssSelector("input[class^='bcCheckBox']"));
		for (int i=0;i<2;i++) {
		tag.get(i).click();;
		} 
		
		
		//WebElement drodown=driver.findElement(By.id("course"));
		//Select sel=new Select(drodown);
		//sel.selectByIndex(1);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("completed");
		
		

	}

}
