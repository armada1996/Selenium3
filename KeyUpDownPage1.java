// 06/08/22

package ActionsClass;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpDownPage1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_UP).perform();
	}
}
