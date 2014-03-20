package gui;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import account.Subscriber;
import global.GlobalVariables;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class CenterWindow extends JPanel {

	/**
	 * Create the panel.
	 */
	JPanel panelHome;
	JPanel panelSearch;
	JPanel panel;
	
	JLabel lblNewLabel_3 = new JLabel("test");
	JLabel lblNewLabel_4 = new JLabel("etset");
	
	public CenterWindow() {
		setLayout(new CardLayout(0, 0));
		
		initInterface();
		panelHomeMethod();
		panelSearchMethod();
		panelMethod();		
	}
	
	public void initInterface(){
		GlobalVariables mVariables = GlobalVariables.getInstance();
		Subscriber visitor = mVariables.getCreateAccount().generateSubscriberProfile("test@gmail.com", "1234");
		mVariables.setCurrentUser(visitor);
		visitor.setfirstName("This is the firstname");
		
		lblNewLabel_3.setText(visitor.getEmail());
		lblNewLabel_4.setText(visitor.getfirstName());
	}
	
	public void panelHomeMethod(){
		panelHome = new JPanel();
		add(panelHome, "name_30085133803200");
		GridBagLayout gbl_panelHome = new GridBagLayout();
		gbl_panelHome.columnWidths = new int[]{0,0,0,0,0,0,0,0};
		gbl_panelHome.rowHeights = new int[]{0,0,0,0,0,0,0,0};
		gbl_panelHome.columnWeights = new double[]{1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
		gbl_panelHome.rowWeights = new double[]{1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
		panelHome.setLayout(gbl_panelHome);
		
		JLabel lblNewLabel = new JLabel("Panel Home");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 8;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelHome.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 1;
		panelHome.add(lblUsername, gbc_lblUsername);
		
		
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 1;
		panelHome.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panelHome.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 2;
		panelHome.add(lblNewLabel_4, gbc_lblNewLabel_4);
	}
	public void panelSearchMethod(){
		panelSearch = new JPanel();
		add(panelSearch, "name_30087000491658");
		GridBagLayout gbl_panelSearch = new GridBagLayout();
		gbl_panelSearch.columnWidths = new int[]{0,0,0,0,0,0,0,0};
		gbl_panelSearch.rowHeights = new int[]{0,0,0,0,0,0,0,0};
		gbl_panelSearch.columnWeights = new double[]{1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
		gbl_panelSearch.rowWeights = new double[]{1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
		panelSearch.setLayout(gbl_panelSearch);
		
		JLabel lblNewLabel_1 = new JLabel("Panel Search");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panelSearch.add(lblNewLabel_1, gbc_lblNewLabel_1);
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
