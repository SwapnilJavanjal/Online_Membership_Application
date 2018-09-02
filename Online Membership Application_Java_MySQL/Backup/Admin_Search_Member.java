import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Admin_Search_Member extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Member window = new Search_Member();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Search_Member() throws Exception {
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//textField.setColumns(10);
		
		
		frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Search Member");
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  frame.setSize(screenSize.width, screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridBagLayout());
		//GridBagLayout gbl_panel = new GridBagLayout();
	//	gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	//	gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	//	gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		//gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		//panel.setLayout(gbl_panel);
		
		JLabel lblFirstName = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 29;
		gbc_lblFirstName.gridy = 24;
		gbc_lblFirstName.anchor= GridBagConstraints.NORTH;
		panel.add(lblFirstName, gbc_lblFirstName);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		//gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 31;
		gbc_textField_1.gridy = 24;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("Last Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 29;
		gbc_lblName.gridy = 26;
		panel.add(lblName, gbc_lblName);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		//gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 31;
		gbc_textField_2.gridy = 26;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress.gridx = 29;
		gbc_lblAddress.gridy = 28;
		panel.add(lblAddress, gbc_lblAddress);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		//gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 31;
		gbc_textField_3.gridy = 28;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact");
		GridBagConstraints gbc_lblContact = new GridBagConstraints();
		gbc_lblContact.insets = new Insets(0, 0, 5, 5);
		gbc_lblContact.anchor = GridBagConstraints.SOUTH;
		gbc_lblContact.gridx = 29;
		gbc_lblContact.gridy = 30;
		panel.add(lblContact, gbc_lblContact);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		//	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_4.gridx = 31;
			gbc_textField_4.gridy = 30;
			panel.add(textField_4, gbc_textField_4);
			textField_4.setColumns(10);
		
		JButton btnSearchMember = new JButton("Search Member");
		GridBagConstraints gbc_btnSearchMember = new GridBagConstraints();
		gbc_btnSearchMember.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearchMember.gridx = 31;
		gbc_btnSearchMember.gridy = 33;
		panel.add(btnSearchMember, gbc_btnSearchMember);
		btnSearchMember.addActionListener(this);
		
		JButton btnMemberHome = new JButton("Admin Home");
		GridBagConstraints gbc_btnMemberHome = new GridBagConstraints();
		gbc_btnMemberHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnMemberHome.gridx = 31;
		gbc_btnMemberHome.gridy = 36;
		gbc_btnMemberHome.fill = GridBagConstraints.BOTH;
		panel.add(btnMemberHome, gbc_btnMemberHome);
		btnMemberHome.addActionListener(this);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		Object source = ae.getActionCommand();
		
		if(source.equals("Search Member")){
		//	dispose();
		try{
		//frame.dispose();
			String username = textField_1.getText();
	//String password = passwordtext1.getText();
	DataObject myObject = new DataObject();
	myObject.setQuery("SELECT * FROM Members where FName = '"+username+"'");
	Socket socketToServer = new Socket("afsconnect1.njit.edu", 33007);
	//System.out.println("Going to Database");
	ObjectOutputStream myOutputStream = new ObjectOutputStream(socketToServer.getOutputStream());

			ObjectInputStream myInputStream = new ObjectInputStream(socketToServer.getInputStream());

			myOutputStream.writeObject(myObject);

			myObject = (DataObject)myInputStream.readObject();
			
			//String usr = ;
			//usr.replaceAll("null", "");
			textField_2.setText(myObject.getMemberLname());
			textField_3.setText(myObject.getMemberAddress1());
			textField_4.setText(myObject.getMemberContact());
			
			   // System.out.println("UserName : " + myObject.getMemberUserName());
		//	System.out.println("Password : " + myObject.getMemberPassword());
			
			
			
			
			
			
			
		}catch(Exception e){System.out.println(e);}
			
		}
		else if(source.equals("Admin Home")){
			new Admin_Home();
			frame.dispose();
		}
	}
	

}
