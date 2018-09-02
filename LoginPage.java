
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class LoginPage implements ItemListener {
    JPanel cards; //a panel that uses CardLayout
    final static String BUTTONPANEL = "Member";
    final static String TEXTPANEL = "Admin";
    
    public void addComponentToPane(Container pane) {
        //Put the JComboBox in a JPanel to get a nicer look.
		JPanel mainPanel = new JPanel();
  mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JPanel comboBoxPane = new JPanel(); //use FlowLayout
        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
        JComboBox cb = new JComboBox(comboBoxItems);
			cb.setBounds(850, 356, 240, 45);
			comboBoxPane.setLayout(null);
        cb.setEditable(false);
		//comboBoxPane.setPreferredSize(new Dimension(60,60));
		//cb.setPreferredSize(new Dimension(100,60));
		//comboBoxPane.setLocation(400,460);
		
		//comboBoxPane.setVisible(true);
	
	//cb.setLocation(632, 490);
		//comboBoxPane.setLocationRelativeTo(null);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
        cb.setVisible(true);
		
		
		
        //Create the "cards".
		JButton SignIn = new JButton("Sign In");
        JPanel card1 = new JPanel();
		card1.setLayout(null);
		SignIn.setBounds(631, 493, 200, 60);
		//SignIn.setLocation(632, 490);
       // card1.add(SignIn);
		JButton Cancel = new JButton("Cancel");
		Cancel.setBounds(1091, 493, 200, 60);
        card1.add(Cancel);
		
		JButton SignUp = new JButton("Sign Up");
		SignUp.setBounds(805, 596, 319, 60);
        card1.add(SignUp);
        
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);
		//cards.add(comboBoxPane, "Combo");
		
			//cb.setVisible(true);
			//cb.requestFocus();
			//comboBoxPane.requestFocus();
        
        //pane.add(comboBoxPane, BorderLayout.CENTER);
		
	
		
		//pane.add(comboBoxPane);
		//comboBoxPane.setVisible(true);
        pane.add(cards, BorderLayout.CENTER);
		pane.add(comboBoxPane, BorderLayout.SOUTH);
		comboBoxPane.setVisible(true);
		//pane.add(cards, null);
			//pane.add(comboBoxPane, null);
			//mainPanel.add(comboBoxPane);
			
			//mainPanel.add(cards);
			//comboBoxPane.setVisible(true);
			//pane.add(cards, null);
			//pane.add(mainPanel, null);
	  // cb.setVisible(true);
	   //cb.requestFocus();
		//	comboBoxPane.requestFocus();
	   //Panel.add(cards);

    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI(){//throws Exception{
        //Create and set up the window.
        final JFrame frame = new JFrame("LoginPage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(200, 120);
      //  frame.setLocation(SwingConstants.CENTER,SwingConstants.CENTER);



        //Create and set up the content pane.
        LoginPage demo = new LoginPage();
        demo.addComponentToPane(frame.getContentPane());
        
        //Display the window.
        frame.pack();
		
		//frame.setSize(1800, 1550);
        frame.setVisible(true);
	//	frame.setLocationRelativeTo(null);
			    /*GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
				try{
				gd.setFullScreenWindow(this);
				}
				catch{
					  System.out.println("In catch block");
				}finally{
					gd.setFullScreenWindow(this);
				}*/
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
}
