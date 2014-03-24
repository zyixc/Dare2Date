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
import java.awt.Font;

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
	
	ArrayList<VIPSubscriber> vipList = GeneratedUsers.generateRandomVIP();
	
	public CenterWindow(VIPSubscriber profile_init, GUI thisGUI) {
		setLayout(new CardLayout(0, 0));
		this.referencedGUI = thisGUI;
		this.currentSubscriber = profile_init;
		
		panelHomeMethod();
		panelSearchMethod();
		panelMethod();
		setProfile(profile_init);
	}
	
	public void setProfile(VIPSubscriber temp_currentSubscriber){	
		this.currentSubscriber = temp_currentSubscriber;
		nameResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameResult.setText(currentSubscriber.getFirstName()); //TODO 2 getfirstName() ?
		sexResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sexResult.setText(currentSubscriber.getGender());
		lookingforResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lookingforResult.setText(currentSubscriber.getSexualPreference());
		ageResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
			if(currentSubscriber.getFirstName().equals("Darth-Vader")){
				image = ImageIO.read(new File("src/gui/darthvader.jpg"));
			}else{
				image = ImageIO.read(new File("src/gui/yoda.jpg"));
			}
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
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		sex.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		lookingfor.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		age.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		
		int i = 0;
		for(final VIPSubscriber temp: vipList){
					
			JPanel panelResult = new JPanel();
			GridBagConstraints gbc_panelResult = new GridBagConstraints();
			gbc_panelResult.insets = new Insets(0, 0, 5, 0);
			gbc_panelResult.gridx = 0;
			gbc_panelResult.gridy = i;
			i++;
			if(i>5){ break; }
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
				if(currentSubscriber.getFirstName().equals("Darth-Vader")){
					image = ImageIO.read(new File("src/gui/darthvader.jpg"));
				}else{
					image = ImageIO.read(new File("src/gui/yoda.jpg"));
				}
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
			name.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		gbl_panel.columnWidths = new int[]{0,0,0,0};
		gbl_panel.rowHeights = new int[]{0,0,0,0,0,0,0,0};
		gbl_panel.columnWeights = new double[]{1,1,1,1};
		gbl_panel.rowWeights = new double[]{1,1,1,1,1,1,1,1};
		panel.setLayout(gbl_panel);
		
		JButton btnLoadProfile1 = new JButton("LoadProfile1");
		btnLoadProfile1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VIPSubscriber temp = referencedGUI.TestProfile(1);
				referencedGUI.setProfile(temp);
				setProfile(temp);
			}
		});
		GridBagConstraints gbc_btnLoadProfile1 = new GridBagConstraints();
		gbc_btnLoadProfile1.gridwidth = 2;
		gbc_btnLoadProfile1.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoadProfile1.gridx = 1;
		gbc_btnLoadProfile1.gridy = 1;
		panel.add(btnLoadProfile1, gbc_btnLoadProfile1);
		
		JButton btnStartProfile1 = new JButton("Start Chat With Profile 1");
		btnStartProfile1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				referencedGUI.windowChat.newTab(referencedGUI.TestProfile(1));
			}
		});
		GridBagConstraints gbc_btnStartProfile1 = new GridBagConstraints();
		gbc_btnStartProfile1.gridwidth = 2;
		gbc_btnStartProfile1.insets = new Insets(0, 0, 5, 5);
		gbc_btnStartProfile1.gridx = 1;
		gbc_btnStartProfile1.gridy = 2;
		panel.add(btnStartProfile1, gbc_btnStartProfile1);
		
		JButton btnLoadProfile2 = new JButton("LoadProfile2");
		btnLoadProfile2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VIPSubscriber temp = referencedGUI.TestProfile(2);
				referencedGUI.setProfile(temp);
				setProfile(temp);
				panelHome.removeAll();
				panelHomeMethod();
			}
		});
		GridBagConstraints gbc_btnLoadProfile2 = new GridBagConstraints();
		gbc_btnLoadProfile2.gridwidth = 2;
		gbc_btnLoadProfile2.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoadProfile2.gridx = 1;
		gbc_btnLoadProfile2.gridy = 3;
		panel.add(btnLoadProfile2, gbc_btnLoadProfile2);
		
		JButton btnStartProfile2 = new JButton("Start Chat With Profile 2");
		btnStartProfile2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				referencedGUI.windowChat.newTab(referencedGUI.TestProfile(2));
				referencedGUI.windowChat.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnStartProfile2 = new GridBagConstraints();
		gbc_btnStartProfile2.gridwidth = 2;
		gbc_btnStartProfile2.insets = new Insets(0, 0, 5, 5);
		gbc_btnStartProfile2.gridx = 1;
		gbc_btnStartProfile2.gridy = 4;
		panel.add(btnStartProfile2, gbc_btnStartProfile2);
		
		JButton btnNewButton = new JButton("StartChatServer //becarefull");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//startChatServer
			}
		});
		btnNewButton.setEnabled(false);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		panel.add(btnNewButton, gbc_btnNewButton);

	}
}
