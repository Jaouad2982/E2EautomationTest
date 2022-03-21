package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="txtUsername")
	private static WebElement userName;
	@FindBy(id="txtPassword")
	private static WebElement password;
	@FindBy(id="btnLogin")
	private static WebElement btn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUser() {
		return this.userName;
	}
	
	public WebElement getPassword() {
		return this.password;
	}
	public WebElement getBTN() {
		return this.btn;
	}
	
}
