package sg.com.ctcglobal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Timesheets {
	
	private List<Timesheets> timesheets = new ArrayList<>();

	public Timesheets() {

	}
	
	public List<Timesheets> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(List<Timesheets> timesheets) {
		this.timesheets = timesheets;
	}

	
	
}
