package com.page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingConfirmation;	

	@FindBy(id="order_no")
	private WebElement orgId;

	public WebElement getBookingConfirmation() {
		return bookingConfirmation;
	}

	public WebElement getOrgId() {
		return orgId;
	}
		
	public String bookingconfirm(String ordernum) {

		String booking = getText(getBookingConfirmation());
		Assert.assertEquals("verify", "Booking Confirmation", booking);
		 String insertedValues = getInsertedValues(getOrgId(), ordernum);
		 System.out.println(insertedValues);
		return insertedValues;
	}
}

