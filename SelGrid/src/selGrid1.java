import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class selGrid1 {
	WebDriver driver;
	@Test
	public void  HomePageCheck() {
		
		//System.setProperty("WebDriver.chrome.driver","C:\\Users\\navan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.acceptInsecureCerts();
		caps.setBrowserName("msedge");
		driver= new RemoteWebDriver(caps);
		driver.get("selinum.com");
		
		
		
	}

}
