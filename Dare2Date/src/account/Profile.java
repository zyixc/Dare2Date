package account;

import matchmaking.MatchmakingOptions;
import actions.UserActions;

public abstract class Profile {
	
	//Interfaces
	UserActions userActions;
	
	
	//Constructor
	public Profile(){
	}
	
	public abstract void displayProfile();
	
	//Call action available for the user
	public void performActions(){
		userActions.perform();
	}
	
	//Call matchmaking available for the user
	public void matchMakingService(MatchmakingOptions matchMakingOption, Profile profile){
		matchMakingOption.match(profile);
	}
	
}
