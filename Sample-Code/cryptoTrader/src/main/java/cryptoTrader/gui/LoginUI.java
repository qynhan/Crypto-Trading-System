package cryptoTrader.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;



public class LoginUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel loginPanel;
	
	private JLabel userNameLbl;
	private JLabel passWordLbl;
	
	private JTextField userNameInput;
	private JPasswordField passWordInput;
	
	private JButton loginButton;
	
	
	private static LoginUI instance;

	// Should be a reference to a separate object in actual implementation


	public static LoginUI getInstance() {
		if (instance == null)
			instance = new LoginUI();

		return instance;
	}

	private LoginUI() {

		// Set window title
		super("Login Window");

		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(new GridLayout(3, 2));

		// username input section
		userNameLbl = new JLabel();
		userNameLbl.setText("Username: ");
		userNameInput = new JTextField();
		
		// password input section
		passWordLbl = new JLabel();
		passWordLbl.setText("Password: ");
		passWordInput = new JPasswordField();
		
		// login button
		loginButton = new JButton("Login!");
		loginButton.addActionListener(this);
		
		loginPanel.add(userNameLbl);
		loginPanel.add(userNameInput);
		loginPanel.add(passWordLbl);
		loginPanel.add(passWordInput);
		loginPanel.add(loginButton);
		
	    add(loginPanel, BorderLayout.CENTER);
	}


	public static void main(String[] args) {
		JFrame frame = LoginUI.getInstance();
		frame.setSize(600, 200);
		frame.setVisible(true);
	}

// to add: @Override
	//public void actionPerformed(ActionEvent e)
	// verification of credentials

}
