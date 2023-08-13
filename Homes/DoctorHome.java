package Homes;
import Homes.Registration.*;
import Homes.Login.*;
import java.awt.*;
import java.awt.event.*; 
//import hospitalmain.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class DoctorHome{
	public DoctorHome() { 
		JFrame f=new JFrame("Doctor Home");
		f.setBounds(400, 0,800, 1000);
		JButton s=new JButton("Sign up");  
		s.setBounds(350,560,95,30);  
		s.setSize(100,40);
		s.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					f.dispose();
		          			DoctorRegistration cl = new DoctorRegistration();
				}  
		});  
		f.add(s);

		JButton l=new JButton("Login");
		l.setBounds(550,560,100, 40);	
		l.setSize(100,40); 
		l.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					f.dispose();
		          			DoctorLogin cl = new DoctorLogin();
				}  
		});  
		f.add(l);
		
		    Container c = f.getContentPane(); //Gets the content layer
        	JLabel label = new JLabel(); //JLabel Creation
        	label.setIcon(new ImageIcon("1n.png")); //Sets the image to be displayed as an icon
        	Dimension size = label.getPreferredSize(); //Gets the size of the image
        	label.setBounds(0, -200, 1000, 1000); //Sets the location of the image

        JButton hd=new JButton("Back to Home");
		hd.setBounds(420,620,100, 40);	
		hd.setSize(200,40);
		  
		hd.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					f.dispose();
		          			
				}  
		});  
		f.add(hd);


 
    		c.add(label);
		f.setSize(1000,700);
		f.setLayout(null); 
		f.setVisible(true); 
	}  
}  