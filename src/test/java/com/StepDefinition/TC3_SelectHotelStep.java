package com.StepDefinition;

import PageobjectManager.PageObjectManager;
import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep {
	
	
	PageObjectManager pom = new PageObjectManager();

	@Then("user should select Hotel Name")
	public void userShouldSelectHotelName() {
	}

	@Then("user should verify after select Hotel success message {string}")
	public void userShouldVerifyAfterSelectHotelSuccessMessage(String string) {
	}

	@Then("user should click continue without selecting hotel name")
	public void userShouldClickContinueWithoutSelectingHotelName() {
	}

	@Then("user should verify error message {string}")
	public void userShouldVerifyErrorMessage(String string) {
	}

}
