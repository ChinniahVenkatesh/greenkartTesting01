package commonUtils;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserSetup {
	
	ChromeDriver driver;

	public ChromeDriver chromeSetup()
	{
		driver = new ChromeDriver();
		return driver;
	}
}
