package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Example1Steps_PF {
	WebDriver driver=null;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("browser is open now")
	public void user_opens_browser() {
		
		System.out.println("I am inside this PF step");
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
	}
	
	@And("User is on login page")
	public void user_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
	}
	
	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_texts(String username, String password) {
		
		login=new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	}
	
	@And("hits login button")
	public void user_hits_login() {
		login.clickLogin();
	}
	
	@Then("user is navigated to the next action page")
	public void navigated_to_next_page() {

		home.checkLogoutIsDisplayed();
		driver.close();
	}

}
