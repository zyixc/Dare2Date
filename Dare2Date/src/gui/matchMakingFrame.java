package gui;

import javax.swing.JInternalFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JList;

public class matchMakingFrame extends JInternalFrame {

	enum matchMakingType{
		AGEMATCH("Age Match"),
		FULLMATCH("Full Match"),
		LOCATIONMATCH("Location Match"),
		SELECTIONMATCH("Selection Match");
		
		private String description;
		
		matchMakingType(String typeDescription){
			this.description = typeDescription;
		}
		
		public String getString(){
			return description;
		}
	}
	
	private JList<String> list = new JList<String>();
	
	/**
	 * Create the frame.
	 */
	public matchMakingFrame(matchMakingType thisType) {
		setTitle(thisType.getString());
		setBounds(100, 100, 400, 250);
		
		JButton btnSubmit = new JButton("Submit");
		getContentPane().add(btnSubmit, BorderLayout.SOUTH);
		
		getContentPane().add(list, BorderLayout.CENTER);
		
		switch(thisType){
			case AGEMATCH: ageMatch(); break;
			case FULLMATCH: fullMatch(); break;
			case LOCATIONMATCH: locationMatch(); break;
			case SELECTIONMATCH: selectionMatch(); break;
			default: break;			
		}
	}

	private void selectionMatch() {
		
		
	}

	private void locationMatch() {
		//TODO
		
	}

	private void fullMatch() {
		
		
	}

	private void ageMatch() {
		
		
	}
	
	

}
