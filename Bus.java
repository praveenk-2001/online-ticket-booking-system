package projectApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Bus {
	
	Bus() {
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\bg3.jpg"));
		
		
		JLabel title = new JLabel("Place of Transport");
		title.setBounds(100, 40, 300, 50);
		title.setForeground(Color.white);
		title.setFont(new Font("Serif", Font.BOLD, 34));
		background.add(title);
		
		JLabel label1 = new JLabel("From"); 
		label1.setBounds(150, 170, 100, 30);
		label1.setFont(new Font("Serif", Font.BOLD, 20));
		background.add(label1); 
		
		JLabel label2 = new JLabel("To"); 
		label2.setBounds(150, 220, 100, 30); 
		label2.setFont(new Font("Serif", Font.BOLD, 20));
		background.add(label2);
		
		
		String country[]={"Ariyalur","Chennai","Coimbatore","Dindigul","Erode","Kanchipuram","Kanniyakumari","Karur","Madurai","Namakkal","Pudukkottai","Ramanathapuram","Salem","Thanjavur","Theni","Thoothukudi","Tiruchirappalli","Tirunelveli","Tiruppur","Vellore","Viluppuram","Virudhunagar"};        
	    
		JComboBox<?> from=new JComboBox<>(country);    
		from.setBounds(230, 180, 100, 20);    
		background.add(from); 
		        
	    JComboBox<?> destination=new JComboBox<>(country);    
	    destination.setBounds(230, 230, 100, 20);    
	    background.add(destination);
	    
	    
	    JButton button = new JButton("Next"); 
		button.setBounds(200, 350, 100, 40);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(from.getSelectedItem().equals(destination.getSelectedItem())) {
					JOptionPane.showMessageDialog(background, "Please Enter different locations");
					background.setVisible(false);
					new Bus();
				}
				else {
					background.setVisible(false);
					new PassengerDetails();
				}
				
			}
		}
		);
		background.add(button); 		
		
		
		
		JButton exit = new JButton("Exit");
		exit.setBounds(190, 440, 120, 30);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		background.add(exit);
		
		
		
		Main.frame.add(background);
		Main.frame.setSize(500,600);
		Main.frame.setResizable(false);
        Main.frame.setVisible(true);
        Main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}