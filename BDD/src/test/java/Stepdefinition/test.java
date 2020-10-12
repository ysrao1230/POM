package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {
	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User on home page");
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
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Success message displayed after login to application");
	}
}
