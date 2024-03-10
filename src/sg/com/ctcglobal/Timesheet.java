package sg.com.ctcglobal;

import java.util.Date;

public class Timesheet {
	
	private Date checkIn;
	private Date checkOut;
	private String user;
	
	public Timesheet(Date date, Date date2) {
		checkIn = date;
		checkOut = date2;
	}
	
	public Timesheet() {
		// TODO Auto-generated constructor stub
	}

	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


}
