package projectApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PassengerDetails {
	
	PassengerDetails() {
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\bg4.jpg"));
		
		
		JLabel title = new JLabel("Add passenger details");
		title.setBounds(100, 40, 330, 50);
		title.setForeground(Color.white);
		title.setFont(new Font("Serif", Font.BOLD, 30));
		background.add(title);
		
		
		JLabel nameLabel = new JLabel("Name"); 
		nameLabel.setBounds(110, 170, 100, 30);
		nameLabel.setForeground(Color.white);
		nameLabel.setFont(new Font("Serif",Font.BOLD,16));
		background.add(nameLabel); 
		
		JTextField name = new JTextField(); 
		name.setBounds(200, 170, 200, 30); 
		background.add(name); 	
		
		
		JLabel numberLabel = new JLabel("Phone Number"); 
		numberLabel.setBounds(90, 230, 100, 30);
		numberLabel.setForeground(Color.white);
		numberLabel.setFont(new Font("Serif",Font.BOLD,16));
		background.add(numberLabel); 			 
		
		JPasswordField number = new JPasswordField(); 
		number.setBounds(200, 230, 200, 30); 
		background.add(number); 
		
		
		
		JLabel genderLabel = new JLabel("Gender"); 
		genderLabel.setBounds(100, 280, 100, 30);
		genderLabel.setForeground(Color.white);
		genderLabel.setFont(new Font("Serif",Font.BOLD,16));
		background.add(genderLabel); 
		
		JRadioButton r1=new JRadioButton("Male");
		r1.setBounds(200,280,70,30);
		
		JRadioButton r2=new JRadioButton("Female");
		r2.setBounds(300,280,70,30);
		
		ButtonGroup buttonGroup = new ButtonGroup();    
		buttonGroup.add(r1);
		buttonGroup.add(r2);    
		background.add(r1);
		background.add(r2); 
		
		
		
		JButton button = new JButton("Next"); 
		button.setBounds(200,350,100,40);
		background.add(button);
		button.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if( (name.getText() != null) && (number.getText() != null) && ( r1.isSelected() || r2.isSelected() ) ) {
					background.setVisible(false);
					new Payment();
				}
				else {
					JOptionPane.showMessageDialog(background, "Please Enter the required Details");
					
				}
				
			}
		});
		
		
		Main.frame.add(background);
		Main.frame.setSize(500,600);
		Main.frame.setResizable(false);
        Main.frame.setVisible(true);
        Main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
