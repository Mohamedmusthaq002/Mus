package org.examples;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{

	
	public LoginPojo() {
	
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@CacheLookup
	@FindBy(name="pass")
	private WebElement txtPass;
	
	//OR
	@CacheLookup
	@FindAll({
		@FindBy(name="logins"),  //f
		@FindBy(xpath="//button[text()='Log in']")//t
	})
	private WebElement loginButton;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	
	
	
}
