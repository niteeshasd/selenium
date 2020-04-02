import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.openqa.selenium.interactions.Actions;

public class Tables {


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhin\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22637/wia-vs-inda-3rd-unofficial-odi-india-a-tour-of-west-indies-2019");
		
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		WebElement table = driver.findElement(By.cssSelector("div.cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		
		int count = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms")).size();
		System.out.println(count);
		int sum =0;
		
		for(int i=0; i<count-3; i++)
		{
			String val= table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
			sum= sum+ Integer.parseInt(val);
			
		}
		
		String Extras = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		sum =sum + Integer.parseInt(Extras);
		
		String Total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int total = Integer.parseInt(Total);
		
		
		Assert.assertEquals(sum, total);

		
		
		
		

	}
}
