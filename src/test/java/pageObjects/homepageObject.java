package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageObject {
	
	public ChromeDriver driver;

	public homepageObject(ChromeDriver driver)
	{
		//this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='brand greenLogo']")
	WebElement productLogo;
	
	public WebElement productLogo()
	{
		return productLogo;
	}
	
	@FindBy(css="input[type='search']")
	WebElement searchBox;
	
	public WebElement searchBox()
	{
		return searchBox;
	}
	
	@FindBy(xpath = "//input[@placeholder='Search for Vegetables and Fruits']")
	WebElement placeHolderText;
	
	public WebElement placeHolderText()
	{
		return placeHolderText;
	}
	
	@FindBy(xpath="//div[@class='products']/div")
	List<WebElement> productsCount;
	
	public List<WebElement> productsCount()
	{
		return productsCount;
	}

	@FindBy(xpath="//a[text()='Flight Booking']")
	WebElement flightBookingLink;
	
	public WebElement flightBookingLink()
	{
		return flightBookingLink;
	}
	
}
