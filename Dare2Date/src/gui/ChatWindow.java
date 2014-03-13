package gui;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;

public class ChatWindow extends JPanel {
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
	/**
	 * Create the panel.
	 */
	public ChatWindow() {
		setLayout(new BorderLayout(0, 0));
		add(tabbedPane, BorderLayout.CENTER);
		newTab("TestSubject"); //temp
		newTab("Dummy");
		newTab("Dumm0000");

	}
	
	public void newTab(String toUser){
		JPanel panel = new JPanel();
		final TextArea textArea = new TextArea(5,30);
		JScrollPane scrollPane = new JScrollPane(textArea);
		final JTextField textField = new JTextField();
		
		final String username = "TestUSER";
		
		tabbedPane.addTab(toUser, null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel.add(scrollPane);
		
		panel.add(textField, BorderLayout.SOUTH);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
					String message = buildMessage(username,textField.getText());
					textArea.append(message);
					textField.setText("");
				}
			}
		});
		textField.setColumns(180);
	}
	
	public String buildMessage(String fromUser, String message){
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E hh:mm");
		
		//Show message
		StringBuilder showMessage = new StringBuilder();
		showMessage.append("[");
		showMessage.append(fromUser);
		showMessage.append("@ ");
		showMessage.append(ft.format(dNow));
		showMessage.append("]");
		showMessage.append(": ");
		showMessage.append(message);
		showMessage.append(System.lineSeparator());
		
		return showMessage.toString();
	}
}
