package gui;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

public class CenterWindow extends JPanel {

	/**
	 * Create the panel.
	 */
	public CenterWindow() {
		setLayout(new CardLayout(0, 0));
		
		JPanel panelHome = new JPanel();
		add(panelHome, "name_30085133803200");
		GridBagLayout gbl_panelHome = new GridBagLayout();
		gbl_panelHome.columnWidths = new int[]{0,0,0,0,0,0,0,0};
		gbl_panelHome.rowHeights = new int[]{0,0,0,0,0,0,0,0};
		gbl_panelHome.columnWeights = new double[]{1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
		gbl_panelHome.rowWeights = new double[]{1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
		panelHome.setLayout(gbl_panelHome);
		
		JLabel lblNewLabel = new JLabel("Panel Home");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 0;
		panelHome.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panelSearch = new JPanel();
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
		
		JPanel panel = new JPanel();
		add(panel, "name_30088251608510");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0};
		gbl_panel.rowHeights = new int[]{0};
		gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

	}

}
