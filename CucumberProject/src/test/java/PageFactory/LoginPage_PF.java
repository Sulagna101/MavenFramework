package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id="name")
	WebElement text_username;
	
	@FindBy(id="password")
	WebElement text_password;
	
	@FindBy(id="login")
	WebElement btn_Login;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage_PF.class);
	}
	
	public void enterUsername(String username) {
		text_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		text_password.sendKeys(password);
	}

	
	public void clickLogin() {
		btn_Login.click();
	}
}
