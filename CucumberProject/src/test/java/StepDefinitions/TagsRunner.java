package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/TagsFolder/tags.feature", 
				 glue={"StepDefinitions"},
				 tags="@Firsttag and @Secondtag")
public class TagsRunner {

}
