package gui;

import global.GeneratedUsers;
import global.GlobalVariables;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import account.VIPSubscriber;

import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;

import java.awt.Color;

public class CenterWindow extends JPanel {

	/**
	 * Create the panel.
	 */
	GUI referencedGUI;
	
	JPanel panelHome;
	JPanel panelSearch;
	JPanel panel;
	
	JLabel nameResult = new JLabel("Loading...");
	JLabel sexResult = new JLabel("Loading...");
	JLabel lookingforResult = new JLabel("Loading...");
	JLabel ageResult = new JLabel("Loading..."); 
	
	VIPSubscriber currentSubscriber;
	
	public CenterWindow(VIPSubscriber profile_init, GUI thisGUI) {
		setLayout(new CardLayout(0, 0));
		this.referencedGUI = thisGUI;
		
		panelHomeMethod();
		panelSearchMethod();
		panelMethod();
		setProfile(profile_init);
	}
	
	public void setProfile(VIPSubscriber temp_currentSubscriber){
		if(currentSubscriber == null){
			GlobalVariables mVariables = GlobalVariables.getInstance();
			temp_currentSubscriber = mVariables.getCreateAccount().
					generateVIPSubscriberProfile(mVariables.getCreateAccount().generateSubscriberProfile("test@gmail.com", "1234"));
			temp_currentSubscriber.setFirstName("Yoda");
			temp_currentSubscriber.setGender("Male");
			temp_currentSubscriber.setSexualPreference("Female");
		}
		
		this.currentSubscriber = temp_currentSubscriber;
		nameResult.setText(currentSubscriber.getFirstName()); //TODO 2 getfirstName() ?
		sexResult.setText(currentSubscriber.getGender());
		lookingforResult.setText(currentSubscriber.getSexualPreference());
		ageResult.setText("212"); //TODO has to be implemented ?
		panelHome.revalidate();
	}
	
