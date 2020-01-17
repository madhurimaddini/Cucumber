package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//a[contains(text(), 'Login')]")
	@CacheLookup
	WebElement initialLogin;

	@FindBy(xpath = "//div/div/pc-login-modal/div[1]/div[3]/div/button")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//a[contains(text(), 'Log Out')]")
	@CacheLookup
	WebElement lnkLogout;

	@FindBy(xpath = "//div/label[@class='form-error']")
	@CacheLookup
	WebElement invalidUsernameError;

	@FindBy(xpath = "//div[@class='top-header-heading']/h1")
	@CacheLookup
	WebElement profileHeader;

	@FindBy(xpath = "//a[text()='Login']")
	@CacheLookup
	WebElement logoutCheck;
	
	

	public void setUserName(String uname) {

		txtEmail.clear();
		txtEmail.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.clear();

		txtPassword.sendKeys(pwd);

	}

	public void clickLogin() {

		btnLogin.click();

	}

	public void clickInitialLogin() {

		initialLogin.click();

	}

	public void clickLogout() {

		lnkLogout.click();

	}

	public String getInvalidUsernameError() {

		return invalidUsernameError.getText();
	}
	
	public String getProfileHeader() {

		return profileHeader.getText();
	}

	public String getLogoutCheck() {

		return logoutCheck.getText();
	}

	
	
}