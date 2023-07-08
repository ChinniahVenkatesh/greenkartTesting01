package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonUtils.ExcelDataTest;
import commonUtils.browserSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homepageObject;

public class HomePage {
	
	public static ChromeDriver driver; //driver = null 
	
	@Given("Access the url {string}")
	public void access_the_url(String url) {
	   browserSetup bs = new browserSetup();
	  driver = bs.chromeSetup();
	  driver.get(url);
	}

	@When("Page loads maximize the page")
	public void page_loads_maximize_the_page() {
	   driver.manage().window().maximize();
	}

	@Then("Validate the page tile")
	public void validate_the_page_tile() {
	   System.out.println(driver.getTitle());
	System.out.println(driver.getTitle());	//This needs to removed duplicate
	}

	@Then("Validate the product name")
	public void validate_the_product_name() {
		homepageObject hp = new homepageObject(driver);
		String productLogoTextGreen = hp.productLogo().getText();
		System.out.println(productLogoTextGreen);
	}
	
	@When("Search field box is enabled")
	public void search_field_box()
	{
		homepageObject hp = new homepageObject(driver);
		hp.searchBox().isEnabled();
	}
	
	@Then("validate the search field placeholder text {string}")
	public void validate_the_search_field_placeholder_text(String string) {
	   
		homepageObject hp = new homepageObject(driver);
		String actualText = hp.placeHolderText().getAttribute("placeholder");
		if(actualText.equals(string))
		{
			System.out.println("Test is passed");
		}
	}
	
	@Then("Enter the <keyword> on search field box")
	public void Enter_the_keyword_on_search_field_box(DataTable dataTable) throws InterruptedException {
		homepageObject hp = new homepageObject(driver);
		int i = 0;
		while(i < 3)
		{
			hp.searchBox().sendKeys(dataTable.column(i).get(0));
			i++;
			hp.searchBox().clear();
		}
	}
	
	@Given("User is on greenkart home-page")
	public void User_is_on_greenkart_home_page()
	{
		driver.navigate().refresh();
	}
	
	@Then("validate the count of the products in page")
	public void validate_the_count_of_the_products_in_page()
	{
		homepageObject hp = new homepageObject(driver);
		List<WebElement> productsList = hp.productsCount();
		System.out.println(productsList.size());
	}

	@When("Flight-booking link is enabled")
	public void Flight_booking_link_is_enabled()
	{
		homepageObject hp = new homepageObject(driver);
		hp.flightBookingLink().isEnabled();
	}
	
	@Then("Validate the flight booking link")
	public void Validate_the_flight_booking_link()
	{
		homepageObject hp = new homepageObject(driver);
		hp.flightBookingLink().click();
	}
	
	@When("User is on search field box")
	public void user_is_on_search_field_box()
	{
		homepageObject hp = new homepageObject(driver);
		hp.searchBox().isEnabled();
	}
	
	@Then("Validate the {string} in search field")
	public void validate_the_in_search_field(String string) throws IOException {
	   
		homepageObject hp = new homepageObject(driver);
		hp.searchBox().sendKeys(string);
		hp.searchBox().clear();
		ExcelDataTest ex = new ExcelDataTest();
		ex.excelIntegration();
				
	}

	
}
