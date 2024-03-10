package sg.com.ctcglobal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Users {
	List<User> usersList = new ArrayList<>();
	User currentUser;

	public Users() {
		User worker1 = new User("worker1");
		User teamlead = new User("teamlead");
		
		usersList.add(worker1);
		usersList.add(teamlead);
	}
	
	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}


}
