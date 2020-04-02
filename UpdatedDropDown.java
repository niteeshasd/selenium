import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author abhin
 *
 */
public class UpdatedDropDown {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\NITEESHA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hrefIncAdt")).click();;
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.print(driver.findElement(By.id("divpaxinfo")).getText());
	

	}

}
