package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver=null;

		@Given("browser is open")
		public void user_open_browser() {
			System.out.println("Browser is open");
			String projectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			
		}
		
		@And("user is on google search page")
		public void user_on_search_page() {
			System.out.println("User is on google search page");
			driver.navigate().to("https://www.google.com/");
		}
		
		@When("user enters in search box")
		public void user_enters_text() {
			System.out.println("User enters text in search box");
			driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Cucumber Demo");
		}
		
		@And("hits enter")
		public void user_hits_enter() {
			System.out.println("User hits enter");
			driver.findElement(By.xpath("//input[@class=\"gNO89b\"]")).sendKeys(Keys.ENTER);
		}
		
		@Then("user is navigated to search result")
		public void navigated_to_search_result() {
			System.out.println("User is navigated to the search results");
			driver.getPageSource().contains("Request Free Trial");
			driver.close();
		}

	}
