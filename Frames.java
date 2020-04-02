import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement destination= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, destination).build().perform();
		
		driver.switchTo().defaultContent();
		
		

	}

}
