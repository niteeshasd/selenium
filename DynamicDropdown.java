import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\NITEESHA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='HYD']")).click();
		//driver.findElement(By.xpath("//a[@value='HYD']")).click();
	

	}

}
