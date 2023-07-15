package commonUtils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class browserSetup {
	
	//ChromeDriver driver;
	public WebDriver driver;

	/*public ChromeDriver chromeSetup()
	{
		driver = new ChromeDriver();
		return driver;
	}*/
	
	public WebDriver seleniumgridrun() throws MalformedURLException
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new RemoteWebDriver(new URL("http://192.168.0.109:4444"),co);
		 
		return driver;
	}
}
