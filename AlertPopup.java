import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.print(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		

	}

}
