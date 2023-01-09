package com.StepDefinition;

import PageobjectManager.PageObjectManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {
	
	PageObjectManager pom = new PageObjectManager();

	@When("user should enter all credentials in Search Hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldEnterAllCredentialsInSearchHotelAnd(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8) {
	}

	@Then("user should verify Search Hotel after Success Message {string}")
	public void userShouldVerifySearchHotelAfterSuccessMessage(String string) {
	}

	@When("user should enter only mandatory fields in Search Hotel {string},{string},{string},{string} and {string}")
	public void userShouldEnterOnlyMandatoryFieldsInSearchHotelAnd(String string, String string2, String string3,
			String string4, String string5) {
	}

	@Then("user should verify invalid date error message {string},{string}")
	public void userShouldVerifyInvalidDateErrorMessage(String string, String string2) {
	}

	@When("user should enter without any fields and Enter Search botton")
	public void userShouldEnterWithoutAnyFieldsAndEnterSearchBotton() {
	}

	@Then("user should verify invalid error message {string}")
	public void userShouldVerifyInvalidErrorMessage(String string) {
	}

}
