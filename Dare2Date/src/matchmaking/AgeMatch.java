package matchmaking;

import account.Profile;
import account.Visitor;

public class AgeMatch implements MatchmakingOptions {

	@Override
	public void match(Profile profile) {
		// TODO Auto-generated method stub
		if(profile instanceof Visitor){
			System.out.println("You are not allowed to use the matchmaking system! Please subscribe!");
		}
		else{
			//To implement searching after creating static users
		}
		
	}

}
