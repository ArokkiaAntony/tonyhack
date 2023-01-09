package com.page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
		 @FindBy(xpath="//td[@class='login_title']")
		 private WebElement texthtslct;  
		 @FindBy(id="radiobutton_0")
		 private WebElement radiobn;
		 @FindBy(id="continue")
		 private WebElement cntbn;
		 
		 
		 
		public WebElement getTexthtslct() {
			return texthtslct;
		}
		public WebElement getRadiobn() {
			return radiobn;
		}
		public WebElement getCntbn() {
			return cntbn;
		}
		public void selecthtl() {
	 String actionselecthotel = getText(getTexthtslct());
	 Assert.assertEquals("verify", "Select Hotel", actionselecthotel);
	 System.out.println(actionselecthotel);
	 elementClick(getRadiobn());
	 elementClick(getCntbn());
		
	 
		}
}

