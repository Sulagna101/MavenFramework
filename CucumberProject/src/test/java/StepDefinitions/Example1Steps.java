package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Example1Steps {
	WebDriver driver=null;

	@Given("browser is open now")
	public void user_opens_browser() {

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
		
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	@And("hits login button")
	public void user_hits_login() {

		driver.findElement(By.xpath("//button[@id=\"login\"]")).click();
	}
	
	@Then("user is navigated to the next action page")
	public void navigated_to_next_page() {

		driver.getPageSource().contains("Hello Cucumber Demo");
		driver.close();
	}

}
