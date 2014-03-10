package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;

public class GUI {
	
	private JFrame frmDaredate;
	
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
		PanelStart startpanel = new PanelStart();
		frmDaredate.getContentPane().add(startpanel);

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
		frmDaredate.getContentPane().setLayout(new CardLayout(0,0));
		frmDaredate.setBackground(new Color(100, 149, 237));
	}

}
