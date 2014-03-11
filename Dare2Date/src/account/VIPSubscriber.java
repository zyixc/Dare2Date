package account;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import chat.Message;


public class VIPSubscriber extends Subscriber {

	protected String firstName;
	protected String lastName;
	protected GregorianCalendar dateOfBirth;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSexualPreference() {
		return sexualPreference;
	}

	public void setSexualPreference(String sexualPreference) {
		this.sexualPreference = sexualPreference;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public ArrayList<String> getInterests() {
		return interests;
	}

	public void setInterests(ArrayList<String> interests) {
		this.interests = interests;
	}

	public String getHobies() {
		return hobies;
	}

	public void setHobies(String hobies) {
		this.hobies = hobies;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Message> getInbox() {
		return inbox;
	}

	public void setInbox(ArrayList<Message> inbox) {
		this.inbox = inbox;
	}
	
	
	
}
