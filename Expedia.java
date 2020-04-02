//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Expedia {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
		WebElement source = driver.findElement(By.id("flight-origin-hp-flight"));
		source.click();
		source.sendKeys("sea");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=  driver.findElement(By.id("flight-destination-hp-flight"));
		destination.click();
		destination.sendKeys("san");
		Thread.sleep(2000);
		
		//WebDriverWait d = new WebDriverWait(driver, 5);
		//d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]")));
		for(int i=0;i<5;i++)
			destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]")).click();
		while(!driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText().contains("Oct"))
		{
			driver.findElement(By.cssSelector("button[class*='datepicker-next']")).click();
			
		}
		//List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count= driver.findElements(By.xpath("//button[@class='datepicker-cal-date']")).size();
		//System.out.print(count);
		for(int i=0;i<count;i++)
		{		String text= driver.findElements(By.xpath("//button[@class='datepicker-cal-date']")).get(i).getAttribute("data-day");
			if(text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.xpath("//button[@class='datepicker-cal-date']")).get(i).click();
				break;
			}

		}
		
		driver.findElement(By.xpath("//*[@id=\"flight-returning-wrapper-hp-flight\"]")).click();
		while(!driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText().contains("Nov"))
		{
			driver.findElement(By.cssSelector("button[class*='datepicker-next']")).click();
			
		}
		//List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count1= driver.findElements(By.xpath("//button[@class='datepicker-cal-date']")).size();
		//System.out.print(count1);
		for(int i=0;i<count1;i++)
		{
			String text= driver.findElements(By.xpath("//button[@class='datepicker-cal-date']")).get(i).getAttribute("data-day");
			if(text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.xpath("//button[@class='datepicker-cal-date']")).get(i).click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("button[class*='gcw-traveler-amount-select']")).click();
		driver.findElement(By.xpath("(//div[@class='menu-main'])[2]/div/div/div[4]/button/span")).click();
		//driver.findElement(By.xpath("(//div[@class='menu-main'])[2]/div/div/div[4]/button/span")).click();
		driver.findElement(By.cssSelector(("button.btn-primary.btn-action.gcw-submit"))).click();
		
		
		
		

	}

}
