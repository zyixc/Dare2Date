package execution;

import java.util.ArrayList;

import global.GlobalVariables;
import account.Profile;


public class test {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		GlobalVariables mVariables = GlobalVariables.getInstance();
		
		Profile visitor = mVariables.getCreateAccount().generateVisitorProfile();
		
		mVariables.setCurrentUser(visitor);
		
		visitor.viewProfile();
		
		visitor = mVariables.getCreateAccount().upgradeProfile(visitor, "gigi", "1234");

		visitor.viewProfile();
		mVariables.addUserToList(visitor);
		
		visitor = mVariables.getCreateAccount().upgradeProfile(visitor, "gigi", "1234");
		
		visitor.viewProfile();
		
		ArrayList<Profile> userList = mVariables.getUserList();
		
		userList.get(0).viewProfile();
	}
	


}
