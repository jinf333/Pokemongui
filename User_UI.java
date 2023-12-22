package Assignment;

import java.awt.BorderLayout; 
import java.awt.GridLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 

import javax.swing.JTextField;

public class User_UI extends JFrame implements ActionListener { 
	JPanel panel; 
	JLabel user_label, disk1_label,disk2_label, message; 
	JTextField userName_text; JTextField disk_text1; JTextField disk_text2;
	JButton submit; 
	
	User_UI() { 
		setTitle("User Login"); 

		user_label = new JLabel(); 
		user_label.setText("User Name :"); 
		userName_text = new JTextField(); 

		submit = new JButton("SUBMIT"); 
		panel = new JPanel(new GridLayout(2, 1)); 
		panel.add(user_label); panel.add(userName_text); 

		message = new JLabel(); 
		panel.add(message); 
		panel.add(submit); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
		submit.addActionListener(this); 
		add(panel, BorderLayout.CENTER); 
		
		setSize(400, 100);
	    setLocationRelativeTo(null); 
		setVisible(true); 
		
		}		
	
	public static void main(String[] args) { 
		new User_UI(); 
		} 
	
	
	public void actionPerformed(ActionEvent ae) {
	    String userName = userName_text.getText();

	        this.dispose();
	    	new Option_UI(userName);
	}
}

