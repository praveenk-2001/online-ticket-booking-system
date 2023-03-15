package projectApplication;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Payment {
	
	static JLabel background=new JLabel(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\bg4.jpg"));
	
	Payment() {
		
				
		JLabel title = new JLabel("Payment details");
		title.setBounds(130, 40, 330, 50);
		title.setForeground(Color.white);
		title.setFont(new Font("Serif", Font.BOLD, 30));
		background.add(title);
		
		
		JLabel paymentPanel = new JLabel(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\white.jpg"));
		paymentPanel.setBounds(150, 160, 300, 350);
		background.add(paymentPanel);
		
		JLabel text = new JLabel("Select a payment method");
		text.setBounds(80, 125, 180, 30);
		paymentPanel.add(text);
		
		
		JButton card = new JButton("Card");
		card.setBounds(20, 160, 100, 30);
		card.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JLabel cardPanel = new JLabel();
				cardPanel.setBackground(Color.white);
				cardPanel.setBounds(50, 160, 200, 300);
				
				background.add(cardPanel);
				
			}
		});
		
		background.add(card);
		
		JButton upi = new JButton("UPI");
		upi.setBounds(20, 230, 100, 30);
		background.add(upi);
		
		JButton cob = new JButton("CoB");
		cob.setBounds(20, 300, 100, 30);
		background.add(cob);
		
		
		JButton exit = new JButton("Exit");
		exit.setBounds(20, 470, 100, 30);
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
