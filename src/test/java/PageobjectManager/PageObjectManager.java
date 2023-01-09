package PageobjectManager;


import com.page.BookHotelPage;
import com.page.BookingConfirmationPage;
import com.page.CancelBookingPage;
import com.page.LoginPage;
import com.page.SearchHotelPage;
import com.page.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginpage;
	private SearchHotelPage searchHotelpage;
	private SelectHotelPage selectHotelpage;
	private BookHotelPage bookHotelpage;
	private BookingConfirmationPage bookingConfirmationpage;
	private CancelBookingPage cancelBookingpage;
	public LoginPage getLoginpage() {
		return(loginpage==null)?loginpage=new LoginPage(): loginpage;
	}
	public SearchHotelPage getSearchHotelpage() {
		return(searchHotelpage==null)?searchHotelpage=new SearchHotelPage(): searchHotelpage;
	}
	public SelectHotelPage getSelectHotelpage() {
		return(selectHotelpage==null)?selectHotelpage=new SelectHotelPage(): selectHotelpage;
	}
	public BookHotelPage getBookHotelpage() {
		return(bookHotelpage==null)?bookHotelpage=new BookHotelPage(): bookHotelpage;
	}
	public BookingConfirmationPage getBookingConfirmationpage() {
		return(bookingConfirmationpage==null)?bookingConfirmationpage=new BookingConfirmationPage(): bookingConfirmationpage;
	}
	public CancelBookingPage getCancelBookingpage() {
		return(cancelBookingpage==null)?cancelBookingpage=new CancelBookingPage(): cancelBookingpage;
	}
	
	

}
