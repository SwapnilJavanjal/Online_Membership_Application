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

public class Admin_Home extends JFrame implements ActionListener{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Home window = new Admin_Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Home() {
		//System.out.println("In Admin Home Page");
		initialize();
		setTitle("Admin_Home");
	
		
		/*		try {
					Member_Home window = new Member_Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}*/
				
			
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//	System.out.println("Initialized function");
		frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  frame.setSize(screenSize.width, screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.NORTH;
		c.insets = new Insets(0, 0, 15, 0);
		JButton btnNewButton = new JButton("View Details");
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		//c.weighty = 0.2;
		//c.insets = new Insets(10,10,0,0);
		panel.add(btnNewButton, c);
		btnNewButton.addActionListener(this);
		
		JButton btnEditProfile = new JButton("Modify Record");
		GridBagConstraints gbc_btnEditProfile = new GridBagConstraints();
		gbc_btnEditProfile.insets = new Insets(0, 0, 15, 0);
		gbc_btnEditProfile.anchor = GridBagConstraints.SOUTH;
		gbc_btnEditProfile.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditProfile.gridx = 0;
		gbc_btnEditProfile.gridy = 1;
		panel.add(btnEditProfile, gbc_btnEditProfile);
		btnEditProfile.addActionListener(this);
		//setVisible(true);
		//frame.setVisible(true);
		
		JButton btnInsertRecord = new JButton("Insert Record");
		GridBagConstraints gbc_btnInsertRecord = new GridBagConstraints();
		gbc_btnInsertRecord.insets = new Insets(0, 0, 15, 0);
		gbc_btnInsertRecord.anchor = GridBagConstraints.SOUTH;
		gbc_btnInsertRecord.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInsertRecord.gridx = 0;
		gbc_btnInsertRecord.gridy = 3;
		panel.add(btnInsertRecord, gbc_btnInsertRecord);
		btnInsertRecord.addActionListener(this);
		//setVisible(true);
		
		JButton btnDeleteRecord = new JButton("Delete Record");
		GridBagConstraints gbc_btnDeleteRecord = new GridBagConstraints();
		gbc_btnDeleteRecord.insets = new Insets(0, 0, 15, 0);
		gbc_btnDeleteRecord.anchor = GridBagConstraints.SOUTH;
		gbc_btnDeleteRecord.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDeleteRecord.gridx = 0;
		gbc_btnDeleteRecord.gridy = 4;
		panel.add(btnDeleteRecord, gbc_btnDeleteRecord);
		btnDeleteRecord.addActionListener(this);
		
		
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae){
		Object source = ae.getActionCommand();
		
		if(source.equals("View Details")){
		//	dispose();
		try{
		frame.dispose();
			new Admin_Search_Member();
		}catch(Exception e){System.out.println(e);}
			
		}
		else if(source.equals("Modify Record")){
			//new Edit_Member();
			try{
		frame.dispose();
		new Admin_Modify_Member();
		}catch(Exception e){System.out.println(e);}
			
		}
		else if(source.equals("Insert Record")){
			//new Edit_Member();
			try{
		frame.dispose();
		new Admin_Member_Insert();
		}catch(Exception e){System.out.println(e);}
		}
			else if(source.equals("Delete Record")){
				//new Edit_Member();
				try{
			frame.dispose();
			new Admin_Member_Delete();
			}catch(Exception e){System.out.println(e);}
				
				
		}
	}

}
