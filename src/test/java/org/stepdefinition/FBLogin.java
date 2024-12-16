package org.stepdefinition;

import org.base.BaseClass;
import org.base.FaceBookLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBLogin extends BaseClass {
	
	FaceBookLogin fb;
	
	@Given("To launch the chrome browser and Maximize window")
	public void to_launch_the_chrome_browser_and_Maximize_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		fb= new FaceBookLogin();
		passText("Vijay55@gmail.com", fb.getUsername());
	   
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		fb= new FaceBookLogin();
		passText("123456", fb.getPassword());
	   
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		fb= new FaceBookLogin();
		clickBtn(fb.getLoginBtn());
	   
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
		System.out.println("To Check Your Login Credentials");
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	   
	}

}
