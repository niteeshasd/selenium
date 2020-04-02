import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		System.out.print(driver.getTitle());

		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Set<String> tabs= driver.getWindowHandles();
		Iterator<String> it= tabs.iterator();
		String parent= it.next();
		
		String frsttab = it.next();
		String scndtab = it.next();
		driver.switchTo().window(frsttab);
		System.out.println(driver.getTitle());
		driver.switchTo().window(scndtab);
		System.out.println(driver.getTitle());
		
		

		//driver.findElement(By.linkText("About this Policy")).click();


	}

}