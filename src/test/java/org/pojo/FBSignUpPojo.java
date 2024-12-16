package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignUpPojo extends BaseClass {
	
	public FBSignUpPojo() {
		PageFactory.initElements(driver, this);
	
	}
	
	public WebElement getNeeaccBtn() {
		return NeeaccBtn;
	}

	public WebElement getFName() {
		return FName;
	}

	public WebElement getSName() {
		return SName;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getNewpass() {
		return Newpass;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement NeeaccBtn;
	
	@FindBy(name="firstname")
	private WebElement FName;
	
	@FindBy(name="lastname")
	private WebElement SName;
	
	@FindBy(name="reg_email__")
	private WebElement mail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Newpass;
	

}
