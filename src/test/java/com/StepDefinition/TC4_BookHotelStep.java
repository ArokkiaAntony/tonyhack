package com.StepDefinition;

import PageobjectManager.PageObjectManager;
import io.cucumber.java.en.Then;

public class TC4_BookHotelStep {
	
	PageObjectManager pom = new PageObjectManager();

	@Then("user should enter {string},{string} and {string}")
	public void userShouldEnterAnd(String string, String string2, String string3,
			io.cucumber.datatable.DataTable dataTable) {
	}

	@Then("user should verify after booking success message {string} and save Order Id")
	public void userShouldVerifyAfterBookingSuccessMessageAndSaveOrderId(String string) {
	}

	@Then("user should not enter any entries in the fields")
	public void userShouldNotEnterAnyEntriesInTheFields() {
	}

	@Then("user should verify error message {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyErrorMessageAnd(String string, String string2, String string3, String string4,
			String string5, String string6, String string7) {
	}

}
