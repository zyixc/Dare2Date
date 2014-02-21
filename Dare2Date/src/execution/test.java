package execution;

import account.CreateAccount;
import account.Profile;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CreateAccount createAccount = new CreateAccount();
		
		String test = "test";
		String password = "1234";
		
		Profile visitor = createAccount.generateVisitorProfile();
		Profile subscriber = createAccount.generateSubscriberProfile(test, password);
		Profile vip = createAccount.generateVIPSubscriberProfile(test, password);

		visitor.viewProfile();
		subscriber.viewProfile();
		vip.viewProfile();
		
		visitor.viewPicture();
		
	}

}
