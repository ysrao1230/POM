package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class test {
	static WebDriver driver;

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

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User eneters user name and password");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ysr036");
		System.out.println("User name Enetered");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Srinu@1236.");
		System.out.println("Password entered");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Success message displayed after login to application");
		
		String elem = driver.findElement(By.xpath("//*[@id=\"u_0_f\"]")).getText();
		System.out.println(elem);
		/*if(elem.equalsIgnoreCase("")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}*/
		Assert.assertEquals("this is text", elem);
			
	}
}
