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
		
		
		/*JLabel paymentPanel = new JLabel(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\white.jpg"));
		paymentPanel.setBounds(150, 160, 300, 350);*/
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(150, 160, 300, 350);
		panel.setBackground(Color.white); 
		panel.setLayout(null);
		background.add(panel);
		
		
		JLabel text = new JLabel("Select a payment method");
		text.setBounds(80, 125, 180, 30);
		panel.add(text);
		
		
		JLabel paymentLabel = new JLabel();
		paymentLabel.setBounds(80, 20, 160, 20);
		paymentLabel.setFont(new Font("Serif", Font.BOLD, 20));
		paymentLabel.setVisible(false);
		panel.add(paymentLabel);
		
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(20, 70, 100, 20);
		nameLabel.setVisible(false);
		panel.add(nameLabel);
		
		JTextField nameText = new JTextField();
		nameText.setBounds(120, 70, 100, 20);
		nameText.setVisible(false);
		panel.add(nameText);
		
		JLabel upiIDLabel = new JLabel("UPI ID: ");
		upiIDLabel.setBounds(20, 110, 100, 20);
		upiIDLabel.setVisible(false);
		panel.add(upiIDLabel);
		
		JTextField upiText = new JTextField();
		upiText.setBounds(120, 110, 100, 20);
		upiText.setVisible(false);
		panel.add(upiText);
		
		JLabel numberLabel = new JLabel("Card Number: ");
		numberLabel.setBounds(20, 110, 100, 20);
		numberLabel.setVisible(false);
		panel.add(numberLabel);
		
		JTextField numberText = new JTextField();
		numberText.setBounds(120, 110, 100, 20);
		numberText.setVisible(false);
		panel.add(numberText);
		
		JLabel phnumberLabel = new JLabel("Phone Number: ");
		phnumberLabel.setBounds(20, 110, 100, 20);
		phnumberLabel.setVisible(false);
		panel.add(phnumberLabel);
		
		JTextField phnumberText = new JTextField();
		phnumberText.setBounds(120, 110, 100, 20);
		phnumberText.setVisible(false);
		panel.add(phnumberText);
		
		JLabel ccvLabel = new JLabel("CCV: ");
		ccvLabel.setBounds(20, 150, 100, 20);
		ccvLabel.setVisible(false);
		panel.add(ccvLabel);
		
		JTextField ccvText = new JTextField();
		ccvText.setBounds(120, 150, 100, 20);
		ccvText.setVisible(false);
		panel.add(ccvText);
		
		JLabel dateLabel = new JLabel("Expiry Date: ");
		dateLabel.setBounds(20, 190, 100, 20);
		dateLabel.setVisible(false);
		panel.add(dateLabel);
		
		
		
				
		
		
		JButton card = new JButton("Card");
		card.setBounds(20, 160, 100, 30);
		card.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				paymentLabel.setText("Card Payment");
				paymentLabel.setVisible(true);
				
				text.setVisible(false);
				
				nameLabel.setVisible(true);
				nameText.setVisible(true);
				
				numberLabel.setVisible(true);
				numberText.setVisible(true);
				
				ccvLabel.setVisible(true); 
				ccvText.setVisible(true);
				
				dateLabel.setVisible(true);
				
				upiIDLabel.setVisible(false);
				
				phnumberLabel.setVisible(false);
				
				JButton next = new JButton("Next");
				next.setBounds(80, 280, 80, 30);
				panel.add(next);
				next.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
					}
				});				
				
			}
		});
		background.add(card);
		
		JButton upi = new JButton("UPI");
		upi.setBounds(20, 230, 100, 30);
		upi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				paymentLabel.setText("UIP Payment");
				paymentLabel.setVisible(true);
				
				text.setVisible(false);
				
				upiIDLabel.setVisible(true);
				
				upiText.setVisible(true);
				
				numberLabel.setVisible(false);
				
				nameLabel.setVisible(false);
				nameText.setVisible(false);
				
				ccvLabel.setVisible(false);
				
				dateLabel.setVisible(false);
				
				phnumberLabel.setVisible(true);
				phnumberLabel.setBounds(20, 150, 100, 20);
				
				phnumberText.setVisible(true);
				phnumberText.setBounds(120, 150, 100, 20);
				
			}
		});
		background.add(upi);
		
		JButton cob = new JButton("CoB");
		cob.setBounds(20, 300, 100, 30);
		cob.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				paymentLabel.setText("Cash on Boarding");
				paymentLabel.setVisible(true);
				
				text.setVisible(false);
				
				upiIDLabel.setVisible(false);
				
				numberLabel.setVisible(false);
				numberLabel.setVisible(false);
				
				nameLabel.setVisible(false);
				nameText.setVisible(false);
				
				ccvLabel.setVisible(false);
				ccvText.setVisible(false);
				
				dateLabel.setVisible(false);
				
				phnumberLabel.setVisible(true);
				phnumberLabel.setBounds(20, 110, 100, 20);
				
				phnumberText.setVisible(true);
				phnumberText.setBounds(120, 110, 100, 20);
				
				
			}
		});
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
		
		//background.add(paymentPanel);
		
		Main.frame.add(background);
		Main.frame.setSize(500,600);
		Main.frame.setResizable(false);
        Main.frame.setVisible(true);
        Main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}