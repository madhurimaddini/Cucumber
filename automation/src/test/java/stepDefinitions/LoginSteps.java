package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {

	public static WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() throws InterruptedException {
		driver = getDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
	}

	@When("User Opens URL {string}")
	public void user_Opens_URL(String url) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Click on InitialLogin")
	public void click_on_InitialLogin() throws InterruptedException {
		lp.clickInitialLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_Email_as_and_Password_as(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("User enter Email as {string}")
	public void user_enter_Email_as(String email) {
		lp.setUserName(email);
	}

	@When("User enter Password as {string}")
	public void user_enter_Password_as(String password) {
		lp.setUserName(password);
	}

	@When("Click on Login")
	public void click_on_Login() throws InterruptedException {
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("Page header Should be {string}")
	public void page_header_Should_be(String title) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (lp.getProfileHeader().equals(title)) {
			Assert.assertTrue(true);
		}

	}

	@Then("Check Log In Text {string}")
	public void Check_Log_In_Text(String title) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (lp.getLogoutCheck().equals(title)) {
			Assert.assertTrue(true);
		}
	}

	@When("User clicks on Log out link")
	public void user_clicks_on_Log_out_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.clickLogout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Then("Display Error as {string}")
	public void display_Error_as(String error) {

		String errorText = lp.getInvalidUsernameError();

		Assert.assertEquals(errorText, error);

	}

	public static WebDriver getDriver() {
		if (driver != null) {
			return driver;
		}

		return initilize();
	}

	private static WebDriver initilize() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
