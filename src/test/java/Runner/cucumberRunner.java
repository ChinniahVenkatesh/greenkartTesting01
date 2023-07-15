package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = {"stepDefinitions"},
		tags = "@RegTest or @smokeTest",
		plugin = {"pretty","html:target/GreenkartTestResult.html","json:target/cucumber-reports/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
		)

public class cucumberRunner {

}

