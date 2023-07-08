package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Dummy {
	
	
	@Given("User is on homepage")
	public void user_is_on_home()
	{
		System.out.println("Home page from dummy");
	}

	@Then("Validate the aler feature")
	public void then_validate_the_aler_feature()
	{
		System.out.println("Alert from dummy");
	}
}
