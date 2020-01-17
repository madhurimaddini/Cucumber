package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPaymentPage {

	public WebDriver ldriver;

	public NewPaymentPage(WebDriver rdriver) {
		//System.out.println("$$$$$$$" + rdriver.getCurrentUrl());
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		//System.out.println("$$$$$$$" + rdriver.getCurrentUrl());
	}

	@FindBy(xpath = "//app-xd-wallet-gadget/div[1]/div[2]/div[1]/button[text()=' New Payment ']")
	@CacheLookup
	WebElement btnNewPayment;
	
	@FindBy(xpath = "//app-new-wallet-payment-modal/div[1]/div[1]/label/p[1]")
	@CacheLookup
	WebElement makePaymentHeader;
	

	public void clickNewPaymentbtn() {

		btnNewPayment.click();

	}
	
	public String getMakePaymentHeader() {

		return makePaymentHeader.getText();
	}

	

}
