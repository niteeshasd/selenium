import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\NITEESHA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com");
		Thread.sleep(2000);
		WebElement source=  driver.findElement(By.id("package-origin-hp-package"));
		source.click();
		source.sendKeys("sea");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=  driver.findElement(By.id("package-destination-hp-package"));
		destination.click();
		destination.sendKeys("san");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ARROW_DOWN);
		
		//destination.sendKeys(Keys.ENTER);
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"package-destination-hp-package\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);*/
			
		
	}
}
	
