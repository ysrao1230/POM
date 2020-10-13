package Stepdefinition;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DidntReceive {

	@Given("^user launched browser$")
	public void user_launched_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(12, 12);
		System.out.println("launching Browser");

	}

	@When("^user navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to login page");

	}

	@When("^Enter (.*) and (.*)$")
	public void enter_username_and_Password(String username, String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Enter" + username + "and" + password);
	}

	@Then("^click on didint recive link$")
	public void click_on_didint_recive_link(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("navigate to next page and click on didn't recive link");

	}
}
