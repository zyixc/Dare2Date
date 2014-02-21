package account;


public abstract class Profile {
	
	protected String email;
	protected String password;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//View Profile
	public abstract void viewProfile();
	
	//Search profile
	public abstract void searchProfile();
	
	//Send message
	public abstract void sendMessage();
	
	//Receive message
	public abstract void receiveMessage();
	
	//Chat
	public abstract void chat();
	
	//Add Picture
	public abstract void addPicture();
	
	//View Picture
	public abstract void viewPicture();
	
	//Update profile text
	public abstract void updateText();	
	
}
