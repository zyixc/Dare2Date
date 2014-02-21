package account;


public class VIPSubscriber extends Subscriber {

	public VIPSubscriber(String email, String password){
		super(email, password);
	}
	
	@Override
	public void viewProfile() {
		System.out.println("I am a VIP");
		
	}
	
	//Set update preferences
	public void setUpdatePreferences(){
		
	}
	
	//Set preference keywords
	public void setPreferenceKeywords(){
		
	}
	
	//Receive update on profiles
	public void receiveUpdates(){
		
	}
	
}
