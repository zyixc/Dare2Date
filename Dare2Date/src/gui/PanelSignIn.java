package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class PanelSignIn extends JPanel {
	private JTextField txtEmail;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public PanelSignIn() {
		setBounds(100,100,800,625);
		setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(192, 192, 192));
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setText("Email");
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
				txtEmail.setForeground(new Color(240, 240, 240));
				txtEmail.setText("");
			}
		});
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEmail.setBounds(250, 250, 300, 43);
		add(txtEmail);
		txtEmail.setColumns(20);
		
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setHorizontalAlignment(SwingConstants.LEFT);
				passwordField.setForeground(new Color(240, 240, 240));
				passwordField.setText("");
			}
		});
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setForeground(new Color(192, 192, 192));
		passwordField.setBounds(250, 300, 300, 43);
		passwordField.setText("Password");
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnLogin.setBounds(300, 354, 200, 50);
		add(btnLogin);
		
		setVisible(true);
	}
}
