package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	private By text_usernamer=By.id("name");
	private By text_password=By.id("password");
	private By btn_login=By.id("login");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(text_usernamer).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(text_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	
}
