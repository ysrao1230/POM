package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.*;

public class test {
	public static WebDriver driver;

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Opening Browser");
		System.setProperty("webdriver.gecko.driver", "../BDD/Driver/geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Browser launched");
		driver.get("http://facebook.com");
		System.out.println("Website opened");
		driver.manage().window().maximize();
		System.out.println("Driver maximized");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User navigate to login page");
	}

	@And("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User eneters user name and password");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ysr036");
		System.out.println("User name Enetered");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Srinu@1236.");
		System.out.println("Password entered");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Success message displayed after login to application");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/" + "div[1]/div[2]/div[4]/div[1]/span/div/div[1]/i"))
				.click();
		driver.findElement(By.cssSelector(".b20td4e0 > div:nth-child(4) > div:nth-child(1) >"
				+ " div:nth-child(1) > div:nth-child(2) > div:nth-child(1) >"
				+ " div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span")).click();

		/*
		 * String elem = driver.findElement(By.xpath("//*[@id=\"u_0_f\"]")).getText();
		 * System.out.println(elem); Assert.assertEquals("Didn't receive a code?",
		 * elem);
		 */ driver.quit();

	}
}
