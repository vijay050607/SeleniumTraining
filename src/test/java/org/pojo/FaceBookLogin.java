package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLogin extends BaseClass {

	public FaceBookLogin() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement Username;

	@FindBy(name = "pass")
	private WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginBtn;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

}
