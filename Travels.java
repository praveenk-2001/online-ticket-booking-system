package projectApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Travels {
	
	Travels() {
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\bg1.jpg"));
		
		
		JLabel title = new JLabel("Mode of Transport");
		title.setBounds(100, 40, 300, 50);
		title.setForeground(Color.white);
		title.setFont(new Font("Serif", Font.BOLD, 34));
		background.add(title);
		
		
		JButton bus = new JButton(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\bus1.jpg"));
		bus.setBounds(30, 200, 100, 100);
		bus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				background.setVisible(false);
				new Bus();
				
			}
		});
		background.add(bus);	
		
		JLabel busLabel = new JLabel("Bus");
		busLabel.setBounds(30, 300, 100, 30);
		busLabel.setFont(new Font("Serif", Font.BOLD, 16));
		busLabel.setForeground(Color.white);
		background.add(busLabel);
		
		JButton cab = new JButton(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\train.jpg"));
		cab.setBounds(190, 200, 100, 100);
		background.add(cab);
		
		JLabel cabLabel = new JLabel("Train");
		cabLabel.setBounds(220, 300, 100, 30);
		cabLabel.setFont(new Font("Serif", Font.BOLD, 16));
		cabLabel.setForeground(Color.white);
		background.add(cabLabel);
		
		JButton travels = new JButton(new ImageIcon("C:\\Users\\praveen.karikalan\\Downloads\\flight.png"));
		travels.setBounds(350, 200, 100, 100);
		background.add(travels);
		
		JLabel travelsLabel = new JLabel("Flight");
		travelsLabel.setBounds(370, 300, 100, 30);
		travelsLabel.setFont(new Font("Serif", Font.BOLD, 16));
		travelsLabel.setForeground(Color.white);
		background.add(travelsLabel);
		
		
		
		JButton exit = new JButton("Exit");
		exit.setBounds(170, 460, 120, 30);
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
