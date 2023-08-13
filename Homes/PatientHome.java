package Homes;
import Homes.Registration.*;
import Homes.Login.*;
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
import java.io.*;
import java.util.*;
public class PatientHome {
	public PatientHome() { 
 { 
		JFrame fp=new JFrame("Patient Home");
		fp.setBounds(400, 0,800, 1000);
		JButton b=new JButton("Sign up");  
		b.setBounds(450,500,95,30);  
		b.setSize(100,40);
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					fp.dispose();
		          			PatientRead cp = new PatientRead();
				}  
		});  
		fp.add(b);

		JButton lp=new JButton("Login");
		lp.setBounds(450,550,100, 40);	
		lp.setSize(100,40);
		  
		lp.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					fp.dispose();
		          			PatientLogin cp = new PatientLogin();
				}  
		});  
		fp.add(lp);

		JButton h=new JButton("Back to Home");
		h.setBounds(420,620,100, 40);	
		h.setSize(200,40);
		  
		h.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					fp.dispose();
		          			
				}  
		});  
		fp.add(h);

		Container cc = fp.getContentPane();  
		JLabel label = new JLabel(); //JLabel Creation
        	label.setIcon(new ImageIcon("pbg1.jpg")); //Sets the image to be displayed as an icon
        	Dimension size = label.getPreferredSize(); //Gets the size of the image
        	label.setBounds(0, -200, 1000, 1000); //Sets the location of the image
        	cc.add(label); 
		cc.setBounds(250, 0, 600, 680); 
		fp.setSize(1000,700);
		fp.setLayout(null); 
		fp.setVisible(true); 
	}  
} 
} 
