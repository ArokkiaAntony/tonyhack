package com.page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
public SearchHotelPage() {
	 PageFactory.initElements(driver, this);
}
@FindBy(id="username_show")
private WebElement hellouser;
@FindBy(id="location")	 
private WebElement dDnlocation;

@FindBy(id="hotels")	 	
private WebElement dDnhotel;
@FindBy(id="room_type")	 
private WebElement dDnroomtype;
@FindBy(id="room_nos")	 
private WebElement noroomtype;
@FindBy(id="datepick_in")	 
private WebElement keysdatein;
@FindBy(id="datepick_out")	 
private WebElement keysdateout;
@FindBy(id="adult_room")	 
private WebElement dDnadultsperroom;
@FindBy(id="child_room")	 
private WebElement dDnchildroom;
@FindBy(id="Submit")	 
private WebElement btnclick;

public WebElement getHellouser() {
return hellouser;
}
public WebElement getdDnlocation() {
return dDnlocation;
}
public WebElement getdDnhotel() {
return dDnhotel;
}
public WebElement getdDnroomtype() {
return dDnroomtype;
}
public WebElement getNoroomtype() {
return noroomtype;
}
public WebElement getKeysdatein() {
return keysdatein;
}
public WebElement getKeysdateout() {
return keysdateout;
}
public WebElement getdDnadultsperroom() {
return dDnadultsperroom;
}
public WebElement getdDnchildroom() {
return dDnchildroom;
}
public WebElement getBtnclick() {
return btnclick;
}
public void searchhotel(String locatin,String hotels,String roomtype,String norooms,String chkin,String chkout,String adults,String child) {
String usersuccess = getInsertedValue(getHellouser());
Assert.assertEquals("verify user",  "Hello arvinarvin!", usersuccess);
System.out.println(usersuccess);
selectByText(getdDnlocation(), locatin);

selectByText(getdDnhotel(), hotels);
selectByText(getdDnroomtype(), roomtype);
selectByText(getNoroomtype(), norooms);
elementSendkey(getKeysdatein(), chkin);
elementSendkey(getKeysdateout(), chkout);
selectByText(getdDnadultsperroom(), adults);
selectByText(getdDnchildroom(), child);
elementClick(getBtnclick());


}




}
