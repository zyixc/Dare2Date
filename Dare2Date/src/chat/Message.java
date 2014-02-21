package chat;

import java.util.Calendar;

public class Message {

	private String sender;
	private String receiver;
	private Calendar dateOfMessage;
	private String message;
	
	public Message(String sender, String receiver, Calendar dateOfMessage, String message){
		this.sender = sender;
		this.receiver = receiver;
		this.dateOfMessage = dateOfMessage;
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Calendar getDateOfMessage() {
		return dateOfMessage;
	}

	public void setDateOfMessage(Calendar dateOfMessage) {
		this.dateOfMessage = dateOfMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
