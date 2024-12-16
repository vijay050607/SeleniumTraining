package org.stepdefinition;

import org.base.BaseClass;
import org.base.FaceBookLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBLoginScenarioOutline extends BaseClass {
	
	FaceBookLogin fb;
	@Given("User has to launch the browser and Maximize the wimmdow")
	public void user_has_to_launch_the_browser_and_Maximize_the_wimmdow() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		fb= new FaceBookLogin();
		passText(em, fb.getUsername());
				
	   
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		fb= new FaceBookLogin();
		passText(pass, fb.getPassword());
	   
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
		fb= new FaceBookLogin();
		clickBtn(fb.getLoginBtn());
	   
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	   
	}

}
