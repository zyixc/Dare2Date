package account;

public class CreateAccount {

	//Constructor
	public CreateAccount(){
	}
	
	//Checks credit card credentials
	public void checkCreditCard(){
	}
	
	//Upgrades account from visitor to subscriber or from subscriber to vip
	public Profile upgradeProfile(Profile profile){
		Profile upgradedProfile = null;
		return upgradedProfile;
	}
	
	//Generates a profile based on choice
	public Profile generateVisitorProfile(){
		
		Profile username1 = null;
		username1 = new Visitor();
		
		return username1;
	}

	public Profile generateSubscriberProfile(String username ,String password){
		Profile username1 = null;
		username1 = new Subscriber(username, password);
		
		return username1;
	}
	
	public Profile generateVIPSubscriberProfile(String username ,String password){
		Profile username1 = null;
		username1 = new VIPSubscriber(username, password);
		
		return username1;
	}
}
