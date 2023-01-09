package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[contains(text(),'The booking has been cancelled')]")
	private WebElement CancelationText;
	public WebElement getCancelationText() {
		return CancelationText;
	}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement selectbookItinerary;
	
	@FindBy(id="order_id_text")
	private WebElement orderid;
	
	@FindBy(id="search_hotel_id")
	private WebElement clkgo;
	
	@FindBy(xpath="(//input[@type='checkbox'][2]")
	private WebElement rdiobtn;
	
	@FindBy(xpath="//input[@type='button'][1]")
	private WebElement cancelbtn;
	
	public WebElement getSelectbookItinerary() {
		return selectbookItinerary;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getClkgo() {
		return clkgo;
	}

	public WebElement getRdiobtn() {
		return rdiobtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	public void cancelbooking(String orderidno ) {
	
		elementClick(getSelectbookItinerary());
        elementSendkey(getOrderid(), orderidno);
        elementClick(getClkgo());
        elementClick(getRdiobtn());
        elementClick(getCancelbtn());
        clickOkAlert();
//	String canceltext = getInsertedValue(getCancelationText());
	//Assert.assertEquals("The booking has been cancelled", canceltext);
	//System.out.println(canceltext);
}
	
	
	
	
	
	
}
