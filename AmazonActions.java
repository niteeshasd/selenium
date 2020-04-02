import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.amazon.com/");
		 
		Thread.sleep(3000);
		 
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='nav-a nav-a-2']"))).build().perform();
		//a.doubleClick(driver.findElement(By.xpath("//a[@class='nav-a nav-a-2']"))).build().perform();
		 
		 
		WebElement accountLinks = driver.findElement(By.id("nav-al-container"));
		int links = accountLinks.findElements(By.tagName("a")).size();
		System.out.println(links);
		 
		for(int i=0; i<links; i++)
		{
			String linkText = accountLinks.findElements(By.tagName("a")).get(i).getText();         
			if(linkText.equals("Pantry Lists"))
			{
				System.out.println(linkText);
				accountLinks.findElements(By.tagName("a")).get(i).click();
				System.out.print(driver.getTitle());
				 break;
			}
		}



	}

}
