package Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
    public static void main(String[]  args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable");
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        WebElement checkbox = driver.findElement(By.xpath("//table[@id='product']//tbody/tr[1]/td[1]/input"));
        checkbox.click();


        
        //java.util.List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
      // for (WebElement checkbox : checkboxes) {
        // checkbox.click(); 
        //}
          driver.quit(); 
    }
}