	public void panelHomeMethod(){
		panelHome = new JPanel();
		add(panelHome, "name_30085133803200");
		panelHome.setLayout(new BorderLayout(0, 0));
		
		//Picture Loading + Resizing
		final BufferedImage image;
		try {
			image = ImageIO.read(new File("src/gui/yoda.jpg"));
			JPanel picturePanel = new JPanel(){
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.drawImage(image, 0, 0, 300, 300, null);
	            }
	        };
	        picturePanel.setPreferredSize(new Dimension(300,300));
	        panelHome.add(picturePanel, BorderLayout.WEST);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gbl_centerPanel = new GridBagLayout();
		gbl_centerPanel.columnWidths = new int[]{0, 0};
		gbl_centerPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_centerPanel.columnWeights = new double[]{1.0,1.0};
		gbl_centerPanel.rowWeights = new double[]{1.0,1.0,1.0,1.0,1.0};
		centerPanel.setLayout(gbl_centerPanel);
		
		//R
		JLabel name = new JLabel("Name");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_name = new GridBagConstraints();
		gbc_name.fill = GridBagConstraints.BOTH;
		gbc_name.insets = new Insets(0, 0, 5, 5);
		gbc_name.gridx = 0;
		gbc_name.gridy = 0;
		centerPanel.add(name, gbc_name);
		
		GridBagConstraints gbc_nameResult = new GridBagConstraints();
		gbc_nameResult.insets = new Insets(0, 0, 5, 0);
		gbc_nameResult.gridx = 1;
		gbc_nameResult.gridy = 0;
		centerPanel.add(nameResult, gbc_nameResult);
		
		//R
		JLabel sex = new JLabel("Sex");
		sex.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_sex = new GridBagConstraints();
		gbc_sex.fill = GridBagConstraints.BOTH;
		gbc_sex.insets = new Insets(0, 0, 5, 5);
		gbc_sex.gridx = 0;
		gbc_sex.gridy = 1;
		centerPanel.add(sex, gbc_sex);
		
		GridBagConstraints gbc_sexResult = new GridBagConstraints();
		gbc_sexResult.insets = new Insets(0, 0, 5, 0);
		gbc_sexResult.gridx = 1;
		gbc_sexResult.gridy = 1;
		centerPanel.add(sexResult, gbc_sexResult);
		
		//R
		JLabel lookingfor = new JLabel("LookingFor");
		lookingfor.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lookingfor = new GridBagConstraints();
		gbc_lookingfor.fill = GridBagConstraints.BOTH;
		gbc_lookingfor.insets = new Insets(0, 0, 5, 5);
		gbc_lookingfor.gridx = 0;
		gbc_lookingfor.gridy = 2;
		centerPanel.add(lookingfor, gbc_lookingfor);
		
		GridBagConstraints gbc_lookingforResult = new GridBagConstraints();
		gbc_lookingforResult.insets = new Insets(0, 0, 5, 0);
		gbc_lookingforResult.gridx = 1;
		gbc_lookingforResult.gridy = 2;
		centerPanel.add(lookingforResult, gbc_lookingforResult);
		
		//R
		JLabel age = new JLabel("Age");
		age.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_age = new GridBagConstraints();
		gbc_age.fill = GridBagConstraints.BOTH;
		gbc_age.insets = new Insets(0, 0, 5, 5);
		gbc_age.gridx = 0;
		gbc_age.gridy = 3;
		centerPanel.add(age, gbc_age);
		
		GridBagConstraints gbc_ageResult = new GridBagConstraints();
		gbc_ageResult.insets = new Insets(0, 0, 5, 0);
		gbc_ageResult.gridx = 1;
		gbc_ageResult.gridy = 3;
		centerPanel.add(ageResult, gbc_ageResult);
		
		//Message Button
		final JButton message = new JButton("Message");
		message.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 referencedGUI.newChatTab(currentSubscriber);
			}
		});
		
		GridBagConstraints gbc_message = new GridBagConstraints();
		gbc_message.gridwidth = 2;
		gbc_message.gridx = 0;
		gbc_message.gridy = 4;
		centerPanel.add(message, gbc_message);
		
		panelHome.add(centerPanel, BorderLayout.CENTER);
		
		Panel bottomPanel = new Panel();
		panelHome.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new GridLayout(0,1));
		
		JTextArea txtrHereIsThe = new JTextArea();
		txtrHereIsThe.setText("Here is the profile description loaded");
		txtrHereIsThe.setRows(5);
		txtrHereIsThe.setEditable(false);
		bottomPanel.add(txtrHereIsThe);
		
	}
	public void panelSearchMethod(){
		panelSearch = new JPanel();
		add(panelSearch, "name_30087000491658");
		GridBagLayout gbl_panelSearch = new GridBagLayout();
		gbl_panelSearch.columnWidths = new int[] {0};
		gbl_panelSearch.rowHeights = new int[]{0,0,0,0,0};
		gbl_panelSearch.columnWeights = new double[]{1.0};
		gbl_panelSearch.rowWeights = new double[]{1.0,1.0,1.0,1.0,1.0};
		panelSearch.setLayout(gbl_panelSearch);
		
		//Start user loading
		ArrayList<VIPSubscriber> vipList = GeneratedUsers.generateRandomVIP();
		int i = 0;
		for(final VIPSubscriber temp: vipList){
					
			JPanel panelResult = new JPanel();
			GridBagConstraints gbc_panelResult = new GridBagConstraints();
			gbc_panelResult.insets = new Insets(0, 0, 5, 0);
			gbc_panelResult.gridx = 0;
			gbc_panelResult.gridy = i;
			i++;
			gbc_panelResult.fill = GridBagConstraints.BOTH;
			panelSearch.add(panelResult, gbc_panelResult);
			
			GridBagLayout gbl_panelResult = new GridBagLayout();
			gbl_panelResult.columnWidths = new int[]{0, 0, 0};
			gbl_panelResult.rowHeights = new int[] {0};
			gbl_panelResult.columnWeights = new double[]{1.0,1.0,1.0};
			gbl_panelResult.rowWeights = new double[]{1.0};
			panelResult.setLayout(gbl_panelResult);
		
			final BufferedImage image;
			try {
				image = ImageIO.read(new File("src/gui/yoda.jpg"));
				JPanel picturePanel = new JPanel(){
					@Override
					protected void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(image, 0, 0, 100, 100, null);
					}
				};
				picturePanel.setPreferredSize(new Dimension(100,100));
				GridBagConstraints gbc_picturePanel = new GridBagConstraints();
				gbc_picturePanel.insets = new Insets(0, 0, 0, 5);
				gbc_picturePanel.gridx = 0;
				gbc_picturePanel.gridy = 0;
				panelResult.add(picturePanel, gbc_picturePanel);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			JLabel name = new JLabel(temp.getFirstName());
			GridBagConstraints gbc_name = new GridBagConstraints();
			gbc_name.insets = new Insets(0, 0, 0, 5);
			gbc_name.gridx = 1;
			gbc_name.gridy = 0;
			panelResult.add(name, gbc_name);
			JButton viewButton = new JButton("view");
			viewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setProfile(temp);
					panelHome.setVisible(true);
					panelSearch.setVisible(false);
					panel.setVisible(false);
				}
			});
			GridBagConstraints gbc_viewButton = new GridBagConstraints();
			gbc_viewButton.gridx = 2;
			gbc_viewButton.gridy = 0;
			panelResult.add(viewButton, gbc_viewButton);
		}
	}
	public void panelMethod(){
		panel = new JPanel();
		add(panel, "name_30088251608510");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0};
		gbl_panel.rowHeights = new int[]{0};
		gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

	}
}
