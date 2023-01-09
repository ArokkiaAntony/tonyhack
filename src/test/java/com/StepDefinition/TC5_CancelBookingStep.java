package com.StepDefinition;

import PageobjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep {
	
	PageObjectManager pom = new PageObjectManager();

	@Then("user should cancel the booking by saved Order Id")
	public void userShouldCancelTheBookingBySavedOrderId() {
	}

	@Then("user should verify after cancel booking success message {string}")
	public void userShouldVerifyAfterCancelBookingSuccessMessage(String string) {
	}

	@Then("user should cancel the Existing Order Id {string}")
	public void userShouldCancelTheExistingOrderId(String string) {
	}

}
