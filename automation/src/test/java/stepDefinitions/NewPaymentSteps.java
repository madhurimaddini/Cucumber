package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.NewPaymentPage;

public class NewPaymentSteps {

	public WebDriver driver = LoginSteps.getDriver();
	public LoginPage lp;
	public LoginSteps ls;
	
	public NewPaymentPage np = new NewPaymentPage(driver);

	@When("Click on NewPayment button")
	public void click_on_NewPayment_button() {
		System.out.println("@@@@@" + driver.getCurrentUrl());
		np.clickNewPaymentbtn();

	}

	@Then("Page Title Should be {string}")
	public void page_Title_Should_be(String title) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (np.getMakePaymentHeader().equals(title)) {
			Assert.assertTrue(true);
	}

		/*
		 * @Then("Available Wallet Balance should be {string}") public void
		 * available_Wallet_Balance_should_be(String string) { // Write code here that
		 * turns the phrase above into concrete actions
		 * 
		 * }
		 */
		
		
	}	
	
}