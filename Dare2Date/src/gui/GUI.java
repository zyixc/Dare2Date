package gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;

import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class GUI {
	/*
	 * BorderLayout Method PanelName
	 * 	-BOTTOM		bottom		panelBottom //not implemented
	 * 	-SIDE		side		panelSide
	 * 	-CENTER		center		panelCenter
	 * 
	 * MenuBar
	 * 	-menuBar
	 */
	
	private JFrame frmDaredate;
	
	//menuBar
	private JMenuBar menuBar = new JMenuBar();
	private JMenu optionsMenu = new JMenu("Menu");
	private JMenu searchMenu = new JMenu("Search");
	
	//bottom
	private final JPanel panelBottom = new JPanel();
	private JToggleButton btnChat = new JToggleButton("Chat");
	private boolean state_pressed = false;
	
	//side
	private final JPanel panelSide = new JPanel();	
	
	//center
	private final JDesktopPane desktopPane = new JDesktopPane();
	private final JInternalFrame internalFrame = new JInternalFrame("Chat",true,false,false,true);
	private final JInternalFrame internalFrameCenter = new JInternalFrame("test",false,false,false,false);
	

	
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
		internalFrameCenter.setBounds(0, 0, 462, 373);
		internalFrameCenter.setVisible(true);
		frmDaredate = new JFrame();
		frmDaredate.getContentPane().addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				int size = 200;
				final Dimension screenSize = desktopPane.getSize();
				Point p = new Point((screenSize.width - size),(screenSize.height - size));
				internalFrame.setLocation(p);
				internalFrame.revalidate();
				
				JInternalFrame[] collection = {internalFrameCenter};
				for(JInternalFrame temp: collection){
					temp.setLocation(screenSize.width,screenSize.height);
				}
			}
		});
		frmDaredate.setTitle("Dare2Date");
		frmDaredate.setBounds(100, 100, 724, 654);
		frmDaredate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0,0};
		gridBagLayout.rowHeights = new int[] {0, 12};
		gridBagLayout.columnWeights = new double[]{7.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0};
		frmDaredate.getContentPane().setLayout(gridBagLayout);	
		
		init_menuBar();
		center();
		side();
		bottom();
		chatWindow();
	}

	private void init_menuBar(){
		frmDaredate.setJMenuBar(menuBar);
		menuBar_optionsMenu();
		menuBar_searchMenu();
	}
	private void menuBar_optionsMenu(){
		menuBar.add(optionsMenu);
		
		JMenuItem mntmEditProfile = new JMenuItem("Edit Profile");
		optionsMenu.add(mntmEditProfile);
		
		JMenuItem mntmOptios = new JMenuItem("Options");
		optionsMenu.add(mntmOptios);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		optionsMenu.add(mntmNewMenuItem);
	}
	private void menuBar_searchMenu(){
		menuBar.add(searchMenu);
	}
	
	private void side(){
		GridBagConstraints gbc_panelSide = new GridBagConstraints();
		gbc_panelSide.insets = new Insets(0, 0, 5, 0);
		gbc_panelSide.gridheight = 2;
		gbc_panelSide.fill = GridBagConstraints.BOTH;
		gbc_panelSide.gridx = 1;
		gbc_panelSide.gridy = 0;
		panelSide.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmDaredate.getContentPane().add(panelSide, gbc_panelSide);
	}
	private void bottom(){
		GridBagConstraints gbc_panelBottom = new GridBagConstraints();
		gbc_panelBottom.insets = new Insets(0, 0, 5, 5);
		gbc_panelBottom.fill = GridBagConstraints.BOTH;
		gbc_panelBottom.gridx = 0;
		gbc_panelBottom.gridy = 1;
		frmDaredate.getContentPane().add(panelBottom, gbc_panelBottom);
		
		GridBagLayout gbl_panelBottom = new GridBagLayout();
		gbl_panelBottom.columnWidths = new int[]{0,0,0,0,0};
		gbl_panelBottom.rowHeights = new int[]{0};
		gbl_panelBottom.columnWeights = new double[]{1.0,1.0,1.0,1.0,1.0};
		gbl_panelBottom.rowWeights = new double[]{1.0};
		panelBottom.setLayout(gbl_panelBottom);
		btnChat.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {					
				if(!state_pressed){
					internalFrame.setVisible(true);
					state_pressed = true;
				}
				else {
					internalFrame.setVisible(false);
					state_pressed = false;
				}
			}
		});
		GridBagConstraints gbc_btnChat = new GridBagConstraints();
		gbc_btnChat.gridx = 4;
		gbc_btnChat.gridy = 0;
		gbc_btnChat.fill = GridBagConstraints.BOTH;
		panelBottom.add(btnChat, gbc_btnChat);
	}
	private void chatWindow(){
		int size = 200;
		
		internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameIconified(InternalFrameEvent arg0) {
				internalFrame.setVisible(false);
				try {
					internalFrame.setIcon(false);
				} catch (PropertyVetoException e) {
					e.printStackTrace();
				}
				btnChat.setSelected(false);
				state_pressed = false;
			}
		});
		
		internalFrame.setBounds((desktopPane.getWidth() - size),(desktopPane.getHeight() - size), size, size);
		internalFrame.setBorder(null);
	}
	
	private void center(){
		GridBagConstraints gbc_desktopPane = new GridBagConstraints();
		gbc_desktopPane.insets = new Insets(0, 0, 5, 5);
		gbc_desktopPane.fill = GridBagConstraints.BOTH;
		gbc_desktopPane.gridx = 0;
		gbc_desktopPane.gridy = 0;
		frmDaredate.getContentPane().add(desktopPane, gbc_desktopPane);

		desktopPane.add(internalFrame);
		desktopPane.add(internalFrameCenter);
		center_main();
		
	}
	private void center_main(){
		internalFrameCenter.setBounds(0,0,desktopPane.getWidth(),desktopPane.getHeight());
		System.out.println(desktopPane.getWidth()+" "+desktopPane.getHeight());
		//internalFrameCenter.setUI(null);
		//internalFrameCenter.setBorder(null);
		internalFrameCenter.setVisible(true);
	}
}
