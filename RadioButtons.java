import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\NITEESHA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/toolpopupgenerator.htm");
		Thread.sleep(2000);
		int count = driver.findElements(By.xpath("//input[@name='R3']")).size();
		System.out.println(count);
		for(int i=0;i<count; i++)
		{
			String text = driver.findElements(By.xpath("//input[@name='R3']")).get(i).getAttribute("value");
			if(text.equals("V20"))
			
				{
					driver.findElements(By.xpath("//input[@name='R3']")).get(i).click();
					break;
				}
			
		}
		
		
	}

}
