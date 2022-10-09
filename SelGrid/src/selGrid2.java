import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class selGrid2 {
	
	@Test
	public void  HomePage3Check() {
		
		//System.setProperty("WebDriver.chrome.driver","C:\\Users\\navan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.acceptInsecureCerts();
		caps.setBrowserName("chrome");
		WebDriver driver= new RemoteWebDriver(caps);
		driver.get("http://rahulshetty.com");
		System.out.println("Selgrid sample");
	}

}
