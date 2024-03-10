package sg.com.ctcglobal;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class J2EEExamService {
	
	private Users users;
	
	@Autowired
	public J2EEExamService(Users users) {
		this.users = users;
	}
	
	public void doCheckIn(User user, Date timing) {
		List<User> userList = users.getUsersList();
		if (userList.contains(user)) {
			// create new timesheet which probably does not exist
			Timesheet timesheet = new Timesheet();
			timesheet.setCheckIn(timing);
			
			List<Timesheet> list = user.getTimesheetList();
			list.add(timesheet);
			user.setTimesheetList(list);
		}
	}
	
	public void doCheckOut(User user, Date timing) {
		// get the latest Timesheet object from User based on the date
		// amend that Timesheet object with the new checkout timing
		
	}

}
