package com.StepDefinition;



import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

import PageobjectManager.PageObjectManager;
import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should verify after login Success Message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expLoginuccessmessage) {
		
		WebElement hellouser = pom.getSearchHotelpage().getHellouser();
		String actualvalue = getInsertedValue(hellouser);
		Assert.assertEquals("verifying after login success message", actualvalue,expLoginuccessmessage );
	
		
	}

}
