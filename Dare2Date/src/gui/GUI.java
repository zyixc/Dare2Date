package gui;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



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
	
	//main
	private final JDesktopPane desktopPane = new JDesktopPane();
	private final JInternalFrame internalFrame = new JInternalFrame("Chat",false,false,false,false);
	private final JInternalFrame internalFrameCenter = new JInternalFrame("New JInternalFrame",false,false,false,false);
	private final JButton btnPanelHome = new JButton("Home Panel");
	private final JButton btnPanelSearch = new JButton("Search Panel");
	private final JButton btnNewButton_2 = new JButton("Panel");
	
	//center
	private CenterWindow windowCenter;
	private final JMenuItem mntmSearch_AgeMatch = new JMenuItem("AgeMatch");
	private final JMenuItem mntmSearch_FullMatch = new JMenuItem("FullMatch");
	private final JMenuItem mntmSearch_LocationMatch = new JMenuItem("LocationMatch");
		
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
		internalFrameCenter.setVisible(true);
		frmDaredate = new JFrame();
		frmDaredate.setTitle("Dare2Date");
		frmDaredate.setBounds(0,0,724,628);
		frmDaredate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //change to hide_on_close
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0,0};
		gridBagLayout.rowHeights = new int[] {0, 12};
		gridBagLayout.columnWeights = new double[]{7.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0};
		
		frmDaredate.getContentPane().setLayout(gridBagLayout);	
		
		
		
		init_menuBar();
		side();
		bottom();
		center();
		chatWindow();
	}

	private void init_menuBar(){
		frmDaredate.setJMenuBar(menuBar);
		menuBar_optionsMenu();
		menuBar_searchMenu();
	}
	private void menuBar_optionsMenu(){
		menuBar.add(optionsMenu);
		
		JMenuItem mntmMenu_EditProfile = new JMenuItem("Edit Profile");
		optionsMenu.add(mntmMenu_EditProfile);
		
		JMenuItem mntmMenu_Options = new JMenuItem("Options");
		mntmMenu_Options.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "not implemented yet", "InfoBox: " + "?", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		optionsMenu.add(mntmMenu_Options);
		
		JMenuItem mntmMenu_Exit = new JMenuItem("Exit");
		mntmMenu_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDaredate.setVisible(false);
				frmDaredate.dispose();
			}
		});
		optionsMenu.add(mntmMenu_Exit);
	}
	private void menuBar_searchMenu(){
		menuBar.add(searchMenu);
		searchMenu.add(mntmSearch_AgeMatch);
		
		searchMenu.add(mntmSearch_FullMatch);
		
		searchMenu.add(mntmSearch_LocationMatch);
	}
	
	private void side(){
		GridBagConstraints gbc_panelSide = new GridBagConstraints();
		gbc_panelSide.gridheight = 2;
		gbc_panelSide.fill = GridBagConstraints.BOTH;
		gbc_panelSide.gridx = 1;
		gbc_panelSide.gridy = 0;
		panelSide.setBorder(null);
		frmDaredate.getContentPane().add(panelSide, gbc_panelSide);
	}
	private void bottom(){
		GridBagConstraints gbc_panelBottom = new GridBagConstraints();
		gbc_panelBottom.fill = GridBagConstraints.BOTH;
		gbc_panelBottom.gridx = 0;
		gbc_panelBottom.gridy = 1;
		panelBottom.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmDaredate.getContentPane().add(panelBottom, gbc_panelBottom);
		
		GridBagLayout gbl_panelBottom = new GridBagLayout();
		gbl_panelBottom.columnWidths = new int[] {0, 0, 0, 0};
		gbl_panelBottom.rowHeights = new int[]{0};
		gbl_panelBottom.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
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
		
		GridBagConstraints gbc_btnPanelHome = new GridBagConstraints();
		gbc_btnPanelHome.fill = GridBagConstraints.BOTH;
		gbc_btnPanelHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnPanelHome.gridx = 0;
		gbc_btnPanelHome.gridy = 0;
		btnPanelHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				windowCenter.panelHome.setVisible(true);
				windowCenter.panelSearch.setVisible(false);
				windowCenter.panel.setVisible(false);
			}
		});
		panelBottom.add(btnPanelHome, gbc_btnPanelHome);
		
		GridBagConstraints gbc_btnPanelSearch = new GridBagConstraints();
		gbc_btnPanelSearch.fill = GridBagConstraints.BOTH;
		gbc_btnPanelSearch.insets = new Insets(0, 0, 0, 5);
		gbc_btnPanelSearch.gridx = 1;
		gbc_btnPanelSearch.gridy = 0;
		btnPanelSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowCenter.panelHome.setVisible(false);
				windowCenter.panelSearch.setVisible(true);
				windowCenter.panel.setVisible(false);
			}
		});
		panelBottom.add(btnPanelSearch, gbc_btnPanelSearch);
		
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 0;
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowCenter.panelHome.setVisible(false);
				windowCenter.panelSearch.setVisible(false);
				windowCenter.panel.setVisible(true);
			}
		});
		panelBottom.add(btnNewButton_2, gbc_btnNewButton_2);
		GridBagConstraints gbc_btnChat = new GridBagConstraints();
		gbc_btnChat.gridx = 3;
		gbc_btnChat.gridy = 0;
		gbc_btnChat.fill = GridBagConstraints.BOTH;
		panelBottom.add(btnChat, gbc_btnChat);
	}
	
	private void chatWindow(){		
		ChatWindow windowChat = new ChatWindow();
		internalFrame.getContentPane().add(windowChat);
		windowChat.setVisible(true);		
		internalFrame.setBorder(null);
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
	}
	
	private void center(){
		GridBagConstraints gbc_desktopPane = new GridBagConstraints();
		gbc_desktopPane.fill = GridBagConstraints.BOTH;
		gbc_desktopPane.gridx = 0;
		gbc_desktopPane.gridy = 0;
		desktopPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmDaredate.getContentPane().add(desktopPane, gbc_desktopPane);
		GridBagLayout gbl_desktopPane = new GridBagLayout();
		gbl_desktopPane.columnWidths = new int[]{0, 0};
		gbl_desktopPane.rowHeights = new int[]{0, 0};
		gbl_desktopPane.columnWeights = new double[]{1.0,1.0};
		gbl_desktopPane.rowWeights = new double[]{1.0,1.0};
		desktopPane.setLayout(gbl_desktopPane);
		{
			GridBagConstraints gbc_internalFrameCenter = new GridBagConstraints();
			gbc_internalFrameCenter.fill = GridBagConstraints.BOTH;
			gbc_internalFrameCenter.gridheight = 2;
			gbc_internalFrameCenter.gridwidth = 2;
			gbc_internalFrameCenter.gridx = 0;
			gbc_internalFrameCenter.gridy = 0;
			desktopPane.add(internalFrameCenter, gbc_internalFrameCenter);
		}
		
		GridBagConstraints gbc_internalFrame = new GridBagConstraints();
		gbc_internalFrame.fill = GridBagConstraints.BOTH;
		gbc_internalFrame.gridx = 1;
		gbc_internalFrame.gridy = 1;
		desktopPane.add(internalFrame, gbc_internalFrame);
		internalFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		panel_home();
	}
	
	private void panel_home(){
		((javax.swing.plaf.basic.BasicInternalFrameUI)internalFrameCenter.getUI()).setNorthPane(null);
		internalFrameCenter.setBorder(null);
		windowCenter = new CenterWindow();
		internalFrameCenter.getContentPane().add(windowCenter);
		windowCenter.setVisible(true);
	}
}
