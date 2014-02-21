package account;

import java.util.ArrayList;
import java.util.Calendar;

import chat.Message;

public class Subscriber extends Profile {

	protected String fristName;
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
	
	public Subscriber(String email, String password){
		this.email = email;
		this.password = password;
	}
	

	public String getFristName() {
		return fristName;
	}


	public void setFristName(String fristName) {
		this.fristName = fristName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Calendar dateOfBirth) {
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


	public void addInterest(String interest) {
		interests.add(interest);
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


	public void addMessage(Message message) {
		inbox.add(message);
	}


	@Override
	public void viewProfile() {
		System.out.println("I am a subscriber");
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPicture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewPicture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateText() {
		// TODO Auto-generated method stub
		
	}
	
	

}
