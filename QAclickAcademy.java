import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class QAclickAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='listbuilder-popup-scale']/div/div/span/div/div[7]")).click();;
		driver.findElement(By.xpath("//div[@class='container']/nav/ul/li[5]")).click();
		
		// Radio Buttons
		int count= driver.findElements(By.xpath("//input[@class='radioButton']")).size();
		
		for(int i=0;i<count;i++)
		{
			driver.findElements(By.xpath("//input[@class='radioButton']")).get(i).click();
		}
		
		for(int i=0;i<count;i++)
		{
			String button = driver.findElements(By.xpath("//input[@class='radioButton']")).get(i).getAttribute("value");
			if(button.equals("radio2"))
			{
				driver.findElements(By.xpath("//input[@class='radioButton']")).get(i).click();
				break;
			}
		}
		String opt = "option2";
		
		//CHECK BOXES
		int check= driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		
		for(int i=0;i<check;i++)
		{
			String button = driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("value");
			if(button.equals(opt))
			{
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
				break;
			}
		}
		
		//Dropdown
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(opt);
		
		//Alert 
		driver.findElement(By.id("name")).sendKeys(opt);
		
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		

		/*driver.navigate().back();
		System.out.println(driver.findElements(By.tagName("a")).size());

		
		WebElement footer = driver.findElement(By.id("prefooter"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement colfooter = driver.findElement(By.xpath("//div[@id='prefooter']/div/div/div"));

		count = colfooter.findElements(By.tagName("a")).size();
		
		String clickontab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		for(int i=0;i<count;i++)
		{
			colfooter.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			Thread.sleep(5000);
		}
		
		Set<String> tabs= driver.getWindowHandles();
		Iterator<String> it= tabs.iterator();
		while(it.hasNext())
		{
			String tab = it.next();
			driver.switchTo().window(tab);
			System.out.println(driver.getTitle());
		
			
		}*/
		
		
		}
		
	}


