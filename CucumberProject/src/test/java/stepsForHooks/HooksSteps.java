package stepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {
	
	WebDriver driver=null;
	
	@Before(order=1)
	public void browsrSetup() {
		
		System.out.println("I am inside browser setup");
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Before(order=2)
	public void SetUp1() {
		System.out.println("I am inside 2nd setup method");
	}
	
	@After(order=1)
	public void tearDown() {
		System.out.println("I am inside teardown");
		driver.close();
	}
	
	@After(order=2)
	public void tearDown2() {
		System.out.println("I am inside 2nd tear down method");
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("I am inside before steps");
	}
	
	@AfterStep
	public void aferSteps() {
		System.out.println("I am insode after steps");
	}
	
	@Given("user is on login page")
	public void user_on_login_page() {
		
	}

	@When("user enters valid username and password")
	public void user_enters_username_password() {
		
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		
	}
	
	@Then("user is navigated to the home page")
	public void user_navigated_to_home_page() {
		
	}
}
