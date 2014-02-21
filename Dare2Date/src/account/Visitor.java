package account;


public class Visitor extends Profile {

	public Visitor(){
	}

	@Override
	public void viewProfile() {
		System.out.println("I am a visitor");
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage() {
		System.out.println("You are not allowed to do this action! Please Subscribe!");
		
	}

	@Override
	public void receiveMessage() {
		System.out.println("You are not allowed to do this action! Please Subscribe!");
		
	}

	@Override
	public void chat() {
		System.out.println("You are not allowed to do this action! Please Subscribe!");
		
	}

	@Override
	public void addPicture() {
		System.out.println("You are not allowed to do this action! Please Subscribe!");
		
	}

	@Override
	public void viewPicture() {
		System.out.println("You are not allowed to do this action! Please Subscribe!");
		
	}

	@Override
	public void updateText() {
		System.out.println("You are not allowed to do this action! Please Subscribe!");
		
	}
	
	

}
