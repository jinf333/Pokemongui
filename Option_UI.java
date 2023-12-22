package Assignment;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Option_UI extends JFrame implements ActionListener{
    
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    public String username;
    private JLabel UserLabel = null;
    private ButtonGroup bg = null;
    private JButton optionSubmit = null;
    private JPanel optionPanel = null;
    
    public Option_UI(String username){    
        this.username = username; // store the username
        
        this.setTitle("choose action");
        // Content
        UserLabel = new JLabel();
        UserLabel.setText(" Hello " + username + "");
        bg = new ButtonGroup();
        // Add the radio buttons to the button group
        rb1 = new JRadioButton("Battle", true);
        rb2 = new JRadioButton("PokeDex", false);
        rb3 = new JRadioButton("Display File", false);
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        // Add "SUBMIT" button
        optionSubmit = new JButton("SUBMIT");

        // Add to the panel and frame
        optionPanel = new JPanel(new GridLayout(5, 1));
        optionPanel.add(UserLabel);
        optionPanel.add(rb1);
        optionPanel.add(rb2);
        optionPanel.add(rb3);
        optionPanel.add(optionSubmit);        
        add(optionPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        optionSubmit.addActionListener(this); 
        // Set the size and visibility  
        setSize(400, 200);
        setLocationRelativeTo(null); // set location to middle
        setVisible(true);
    }    
    
    public void actionPerformed(ActionEvent ae) {
        // Handle the action when the "SUBMIT" button is clicked
        if (rb1.isSelected()) {// User chose "Battle"
            this.dispose();
            ChooseStage_UI stage = new ChooseStage_UI(username);

        } else if (rb2.isSelected()) {// User chose "PokeDex"
            this.dispose();
            new Pokedex_UI(username);
        } else if (rb3.isSelected()){
            this.dispose();
            new Score_UI(username);
        
    }
}
}