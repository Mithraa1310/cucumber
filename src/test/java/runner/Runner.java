package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "src/test/java/feature/leadcreation.feature", glue="steps", monochrome=true)

public class Runner extends AbstractTestNGCucumberTests{

	
}
