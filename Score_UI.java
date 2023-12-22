package Assignment;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Score_UI extends JFrame implements ActionListener {
    private String username;
    private JButton back;

    Score_UI(String username) {
            this.username = username;
            this.setTitle("Result");

            JTextArea textArea = displayDataFromFile();
            JScrollPane sp = new JScrollPane(textArea);

            back = new JButton("Back");
            back.addActionListener(this);

            JPanel panel = new JPanel(new BorderLayout());
            panel.add(sp, BorderLayout.CENTER);
            panel.add(back, BorderLayout.SOUTH);
            
            add(panel);
            // setExtendedState(JFrame.MAXIMIZED_BOTH);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); 
            setVisible(true);
            // displayDataFromFile();
            setSize(500, 350);

        }

        private JTextArea displayDataFromFile() {
            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);

            String fileName = "result.txt";
            File file = new File(fileName);

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n"); // Append each line to the JTextArea
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error reading the file.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            return textArea;
        }
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == back) {
     
                this.dispose();
                new Option_UI(username); // Pass the username to Option_UI
            }
        }
}
