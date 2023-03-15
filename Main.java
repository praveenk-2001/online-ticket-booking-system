package projectApplication;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	
	static JFrame frame= new JFrame("Panel Example");
	
	public static void main(String[] args) {

		
		//panel.setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\bg.jpg"));		
        
        
		JLabel title = new JLabel("Login");
		title.setBounds(200, 40, 100, 50);
		title.setFont(new Font("Serif", Font.BOLD, 34));
		background.add(title);
		
		JLabel label1 = new JLabel("Username"); 
		label1.setBounds(110, 150, 100, 30);
		label1.setFont(new Font("Serif",Font.BOLD,16));
		background.add(label1); 
		
		JLabel label2 = new JLabel("Password"); 
		label2.setBounds(110, 200, 100, 30);
		label2.setFont(new Font("Serif",Font.BOLD,16));
		background.add(label2); 
		
		 
		
		JTextField t1 = new JTextField(); 
		t1.setBounds(200, 150, 200, 30); 
		background.add(t1); 		 
		
		JPasswordField t2 = new JPasswordField(); 
		t2.setBounds(200, 200, 200, 30); 
		background.add(t2); 
		
		JCheckBox jcb = new JCheckBox("Show Passwords");
	    jcb.addActionListener(ae -> {
	         JCheckBox c = (JCheckBox) ae.getSource();
	         t2.setEchoChar(c.isSelected() ? '\u0000' : (Character)          
	         UIManager.get("PasswordField.echoChar"));
	    });
	    jcb.setBounds(200, 240, 130, 20);
	    background.add(jcb);
		
		 
		
		JButton button = new JButton("Login"); 
		button.setBounds(120,350,100,40); 
		background.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(t1.getText().isEmpty() || t2.getText().isEmpty()) { 
					JOptionPane.showMessageDialog(null, "Please Enter the required Details"); 
				} 
				else {
					
					if(t1.getText().equals(t2.getText())) {
						background.setVisible(false);
						new Homepage();
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Username or Password");
					}
					
					//JOptionPane.showMessageDialog(null, "Logined Successfully"); 
					
					
				}
				
			}
		});
		
		
		
		JButton button1 = new JButton("Exit"); 
		button1.setBounds(250,350,100,40);
		background.add(button1); 
		
		
		button1.addActionListener(new ActionListener() { 
		
		@Override 
		public void actionPerformed(ActionEvent e) { 
			System.exit(0); 
		} 
		
		});
		
		frame.add(background);
		frame.setSize(500,600); 
		frame.setResizable(false);
        //frame.setLayout(null);    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

}
