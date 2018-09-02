
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class CardLayoutDemo extends JFrame implements ItemListener, ActionListener {
    JPanel cards; //a panel that uses CardLayout
    final static String BUTTONPANEL = "Member of Club";
    final static String TEXTPANEL = "Admin of Club";
	JPanel card1, card2;
	public static String CURRENT_USER;
	JButton Sign_In1, Sign_In2, Sign_Up1, Sign_Up2, Cancel2;
	JTextField usernametext1, passwordtext1;
    
    public void addComponentToPane(Container pane) {
        //Put the JComboBox in a JPanel to get a nicer look.
        JPanel comboBoxPane = new JPanel(); //use FlowLayout
       // String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
		//comboBoxPane.setLayout(new GridBagLayout());
		//GridBagConstraints c = new GridBagConstraints();
		//	c.gridx = 0;
		//	c.gridy = 0;
		//	c.fill = GridBagConstraints.BOTH;
       // JComboBox cb = new JComboBox(comboBoxItems);
		
    //    cb.setEditable(false);
        //cb.addItemListener(this);
      //  comboBoxPane.add(cb, c);
        
        //Create the "cards".
         card1 = new JPanel();
		card1.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		//card1.setLayout(new GridLayout(2,2));//new BoxLayout(card1,BoxLayout.Y_AXIS));
		//card1.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
		 JComboBox cb = new JComboBox(comboBoxItems);
		 cb.setEditable(false);
        cb.addItemListener(this);
		c.gridx = 0;
			c.gridy = 0;
			c.fill = GridBagConstraints.BOTH;
			//c.weighty = 0.2;
			c.insets = new Insets(10,10,0,0);
			JButton Iam1 = new JButton("I Am");
			//Iam.setBorderPainted( false );
	//		Iam.setFocusPainted( false );
			card1.add(Iam1, c);
		//	Iam1.addActionListener(this);
			
		
			c.gridx = 1;
				c.gridy = 0;
				c.fill = GridBagConstraints.BOTH;
				c.insets = new Insets(10,10,0,0);
		 card1.add(cb, c);
			c.gridx = 0;
			c.gridy = 1;
			c.fill = GridBagConstraints.BOTH;
			//c.weighty = 0.2;
			c.insets = new Insets(10,10,0,0);
			JButton user_name1 = new JButton("User Name");
        card1.add(user_name1, c);
		
				c.gridx = 1;
				c.gridy = 1;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2;
				 usernametext1 = new JTextField(20);
		card1.add(usernametext1, c);
				c.gridx = 0;
				c.gridy = 3;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
				c.insets = new Insets(10,10,0,0);
				//JTextField passwordtext1 = new JTextField("",20);
        card1.add(new JButton("Password"),c);
				c.gridx = 1;
				c.gridy = 3;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
				passwordtext1= new JTextField(20);
		card1.add(passwordtext1, c);
		//card1.setPreferredSize(new Dimension(500, 400));
				c.gridx = 0;
				c.gridy = 4;
				c.gridwidth =1;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
				c.insets = new Insets(10,10,0,0);
				JButton Sign_Up1 = new JButton("Sign Up");
		card1.add(Sign_Up1, c);
		Sign_Up1.addActionListener(this);
		
				c.gridx = 1;
				c.gridy = 4;
				c.gridwidth = 1;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
				c.insets = new Insets(10,10,0,0);
				JButton Sign_In1 = new JButton("Sign In");
		card1.add(Sign_In1, c);
        Sign_In1.addActionListener(this);
         card2 = new JPanel();
       
		
		
		
		card2.setLayout(new GridBagLayout());
		
			c.gridx = 0;
			c.gridy = 1;
			c.fill = GridBagConstraints.BOTH;
			//c.weighty = 0.2;
			c.insets = new Insets(10,10,0,0);
        card2.add(new JButton("User Name"), c);
				c.gridx = 1;
				c.gridy = 1;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2;
		card2.add(new JTextField("",20), c);
				c.gridx = 0;
				c.gridy = 3;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
				c.insets = new Insets(10,10,0,0);
        card2.add(new JButton("Password"),c);
				c.gridx = 1;
				c.gridy = 3;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
		card2.add(new JTextField("",20), c);
		//card1.setPreferredSize(new Dimension(500, 400));
				c.gridx = 0;
				c.gridy = 4;
				c.gridwidth =1;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
				c.insets = new Insets(10,10,0,0);
				JButton Sign_Up2 = new JButton("Admin Sign Up");
		card2.add(Sign_Up2, c);
		Sign_Up2.addActionListener(this);
				c.gridx = 1;
				c.gridy = 4;
				c.gridwidth = 0;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
				c.insets = new Insets(10,10,0,0);
				JButton Sign_In2 = new JButton("Admin Sign In");
		card2.add(Sign_In2, c);
		Sign_In2.addActionListener(this);
				c.gridx = 1;
				c.gridy = 5;
				c.gridwidth = 0;
				c.fill = GridBagConstraints.BOTH;
				//c.weighty = 0.2; 
				c.insets = new Insets(10,10,0,0);
				JButton Cancel2 = new JButton("Cancel");
		card2.add(Cancel2, c);
		Cancel2.addActionListener(this);
		
		
		
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);
		//cards.add(comboBoxPane, "ComboBox");
        
		Container temp = new Container();
		//temp.add(comboBoxPane, BorderLayout.NORTH);
		//temp.add(cards, BorderLayout.CENTER);
		pane.add(comboBoxPane, BorderLayout.NORTH);
        pane.add(cards, BorderLayout.CENTER);
		//pane.add(temp, BorderLayout.CENTER);
    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
		//System.out.println((String)evt.getItem());
    }
	
	public void actionPerformed(ActionEvent ae){
		Object source = ae.getActionCommand();
	
	
		//System.out.println(source);
		
		if(ae.getActionCommand().equals("Sign In")) {
			//System.out.println(usernametext1+ "  " +passwordtext1);
			try{
				//System.out.println(usernametext1.getText()+ "  " +passwordtext1.getText());
		member_signIn();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		else if(source.equals("Sign_Up1")){
		//	member_signUp();}
	}
		else if(source.equals("Admin Sign In")){
		admin_signIn();}
		else if(source.equals("Admin Sign_Up2")){
						//admin_signUp();
		}
		else if(source.equals("Cancel2")){
		//card1.setVisible(true);
		        CardLayout cl1 = (CardLayout)(cards.getLayout());
				    cl1.show(cards, BUTTONPANEL);//, "Member of Club");
		 
			
		}
			
			
			
		}
	
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.addComponentToPane(frame.getContentPane());
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
	
public void admin_signIn(){
	String username = "";
	String password = "";
	//CardLayoutDemo cld = new CardLayoutDemo();
	//System.out.println("In Member_Sign in function");
	try{
	username = usernametext1.getText();
	password = passwordtext1.getText();
	DataObject myObject = new DataObject();
	myObject.setQuery("SELECT * FROM Admin");
	Socket socketToServer = new Socket("afsconnect1.njit.edu", 33007);
	
	ObjectOutputStream myOutputStream =
				new ObjectOutputStream(socketToServer.getOutputStream());

			ObjectInputStream myInputStream =
				new ObjectInputStream(socketToServer.getInputStream());

			myOutputStream.writeObject(myObject);

			myObject = (DataObject)myInputStream.readObject();
			String usr = myObject.getAdminUserName();
			//usr.replaceAll("null", "");
			 //   System.out.println("UserName : " + usr.length());
			//System.out.println("Password : " + myObject.getAdminPassword());
			
			if(username.equalsIgnoreCase(myObject.getAdminUserName()) && password.equalsIgnoreCase(myObject.getAdminPassword()))
				System.out.println("Correct Password");
			else
				System.out.println("Incorrect Details");

			myOutputStream.close();
			
			myInputStream.close();

            		socketToServer.close();
					
					
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	System.out.println(username + "\n" + password);
	
}

public void member_signIn(){
	String username = "";
	String password = "";
	//CardLayoutDemo cld = new CardLayoutDemo();
	System.out.println("In Member_Sign in function");
	try{
	username = usernametext1.getText();
	password = passwordtext1.getText();
	DataObject myObject = new DataObject();
	myObject.setQuery("SELECT * FROM Members where UserName ='"+username+"'");
	Socket socketToServer = new Socket("afsconnect1.njit.edu", 33007);
	
	ObjectOutputStream myOutputStream =
				new ObjectOutputStream(socketToServer.getOutputStream());

			ObjectInputStream myInputStream =
				new ObjectInputStream(socketToServer.getInputStream());

			myOutputStream.writeObject(myObject);

			myObject = (DataObject)myInputStream.readObject();
			//String usr = ;
			//usr.replaceAll("null", "");
			    System.out.println("UserName : " + myObject.getMemberUserName());
			System.out.println("Password : " + myObject.getMemberPassword());
			//Member_Home mh;
			if(username.equalsIgnoreCase(myObject.getMemberUserName()) && password.equalsIgnoreCase(myObject.getMemberPassword()))
			{
					CURRENT_USER=myObject.getMemberUserName();
					//dispose();
					dispose();
				new Member_Home();
				//frame.setVisible(false);
			
				//mh.setVisible(true);
				//this.setVisible(false);
				
			}
			else
				System.out.println("Incorrect Details");

			myOutputStream.close();
			
			myInputStream.close();
            		socketToServer.close();
					
					
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	//System.out.println(username + "\n" + password);
	
}
	
}
