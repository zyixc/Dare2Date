package account;

public class CreateAccount {

	//Constructor
	public CreateAccount(){
	}
	
	//Checks credit card credentials
	public boolean checkCreditCard(int cardNumber, String expireDate, int ccv){
		
		if(cardNumber != 0 && expireDate != null && ccv != 0){
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	//Upgrades account from visitor to subscriber or from subscriber to vip
	public Profile upgradeProfile(Profile profile, String email, String password){
		Profile upgradedProfile = null;
		
		if(profile instanceof Visitor){
			upgradedProfile = generateSubscriberProfile(email, password);
		}
		else if(profile instanceof Subscriber){
			upgradedProfile = generateVIPSubscriberProfile((Subscriber)profile);
		}
		
		return upgradedProfile;
		
	}
	
	//Generates a profile based on choice
	public Visitor generateVisitorProfile(){
		
		Visitor email1 = null;
		email1 = new Visitor();
		
		return email1;
	}

	public Subscriber generateSubscriberProfile(String email ,String password){
		Subscriber email1 = null;
		email1 = new Subscriber(email, password);
		
		return email1;
	}
	
	public VIPSubscriber generateVIPSubscriberProfile(Subscriber profile){
		VIPSubscriber email1 = null;
		email1 = new VIPSubscriber(profile);
		
		return email1;
	}
}
