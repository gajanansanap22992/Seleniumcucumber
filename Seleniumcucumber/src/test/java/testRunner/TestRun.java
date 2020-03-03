package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = {".//FeaturesFiles/"},
		glue = "stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:test-output"},
		tags = {"@Regression"}
		)

public class TestRun {

}
