package matchmaking;

import account.Profile;

public class MatchmakingService {

	private MatchmakingOptions matchmaking;
	
	public MatchmakingService(){
	}
	
	public void searchByAge(Profile profile){	
		matchmaking = new AgeMatch();	
		matchmaking.match(profile);	
	}
	
	public void searchByLoctaion(Profile profile){
		matchmaking = new LocationMatch();
		matchmaking.match(profile);
	}
	
	public void searchBySelection(Profile profile){
		matchmaking = new SelectionMatch();
		matchmaking.match(profile);
	}
	
	public void searchByFullMatch(Profile profile){
		matchmaking = new FullMatch();
		matchmaking.match(profile);
	}
	
}
