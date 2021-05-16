package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/hooks.feature", 
				 glue={"stepsForHooks"},
				 monochrome=true,
				 plugin={"pretty", "html:target/HooksReports"})
public class HooksRunner {

}
