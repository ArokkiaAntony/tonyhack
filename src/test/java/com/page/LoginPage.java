package com.page;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	} 

	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	@FindBy(xpath="//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]" )
		private WebElement Loginerrormsg;
	public WebElement getLoginerrormsg() {
			return Loginerrormsg;
		}
	
	public void login(String username,String password) {
		elementSendkey(getTxtusername(), username);
		elementSendkey(getTxtpassword(), password);
        elementClick(getBtnlogin()); 
	}
	public void loginWithEnterKey(String username,String password) throws AWTException {
		elementSendkey(getTxtusername(), username);
		elementSendkey(getTxtpassword(), password);
     	enter();
		

	}
}
