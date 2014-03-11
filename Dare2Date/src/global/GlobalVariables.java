package global;

import java.util.ArrayList;

import matchmaking.MatchmakingService;
import account.CreateAccount;
import account.Profile;
import account.Subscriber;
import account.VIPSubscriber;

public class GlobalVariables {

	private static GlobalVariables mInstance= null;
	private CreateAccount createAccount;
	private MatchmakingService matchmakingService;
	private Profile currentUser;
	private ArrayList<Subscriber> subscriberList;
	private ArrayList<VIPSubscriber> vipList;
	
	public GlobalVariables(){
		createAccount = new CreateAccount();
		matchmakingService = new MatchmakingService();
		currentUser = null;
		subscriberList = generateSubscriberList();
		vipList = generateVIPList();
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

	public ArrayList<Subscriber> getSubcriberList() {
		return subscriberList;
	}
	
	public ArrayList<VIPSubscriber> getVipList() {
		return vipList;
	}

	public void setVipList(ArrayList<VIPSubscriber> vipList) {
		this.vipList = vipList;
	}

	public CreateAccount getCreateAccount() {
		return createAccount;
	}

	public MatchmakingService getMatchmakingService() {
		return matchmakingService;
	}

	public ArrayList<Subscriber> generateSubscriberList(){
		
		ArrayList<Subscriber> userListGenerated = GeneratedUsers.generateRandomSubscribers();
		
		return userListGenerated;
	}
	
	public ArrayList<VIPSubscriber> generateVIPList(){
		ArrayList<VIPSubscriber> userListGenerated = GeneratedUsers.generateRandomVIP();
		
		
		return userListGenerated;
	}
	
	public void addSubscriberToList(VIPSubscriber profile){
		subscriberList.add(profile);
	}
	
	public void addVIPToList(VIPSubscriber profile){
		vipList.add(profile);
	}
	
}
