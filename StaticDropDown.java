import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\NITEESHA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com");
		
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		Thread.sleep(5000L);
		s.selectByValue("USD");
		//driver.close();
		
		//s.selectByIndex(2);
		//s.selectByVisibleText("USD");
		//driver.close();
		
		
	}

}
