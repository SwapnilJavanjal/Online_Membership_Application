import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
 
public class TestLayoutManager {
    JFrame frame = new JFrame();
    JPanel nPanel = new JPanel();
    JTextField textfield = new JTextField(15);
    JButton btnAdd = new JButton("Add");
    JComboBox<String> comboBox = new JComboBox<String>();
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
    JButton btnRemove = new JButton("Remove");
 
    public TestLayoutManager() {
        comboBox.setModel(model);
        btnAdd.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addElement(textfield.getText());
            }
        });
 
        nPanel.add(textfield);
        nPanel.add(btnAdd);
        nPanel.add(comboBox);
        nPanel.add(btnRemove);
        frame.add(nPanel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                new TestLayoutManager();
            }
        });
    }
 
}