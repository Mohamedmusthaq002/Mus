package org.examples;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {

		browserLaunch();
		launchUrl("https://www.facebook.com/");
	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {

		LoginPojo l = new LoginPojo();
		WebElement txtEmail = l.getTxtEmail();
		Values(txtEmail, "smartskill");

		WebElement txtPass = l.getTxtPass();
		Values(txtPass, "1234");
	}

	@When("User click login button")
	public void user_click_login_button() {

		LoginPojo l = new LoginPojo();
		WebElement loginButton = l.getLoginButton();
		ClickButton(loginButton);
	}

	@Then("user should be in invalid credentials page")
	public void user_should_be_in_invalid_credentials_page() {

		System.out.println("user enter invalid credentials pages");
	}
}
