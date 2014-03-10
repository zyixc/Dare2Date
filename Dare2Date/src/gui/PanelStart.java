package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelStart extends JPanel {
	/**
	 * Create the panel.
	 */
	public PanelStart() {
		setBounds(100,100,800,625);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dare2Date");
		lblNewLabel.setBounds(0, 0, 800, 150);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 120));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 70));
		btnSignIn.setBounds(10, 300, 385, 200);
		add(btnSignIn);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 70));
		btnSignUp.setBounds(405, 300, 385, 200);
		add(btnSignUp);
		
		JButton btnVisitorView = new JButton("Visitor View");
		btnVisitorView.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVisitorView.setBounds(10, 565, 200, 50);
		add(btnVisitorView);
	
		setVisible(true);
	}

	
}
