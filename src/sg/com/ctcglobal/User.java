package sg.com.ctcglobal;

import java.util.List;

public class User {
	
	private String username;
	private List<Timesheet> timesheetList;
	
	public User(String username) {
		this.username = username;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Timesheet> getTimesheetList() {
		return timesheetList;
	}
	public void setTimesheetList(List<Timesheet> timesheetList) {
		this.timesheetList = timesheetList;
	}
	
	

}
