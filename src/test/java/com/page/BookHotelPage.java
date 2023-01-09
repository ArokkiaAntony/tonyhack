package com.page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		
		 PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="(//td[@class='login_title'])[2]")
		private WebElement txtbookhtl;
		@FindBy(id="first_name")
		private WebElement frstname;
		
		@FindBy(id="last_name")
		private WebElement lstname;
		
		@FindBy(id="address")
		private WebElement address;
		
		@FindBy(id="cc_num")
		private WebElement crdnum;
		
		@FindBy(id="cc_type")
		private WebElement crdtype;
		
		@FindBy(id="cc_exp_month")
		private WebElement expmonth;
		
		@FindBy(id="cc_exp_year")
		private WebElement expyear;
		
		@FindBy(id="cc_cvv")
		private WebElement cvvnum;
		
		@FindBy(id="book_now")
		private WebElement booknow;
		
		public WebElement getTxtbookhtl() {
			return txtbookhtl;
		}

		public WebElement getFrstname() {
			return frstname;
		}

		public WebElement getLstname() {
			return lstname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCrdnum() {
			return crdnum;
		}

		public WebElement getCrdtype() {
			return crdtype;
		}

		public WebElement getExpmonth() {
			return expmonth;
		}

		public WebElement getExpyear() {
			return expyear;
		}

		public WebElement getCvvnum() {
			return cvvnum;
		}

		public WebElement getBooknow() {
			return booknow;
		}
		
		

	public void Bookhotel(String firstname,String lastname,String billaddress,String crdtno,String crdttype,String expmonth,String expyear,String cvv) {

	String actionbookhtl = getText(getTxtbookhtl());
	Assert.assertEquals("verify", "Book A Hotel",actionbookhtl );
	System.out.println(actionbookhtl);
	elementSendkey(getFrstname(), firstname);
	elementSendkey(getLstname(), lastname);
	elementSendkey(getAddress(), billaddress);
	elementSendkey(getCrdnum(), crdtno);
	elementSendkey(getCrdtype(), crdttype);
	selectByText(getExpmonth(), expmonth);
	selectByText(getExpyear(), expyear);
	elementSendkey(getCvvnum(), cvv);
	elementClick(getBooknow());

	}

}