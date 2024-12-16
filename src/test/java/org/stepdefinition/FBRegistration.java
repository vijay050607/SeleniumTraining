package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FBSignUpPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBRegistration extends BaseClass {
	FBSignUpPojo s;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
	    
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box() {
	    
	}

	@When("To pass surname in surname text box")
	public void to_pass_surname_in_surname_text_box() {
	    
	}

	@When("To pass mobile no or email in email text box")
	public void to_pass_mobile_no_or_email_in_email_text_box() {
	    
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
	    
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	    
	}

}
