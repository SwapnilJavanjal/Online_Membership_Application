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

public class Admin_Member_Insert extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_memid, textField_City, textField_State, textField_Pincode, textField_Country, textField_UserName, textField_Password;
	
	String username, changing_user_name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Member_Insert window = new Admin_Member_Insert();
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
	public Admin_Member_Insert() throws Exception {
		
		
		initialize();
		
		try{
		/*//frame.dispose();
			username = "Karls";
	//String password = passwordtext1.getText();
	DataObjectChild myObject = new DataObjectChild();
	//System.out.println(CardLayoutDemo.CURRENT_USER);
	myObject.setQuery("SELECT * FROM Members where UserName = '"+ CardLayoutDemo.CURRENT_USER+"'");
	Socket socketToServer = new Socket("afsconnect1.njit.edu", 33007);
	//System.out.println("Going to Database");
	ObjectOutputStream myOutputStream = new ObjectOutputStream(socketToServer.getOutputStream());

			ObjectInputStream myInputStream = new ObjectInputStream(socketToServer.getInputStream());

			myOutputStream.writeObject(myObject);

			myObject = (DataObjectChild)myInputStream.readObject();
			
			//String usr = ;
			//usr.replaceAll("null", "");
				textField_1.setText(myObject.getMemberFname());
			textField_2.setText(myObject.getMemberLname());
			//textField_2.setEditable(false);
			textField_3.setText(myObject.getMemberAddress1());
			//textField_3.setEditable(false);
			textField_4.setText(myObject.getMemberContact());
			//textField_4.setEditable(false);
			 //   System.out.println("UserName : " + myObject.getMemberUserName());
		//	System.out.println("Password : " + myObject.getMemberPassword());
		
				
			
			*/
			
		}catch(Exception e){System.out.println(e);}
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//textField.setColumns(10);
		
		
		frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Update Details");
		
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
		
		
		JLabel lblMemId = new JLabel("Member Id");
		GridBagConstraints gbc_lblMemId = new GridBagConstraints();
		gbc_lblMemId.insets = new Insets(0, 0, 5, 5);
		gbc_lblMemId.gridx = 29;
		gbc_lblMemId.gridy = 14;
		panel.add(lblMemId, gbc_lblMemId);
		
		textField_memid = new JTextField();
		GridBagConstraints gbc_textField_memid = new GridBagConstraints();
		gbc_textField_memid.insets = new Insets(0, 0, 5, 5);
		gbc_textField_memid.gridx = 31;
		gbc_textField_memid.gridy = 14;
		panel.add(textField_memid, gbc_textField_memid);
		textField_memid.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 29;
		gbc_lblFirstName.gridy = 16;
		gbc_lblFirstName.anchor= GridBagConstraints.NORTH;
		panel.add(lblFirstName, gbc_lblFirstName);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		//gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 31;
		gbc_textField_1.gridy = 16;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("Last Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 29;
		gbc_lblName.gridy = 18;
		panel.add(lblName, gbc_lblName);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		//gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 31;
		gbc_textField_2.gridy = 18;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress.gridx = 29;
		gbc_lblAddress.gridy = 20;
		panel.add(lblAddress, gbc_lblAddress);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		//gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 31;
		gbc_textField_3.gridy = 20;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact");
		GridBagConstraints gbc_lblContact = new GridBagConstraints();
		gbc_lblContact.insets = new Insets(0, 0, 5, 5);
		gbc_lblContact.anchor = GridBagConstraints.SOUTH;
		gbc_lblContact.gridx = 29;
		gbc_lblContact.gridy = 22;
		panel.add(lblContact, gbc_lblContact);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		//	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_4.gridx = 31;
			gbc_textField_4.gridy = 22;
			panel.add(textField_4, gbc_textField_4);
			textField_4.setColumns(10);
			
			JLabel lblCity = new JLabel("City");
			GridBagConstraints gbc_lblCity = new GridBagConstraints();
			gbc_lblCity.insets = new Insets(0, 0, 5, 5);
			gbc_lblCity.anchor = GridBagConstraints.SOUTH;
			gbc_lblCity.gridx = 29;
			gbc_lblCity.gridy = 24;
			panel.add(lblCity, gbc_lblCity);
			
			textField_City = new JTextField();
			GridBagConstraints gbc_textField_City = new GridBagConstraints();
			gbc_textField_City.insets = new Insets(0, 0, 5, 5);
			//	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_City.gridx = 31;
			gbc_textField_City.gridy = 24;
				panel.add(textField_City, gbc_textField_City);
				textField_City.setColumns(10);
				
				
				
				JLabel lblState = new JLabel("State");
				GridBagConstraints gbc_lblState = new GridBagConstraints();
				gbc_lblState.insets = new Insets(0, 0, 5, 5);
				gbc_lblState.anchor = GridBagConstraints.SOUTH;
				gbc_lblState.gridx = 29;
				gbc_lblState.gridy = 26;
				panel.add(lblState, gbc_lblState);
				
				textField_State = new JTextField();
				GridBagConstraints gbc_textField_State = new GridBagConstraints();
				gbc_textField_State.insets = new Insets(0, 0, 5, 5);
				//	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_State.gridx = 31;
				gbc_textField_State.gridy = 26;
					panel.add(textField_State, gbc_textField_State);
					textField_State.setColumns(10);
					

					JLabel lblPincode = new JLabel("Pincode");
					GridBagConstraints gbc_lblPincode = new GridBagConstraints();
					gbc_lblPincode.insets = new Insets(0, 0, 5, 5);
					gbc_lblPincode.anchor = GridBagConstraints.SOUTH;
					gbc_lblPincode.gridx = 29;
					gbc_lblPincode.gridy = 28;
					panel.add(lblPincode, gbc_lblPincode);
					
					textField_Pincode = new JTextField();
					GridBagConstraints gbc_textField_Pincode = new GridBagConstraints();
					gbc_textField_Pincode.insets = new Insets(0, 0, 5, 5);
					//	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_Pincode.gridx = 31;
					gbc_textField_Pincode.gridy = 28;
						panel.add(textField_Pincode, gbc_textField_Pincode);
						textField_Pincode.setColumns(10);
						
						
						JLabel lblCountry = new JLabel("Country");
						GridBagConstraints gbc_lblCountry = new GridBagConstraints();
						gbc_lblCountry.insets = new Insets(0, 0, 5, 5);
						gbc_lblCountry.anchor = GridBagConstraints.SOUTH;
						gbc_lblCountry.gridx = 29;
						gbc_lblCountry.gridy = 30;
						panel.add(lblCountry, gbc_lblCountry);
						
						textField_Country = new JTextField();
						GridBagConstraints gbc_textField_Country = new GridBagConstraints();
						gbc_textField_Country.insets = new Insets(0, 0, 5, 5);
						//	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
						gbc_textField_Country.gridx = 31;
						gbc_textField_Country.gridy = 30;
							panel.add(textField_Country, gbc_textField_Country);
							textField_Country.setColumns(10);
							
							JLabel lblUserName = new JLabel("UserName");
							GridBagConstraints gbc_lblUserName = new GridBagConstraints();
							gbc_lblUserName.insets = new Insets(0, 0, 5, 5);
							gbc_lblUserName.anchor = GridBagConstraints.SOUTH;
							gbc_lblUserName.gridx = 29;
							gbc_lblUserName.gridy = 32;
							panel.add(lblUserName, gbc_lblUserName);
							
							textField_UserName = new JTextField();
							GridBagConstraints gbc_textField_UserName = new GridBagConstraints();
							gbc_textField_UserName.insets = new Insets(0, 0, 5, 5);
							//	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
							gbc_textField_UserName.gridx = 31;
							gbc_textField_UserName.gridy = 32;
								panel.add(textField_UserName, gbc_textField_UserName);
								textField_UserName.setColumns(10);
								
								JLabel lblPassword = new JLabel("Password");
								GridBagConstraints gbc_lblPassword = new GridBagConstraints();
								gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
								gbc_lblPassword.anchor = GridBagConstraints.SOUTH;
								gbc_lblPassword.gridx = 29;
								gbc_lblPassword.gridy = 34;
								panel.add(lblPassword, gbc_lblPassword);
								
								textField_Password = new JTextField();
								GridBagConstraints gbc_textField_Password = new GridBagConstraints();
								gbc_textField_Password.insets = new Insets(0, 0, 5, 5);
								//	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
								gbc_textField_Password.gridx = 31;
								gbc_textField_Password.gridy = 34;
									panel.add(textField_Password, gbc_textField_Password);
									textField_Password.setColumns(10);
								
							
							

		JButton btnSearchMember = new JButton("Insert Record");
		GridBagConstraints gbc_btnSearchMember = new GridBagConstraints();
		gbc_btnSearchMember.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearchMember.gridx = 31;
		gbc_btnSearchMember.gridy = 36;
		panel.add(btnSearchMember, gbc_btnSearchMember);
		btnSearchMember.addActionListener(this);
		
		JButton btnMemberHome = new JButton("Admin Home");
		GridBagConstraints gbc_btnMemberHome = new GridBagConstraints();
		gbc_btnMemberHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnMemberHome.gridx = 31;
		gbc_btnMemberHome.gridy = 38;
		gbc_btnMemberHome.fill = GridBagConstraints.BOTH;
		panel.add(btnMemberHome, gbc_btnMemberHome);
		btnMemberHome.addActionListener(this);
		
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		Object source = ae.getActionCommand();
		
	/*	if(source.equals("Search Details"))
		{
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			try{
				
		//frame.dispose();
			String username = textField_1.getText();
	//String password = passwordtext1.getText();
	DataObjectChild myObject = new DataObjectChild();
	myObject.setQuery("SELECT * FROM Members where FName = '"+username+"'");
	Socket socketToServer = new Socket("afsconnect1.njit.edu", 33007);
	//System.out.println("Going to Database");
	ObjectOutputStream myOutputStream = new ObjectOutputStream(socketToServer.getOutputStream());

			ObjectInputStream myInputStream = new ObjectInputStream(socketToServer.getInputStream());

			myOutputStream.writeObject(myObject);

			myObject = (DataObjectChild)myInputStream.readObject();
			
			//String usr = ;
			//usr.replaceAll("null", "");
			changing_user_name=myObject.getMemberUserName();
			textField_2.setText(myObject.getMemberLname());
			textField_3.setText(myObject.getMemberAddress1());
			textField_4.setText(myObject.getMemberContact());
			//System.out.println("UserName : " + myObject.getMemberUserName());
			}catch(Exception e){System.out.println(e);}
			
		}
		
		else */
		if(source.equals("Insert Record")){
		//	dispose();
		try{
		//frame.dispose();
			//String username = textField_1.getText();
	//String password = passwordtext1.getText();
	DataObjectChild myObject = new DataObjectChild();
	//myObject.setQuery("SELECT * FROM Members where FName = '"+CardLayoutDemo.CURRENT_USER+"'");
	//myObject.setQuery("UPDATE \'sj498\'.\'Member\' SET 
	//myObject.setQuery("update sj498.Members set FName = '"+textField_1.getText()+"', LName = '"+textField_2.getText()+"', Address1= '"+textField_3.getText()+"', Contact = '"+textField_4.getText()+"' where UserName = '"+changing_user_name+"';");
	myObject.setQuery("insert into Members (`Member_Id`, `FName`, `LName`, `Address1`, `Contact`, `City`, `State`, `PinCode`, `Country`, `UserName`, `Password`)values ("+textField_memid.getText()+", '"+textField_1.getText()+"', '"+textField_2.getText()+"', '"+textField_3.getText()+"', '"+textField_4.getText()+"','"+textField_City.getText()+"','"+textField_State.getText()+"','"+textField_Pincode.getText()+"','"+textField_Country.getText()+"','"+textField_UserName.getText()+"','"+textField_Password.getText()+"');");
	//null_everything();
	
	//INSERT INTO `sj498`.`Members` (`Member_Id`, `FName`, `LName`, `Address1`, `Contact`, `City`, `State`, `PinCode`, `Country`, `UserName`, `Password`) VALUES ('3', 'Mark', 'Santiago', '757 New York Ave', '8523697545', NULL, NULL, NULL, NULL, NULL, NULL);
	Socket socketToServer = new Socket("afsconnect1.njit.edu", 33007);
	//System.out.println("Going to Database");
	ObjectOutputStream myOutputStream = new ObjectOutputStream(socketToServer.getOutputStream());

			ObjectInputStream myInputStream = new ObjectInputStream(socketToServer.getInputStream());

			myOutputStream.writeObject(myObject);

		//	myObject = (DataObjectChild)myInputStream.readObject();
			/*
			//String usr = ;
			//usr.replaceAll("null", "");
		//	textField_2.setText(myObject.getMemberLname());
			//textField_2.setEditable(false);
		//	textField_3.setText(myObject.getMemberAddress1());
			//textField_3.setEditable(false);
		//	textField_4.setText(myObject.getMemberContact());
			//textField_4.setEditable(false);
			   // System.out.println("UserName : " + myObject.getMemberUserName());
		//	System.out.println("Password : " + myObject.getMemberPassword());
		*/
		
		//UPDATE `sj498`.`Members` SET `Address1` = '212 Summit Ave' WHERE `Members`.`Member_Id` = 1;
		
		
		
			
			
			
			//initialize();
		//	null_everything();
			
			
		}catch(Exception e){e.printStackTrace(); System.out.println(e);}
			
		}
		else if(source.equals("Admin Home")){
			//null_everything();
			//textField.setText("");
	
			new Admin_Home();
			frame.dispose();
		}
	}
	
	/*public void null_everything(){
	//textField.setText("");
	textField_1.setText("");
	textField_2.setText("");
	textField_3.setText("");
	textField_4.setText("");
	textField_memid.setText("");
	textField_City.setText("");
	textField_State.setText("");
	textField_Pincode.setText("");
	textField_Country.setText("");
	textField_UserName.setText("");
	textField_Password.setText("");
	}*/
	

}
