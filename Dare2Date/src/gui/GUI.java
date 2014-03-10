package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GUI {
	
	private JFrame frmDaredate;
	private CardLayout cardlayout = new CardLayout();
	private JPanel SignInPanel = new JPanel();
	private JPanel StartPanel = new JPanel();
	private JPanel SignUpPanel = new JPanel();
	private JTextField textField_Email;
	private JPasswordField passwordField_Password;
	private JPasswordField passwordField_Repeat_Password;
	private JTextField textField_Credit_Card_Number;
	private JTextField textField_Credit_Card_Security_Code;
	private JLabel label_Credit_Card_Secutiry_Code;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmDaredate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmDaredate = new JFrame();
		frmDaredate.setTitle("Dare2Date");
		frmDaredate.setBounds(100, 100, 800, 650);
		frmDaredate.setResizable(false);
		frmDaredate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDaredate.getContentPane().setLayout(cardlayout);
		
		
		
		//StartPanel
		//
		frmDaredate.getContentPane().add(StartPanel, "name_9289222911540");
		GridBagLayout gbl_StartPanel = new GridBagLayout();
		gbl_StartPanel.columnWidths = new int[]{300, 200, 300};
		gbl_StartPanel.rowHeights = new int[]{200, 100, 100, 100, 100};
		gbl_StartPanel.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_StartPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		StartPanel.setLayout(gbl_StartPanel);
		JLabel lblNewLabel = new JLabel("Dare2Date");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 120));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		StartPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignInPanel.setVisible(true);
				StartPanel.setVisible(false);
			}
		});
		btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 70));
		GridBagConstraints gbc_btnSignIn = new GridBagConstraints();
		gbc_btnSignIn.anchor = GridBagConstraints.WEST;
		gbc_btnSignIn.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSignIn.insets = new Insets(0, 0, 5, 5);
		gbc_btnSignIn.gridx = 1;
		gbc_btnSignIn.gridy = 1;
		StartPanel.add(btnSignIn, gbc_btnSignIn);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUpPanel.setVisible(true);
				StartPanel.setVisible(false);
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 70));
		GridBagConstraints gbc_btnSignUp = new GridBagConstraints();
		gbc_btnSignUp.anchor = GridBagConstraints.WEST;
		gbc_btnSignUp.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSignUp.insets = new Insets(0, 0, 5, 5);
		gbc_btnSignUp.gridx = 1;
		gbc_btnSignUp.gridy = 2;
		StartPanel.add(btnSignUp, gbc_btnSignUp);
		
		JButton btnVisitorView = new JButton("Visitor View");
		btnVisitorView.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnVisitorView = new GridBagConstraints();
		gbc_btnVisitorView.insets = new Insets(0, 0, 5, 5);
		gbc_btnVisitorView.anchor = GridBagConstraints.NORTH;
		gbc_btnVisitorView.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVisitorView.gridx = 1;
		gbc_btnVisitorView.gridy = 3;
		StartPanel.add(btnVisitorView, gbc_btnVisitorView);
		
	
		
		//SignInPanel
		//
		frmDaredate.getContentPane().add(SignInPanel, "name_9294675641625");
		frmDaredate.setBackground(new Color(100, 149, 237));
		GridBagLayout gbl_SignInPanel = new GridBagLayout();
		gbl_SignInPanel.columnWidths = new int[]{100, 100, 100, 100, 100, 100, 100, 100};
		gbl_SignInPanel.rowHeights = new int[]{65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65};
		gbl_SignInPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_SignInPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		SignInPanel.setLayout(gbl_SignInPanel);
		
		final JTextField txtField_SignInPanel_Email = new JTextField();
		txtField_SignInPanel_Email.setForeground(new Color(192, 192, 192));
		txtField_SignInPanel_Email.setHorizontalAlignment(SwingConstants.CENTER);
		txtField_SignInPanel_Email.setText("Email");
		txtField_SignInPanel_Email.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtField_SignInPanel_Email.setForeground(new Color(0, 0, 0));
				txtField_SignInPanel_Email.setText("");
			}
		});
		txtField_SignInPanel_Email.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_txtField_SignInPanel_Email = new GridBagConstraints();
		gbc_txtField_SignInPanel_Email.gridwidth = 4;
		gbc_txtField_SignInPanel_Email.fill = GridBagConstraints.BOTH;
		gbc_txtField_SignInPanel_Email.insets = new Insets(0, 0, 5, 5);
		gbc_txtField_SignInPanel_Email.gridx = 2;
		gbc_txtField_SignInPanel_Email.gridy = 3;
		SignInPanel.add(txtField_SignInPanel_Email, gbc_txtField_SignInPanel_Email);
		txtField_SignInPanel_Email.setColumns(20);
		
		final JPasswordField passwordField_SignInPanel_Password = new JPasswordField();
		passwordField_SignInPanel_Password.setFont(new Font("Tahoma", Font.PLAIN, 30));
		passwordField_SignInPanel_Password.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_SignInPanel_Password.setForeground(new Color(192, 192, 192));
		passwordField_SignInPanel_Password.setText("Password");
		passwordField_SignInPanel_Password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField_SignInPanel_Password.setForeground(new Color(0, 0, 0));
				passwordField_SignInPanel_Password.setText("");
			}
		});
		GridBagConstraints gbc_passwordField_SignInPanel_Password = new GridBagConstraints();
		gbc_passwordField_SignInPanel_Password.gridwidth = 4;
		gbc_passwordField_SignInPanel_Password.fill = GridBagConstraints.BOTH;
		gbc_passwordField_SignInPanel_Password.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_SignInPanel_Password.gridx = 2;
		gbc_passwordField_SignInPanel_Password.gridy = 4;
		SignInPanel.add(passwordField_SignInPanel_Password, gbc_passwordField_SignInPanel_Password);
		
		JButton button_SignInPanel_Login = new JButton("Login");
		button_SignInPanel_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_SignInPanel_Login.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_button_SignInPanel_Login = new GridBagConstraints();
		gbc_button_SignInPanel_Login.gridwidth = 4;
		gbc_button_SignInPanel_Login.insets = new Insets(0, 0, 5, 5);
		gbc_button_SignInPanel_Login.fill = GridBagConstraints.BOTH;
		gbc_button_SignInPanel_Login.gridx = 2;
		gbc_button_SignInPanel_Login.gridy = 6;
		SignInPanel.add(button_SignInPanel_Login, gbc_button_SignInPanel_Login);
		
		JButton button_SignInPanel_Cancel = new JButton("Cancel");
		button_SignInPanel_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartPanel.setVisible(true);
				SignInPanel.setVisible(false);
			}
		});
		button_SignInPanel_Cancel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_button_SignInPanel_Cancel = new GridBagConstraints();
		gbc_button_SignInPanel_Cancel.gridwidth = 2;
		gbc_button_SignInPanel_Cancel.insets = new Insets(0, 0, 5, 5);
		gbc_button_SignInPanel_Cancel.fill = GridBagConstraints.BOTH;
		gbc_button_SignInPanel_Cancel.gridx = 3;
		gbc_button_SignInPanel_Cancel.gridy = 7;
		SignInPanel.add(button_SignInPanel_Cancel, gbc_button_SignInPanel_Cancel);
		
		
		//SignUpPanel
		//
		frmDaredate.getContentPane().add(SignUpPanel, "name_12067282121923");
		GridBagLayout gbl_SignUpPanel = new GridBagLayout();
		gbl_SignUpPanel.columnWidths = new int[]{398, 398};
		gbl_SignUpPanel.rowHeights = new int[]{62, 62, 62, 62, 62, 62, 62, 62, 62, 62};
		gbl_SignUpPanel.columnWeights = new double[]{0.0, 1.0};
		gbl_SignUpPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		SignUpPanel.setLayout(gbl_SignUpPanel);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setVerticalAlignment(SwingConstants.TOP);
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setFont(new Font("Tahoma", Font.PLAIN, 120));
		GridBagConstraints gbc_lblSignUp = new GridBagConstraints();
		gbc_lblSignUp.gridwidth = 2;
		gbc_lblSignUp.gridheight = 3;
		gbc_lblSignUp.insets = new Insets(0, 0, 5, 0);
		gbc_lblSignUp.gridx = 0;
		gbc_lblSignUp.gridy = 0;
		SignUpPanel.add(lblSignUp, gbc_lblSignUp);
		
		JLabel label_Email = new JLabel("Email");
		label_Email.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_Email.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_Email = new GridBagConstraints();
		gbc_label_Email.fill = GridBagConstraints.BOTH;
		gbc_label_Email.insets = new Insets(0, 0, 5, 5);
		gbc_label_Email.gridx = 0;
		gbc_label_Email.gridy = 3;
		SignUpPanel.add(label_Email, gbc_label_Email);
		
		textField_Email = new JTextField();
		textField_Email.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_Email.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_Email = new GridBagConstraints();
		gbc_textField_Email.insets = new Insets(0, 0, 5, 0);
		gbc_textField_Email.fill = GridBagConstraints.BOTH;
		gbc_textField_Email.gridx = 1;
		gbc_textField_Email.gridy = 3;
		SignUpPanel.add(textField_Email, gbc_textField_Email);
		textField_Email.setColumns(10);
		
		JLabel label_Password = new JLabel("Password");
		label_Password.setHorizontalAlignment(SwingConstants.CENTER);
		label_Password.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_label_Password = new GridBagConstraints();
		gbc_label_Password.insets = new Insets(0, 0, 5, 5);
		gbc_label_Password.gridx = 0;
		gbc_label_Password.gridy = 4;
		SignUpPanel.add(label_Password, gbc_label_Password);
		
		passwordField_Password = new JPasswordField();
		passwordField_Password.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_Password.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_passwordField_Password = new GridBagConstraints();
		gbc_passwordField_Password.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField_Password.fill = GridBagConstraints.BOTH;
		gbc_passwordField_Password.gridx = 1;
		gbc_passwordField_Password.gridy = 4;
		SignUpPanel.add(passwordField_Password, gbc_passwordField_Password);
		
		JLabel label_Repeat_Password = new JLabel("Repeat Password");
		label_Repeat_Password.setHorizontalAlignment(SwingConstants.CENTER);
		label_Repeat_Password.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_label_Repeat_Password = new GridBagConstraints();
		gbc_label_Repeat_Password.insets = new Insets(0, 0, 5, 5);
		gbc_label_Repeat_Password.gridx = 0;
		gbc_label_Repeat_Password.gridy = 5;
		SignUpPanel.add(label_Repeat_Password, gbc_label_Repeat_Password);
		
		passwordField_Repeat_Password = new JPasswordField();
		passwordField_Repeat_Password.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_Repeat_Password.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_passwordField_Repeat_Password = new GridBagConstraints();
		gbc_passwordField_Repeat_Password.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField_Repeat_Password.fill = GridBagConstraints.BOTH;
		gbc_passwordField_Repeat_Password.gridx = 1;
		gbc_passwordField_Repeat_Password.gridy = 5;
		SignUpPanel.add(passwordField_Repeat_Password, gbc_passwordField_Repeat_Password);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
		lblCreditCardNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreditCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblCreditCardNumber = new GridBagConstraints();
		gbc_lblCreditCardNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreditCardNumber.gridx = 0;
		gbc_lblCreditCardNumber.gridy = 6;
		SignUpPanel.add(lblCreditCardNumber, gbc_lblCreditCardNumber);
		
		textField_Credit_Card_Number = new JTextField();
		textField_Credit_Card_Number.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_textField_Credit_Card_Number = new GridBagConstraints();
		gbc_textField_Credit_Card_Number.insets = new Insets(0, 0, 5, 0);
		gbc_textField_Credit_Card_Number.fill = GridBagConstraints.BOTH;
		gbc_textField_Credit_Card_Number.gridx = 1;
		gbc_textField_Credit_Card_Number.gridy = 6;
		SignUpPanel.add(textField_Credit_Card_Number, gbc_textField_Credit_Card_Number);
		textField_Credit_Card_Number.setColumns(10);
		
		label_Credit_Card_Secutiry_Code = new JLabel("Credit Card Security Code");
		label_Credit_Card_Secutiry_Code.setHorizontalAlignment(SwingConstants.CENTER);
		label_Credit_Card_Secutiry_Code.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_label_Credit_Card_Secutiry_Code = new GridBagConstraints();
		gbc_label_Credit_Card_Secutiry_Code.insets = new Insets(0, 0, 5, 5);
		gbc_label_Credit_Card_Secutiry_Code.gridx = 0;
		gbc_label_Credit_Card_Secutiry_Code.gridy = 7;
		SignUpPanel.add(label_Credit_Card_Secutiry_Code, gbc_label_Credit_Card_Secutiry_Code);
		
		textField_Credit_Card_Security_Code = new JTextField();
		textField_Credit_Card_Security_Code.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_textField_Credit_Card_Security_Code = new GridBagConstraints();
		gbc_textField_Credit_Card_Security_Code.insets = new Insets(0, 0, 5, 0);
		gbc_textField_Credit_Card_Security_Code.fill = GridBagConstraints.BOTH;
		gbc_textField_Credit_Card_Security_Code.gridx = 1;
		gbc_textField_Credit_Card_Security_Code.gridy = 7;
		SignUpPanel.add(textField_Credit_Card_Security_Code, gbc_textField_Credit_Card_Security_Code);
		textField_Credit_Card_Security_Code.setColumns(10);
		
		JButton button_SignUpPanel_Submit = new JButton("Submit");
		button_SignUpPanel_Submit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_button_SignUpPanel_Submit = new GridBagConstraints();
		gbc_button_SignUpPanel_Submit.insets = new Insets(0, 0, 0, 5);
		gbc_button_SignUpPanel_Submit.gridx = 0;
		gbc_button_SignUpPanel_Submit.gridy = 9;
		SignUpPanel.add(button_SignUpPanel_Submit, gbc_button_SignUpPanel_Submit);
		
		JButton button_SignUpPanel_Cancel = new JButton("Cancel");
		button_SignUpPanel_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Email.setText(null);
				textField_Credit_Card_Number.setText(null);
				textField_Credit_Card_Security_Code.setText(null);
				passwordField_Password.setText(null);
				passwordField_Repeat_Password.setText(null);
				
				StartPanel.setVisible(true);
				SignUpPanel.setVisible(false);
				
			}
		});
		button_SignUpPanel_Cancel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_button_SignUpPanel_Cancel = new GridBagConstraints();
		gbc_button_SignUpPanel_Cancel.gridx = 1;
		gbc_button_SignUpPanel_Cancel.gridy = 9;
		SignUpPanel.add(button_SignUpPanel_Cancel, gbc_button_SignUpPanel_Cancel);
	}
	
}
