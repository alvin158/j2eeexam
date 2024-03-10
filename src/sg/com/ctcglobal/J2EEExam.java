package sg.com.ctcglobal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class J2EEExam {
	
	@Autowired
	private J2EEExamService service;
	
	@Autowired
	private Users users;
	
	@Autowired
	private Timesheets timesheets;

	@RequestMapping("/about")
	public ModelAndView about() {
		String message = "<br><div style='text-align:center;'>" + "";
		return new ModelAndView("about", "message", message);
	}

	@RequestMapping("/index")
	public ModelAndView index(@RequestParam(name = "username", required = false) String username) {
		System.out.println("index");
		User loginUser = new User("username");
		
		users.setCurrentUser(loginUser);
		
		if (loginUser.getUsername().equals("teamlead")) {
			return new ModelAndView("redirect:/dashboard.jsp");
		}
		
		return new ModelAndView("redirect:/index.jsp");
		
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("login");
		return new ModelAndView("login", "message", null);
	}
	
	@RequestMapping("/checkin")
	public ModelAndView checkin() {
		System.out.println("checkin");
		
		User currentUser = users.getCurrentUser();
		
		service.doCheckIn(currentUser, new Date());
		return new ModelAndView("redirect:/index.jsp");
	}
	
	@RequestMapping("/checkout")
	public ModelAndView checkout() {
		System.out.println("checkout");
		
		User currentUser = users.getCurrentUser();
		
		service.doCheckOut(currentUser, new Date());
		return new ModelAndView("redirect:/index.jsp");
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView displayTimesheets(Model model) {
		// assume 1 user
	    User user = new User("worker2");
	    Timesheet day1 = new Timesheet(new Date(), new Date());
	    Timesheet day2 = new Timesheet(new Date(), new Date());
	    List<Timesheet> timesheetList = new ArrayList<>();
	    timesheetList.add(day1);
	    timesheetList.add(day2);
	    model.addAttribute("timesheetList", timesheetList);
	    return new ModelAndView("redirect:/dashboard.jsp");
	}
	

}
