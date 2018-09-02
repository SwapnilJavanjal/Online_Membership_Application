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

public class Member_Home extends JFrame implements ActionListener{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member_Home window = new Member_Home();
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
	public Member_Home() {
	//	System.out.println("In Member Home Page");
		initialize();
		setTitle("Member_Home");
	
		
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
			//System.out.println("Initialized function");
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
		c.insets = new Insets(0, 0, 25, 0);
		JButton btnNewButton = new JButton("Search Member");
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		//c.weighty = 0.2;
		//c.insets = new Insets(10,10,0,0);
		panel.add(btnNewButton, c);
		btnNewButton.addActionListener(this);
		
		JButton btnEditProfile = new JButton("Edit Profile");
		GridBagConstraints gbc_btnEditProfile = new GridBagConstraints();
		gbc_btnEditProfile.anchor = GridBagConstraints.SOUTH;
		gbc_btnEditProfile.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditProfile.gridx = 0;
		gbc_btnEditProfile.insets = new Insets(0, 0, 25, 0);
		gbc_btnEditProfile.gridy = 3;
		panel.add(btnEditProfile, gbc_btnEditProfile);
		btnEditProfile.addActionListener(this);
		//setVisible(true);
		
		
		JButton btnLogOut = new JButton("Log Out");
		GridBagConstraints gbc_btnbtnLogOut = new GridBagConstraints();
		gbc_btnbtnLogOut.insets = new Insets(0, 0, 25, 0);
		gbc_btnbtnLogOut.anchor = GridBagConstraints.SOUTH;
		gbc_btnbtnLogOut.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnbtnLogOut.gridx = 0;
		gbc_btnbtnLogOut.gridy = 5;
		panel.add(btnLogOut, gbc_btnbtnLogOut);
		btnLogOut.addActionListener(this);
		
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		Object source = ae.getActionCommand();
		
		if(source.equals("Search Member")){
		//	dispose();
		try{
		frame.dispose();
			new Search_Member();
		}catch(Exception e){System.out.println(e);}
			
		}
		else if(source.equals("Edit Profile")){
			//new Edit_Member();
			try{
		frame.dispose();
		new Edit_Member();
		}catch(Exception e){System.out.println(e);}
			
		}
			else if(source.equals("Log Out")){
				System.exit(0);
				
		}
	}

}
