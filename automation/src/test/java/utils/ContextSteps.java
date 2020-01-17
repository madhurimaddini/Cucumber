package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContextSteps {

	private WebDriver driver;

	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public WebDriver getDriver() {
		if (driver != null) {
			return driver;
		}
		try {
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
}
