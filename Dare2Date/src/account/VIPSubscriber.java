package account;

import java.util.ArrayList;
import java.util.Calendar;

import chat.Message;


public class VIPSubscriber extends Subscriber {

	protected String firstName;
	protected String lastName;
	protected Calendar dateOfBirth;
	protected String gender;
	protected String sexualPreference;
	protected String city;
	protected String education;
	protected ArrayList<String> interests;
	protected String hobies;
	protected String description;
	protected ArrayList<Message> inbox;
	
	public VIPSubscriber(Subscriber profile){
		super(profile.email, profile.password);
		this.firstName = profile.firstName;
		this.lastName = profile.lastName;
		this.dateOfBirth = profile.dateOfBirth;
		this.gender = profile.gender;
		this.sexualPreference = profile.sexualPreference;
		this.city = profile.city;
		this.education = profile.education;
		this.interests = profile.interests;
		this.hobies = profile.hobies;
		this.description = profile.description;
		this.inbox = profile.inbox;
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
