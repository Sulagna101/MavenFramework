package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Example1.feature",
glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty", "html:target/HtmlReport4"})

//New comment added
public class Example1Runner {

}
