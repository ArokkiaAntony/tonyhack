package com.StepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

import PageobjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Given("user is on the home page")
	public void userIsOnTheHomePage() {
	}

	@When("user should perform login {string},{string}")
	public void userShouldPerformLogin(String string, String string2) {
	}

	@Then("user should verify login success message {string}")
	public void userShouldVerifyLoginSuccessMessage(String string) {
	}

	@When("user should perform login {string},{string} with Enter Key")
	public void userShouldPerformLoginWithEnterKey(String string, String string2) {
	}

	@Then("user should verify after login with invalid credential error message contains {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialErrorMessageContains(String string) {
	}

}
