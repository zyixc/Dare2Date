package global;

import java.util.ArrayList;

import matchmaking.MatchmakingService;
import account.CreateAccount;
import account.Profile;

public class GlobalVariables {

	private static GlobalVariables mInstance= null;
	private CreateAccount createAccount;
	private MatchmakingService matchmakingService;
	private Profile currentUser;
	private ArrayList<Profile> userList;
	
	public GlobalVariables(){
		createAccount = new CreateAccount();
		matchmakingService = new MatchmakingService();
		currentUser = null;
		userList = generateUsers();
	}
	
	public static synchronized GlobalVariables getInstance(){
    	if(null == mInstance){
    		mInstance = new GlobalVariables();
    	}
    	return mInstance;
    }
	
	public Profile getCurrentUser() {
		return currentUser;
	}
	
	public void setCurrentUser(Profile currentUser){
		this.currentUser = currentUser;
	}

	public ArrayList<Profile> getUserList() {
		return userList;
	}

	public CreateAccount getCreateAccount() {
		return createAccount;
	}

	public MatchmakingService getMatchmakingService() {
		return matchmakingService;
	}

	public ArrayList<Profile> generateUsers(){
		ArrayList<Profile> userList = new ArrayList<Profile>();
		
		return userList;
	}
	
	public void addUserToList(Profile profile){
		userList.add(profile);
	}
	
}
