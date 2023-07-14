package stepDefinitions;





import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test01 {
	
	WebDriver driver;
	public  Logger log = LogManager.getLogger(Test01.class);
	
	@Given("Access the Espncricinfo url {string}")
	public void access_the_espncricinfo_url(String string) {
	   driver  = new ChromeDriver();
	   driver.get(string);
	   
	}

	@When("User is on home-page maximize the page")
	public void user_is_on_home_page_maximize_the_page() {
	   driver.manage().window().maximize();
	}

	@Then("validate the alert pop-up")
	public void validate_the_alert_pop_up() throws IOException {
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	   driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	   log.info(driver.getTitle());
	}
	
	@Then("validate the page-title")
	public void validate_the_page_title() throws IOException
	{
		//String expectedTitle = "Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		log.info(actualTitle);
	}
}
