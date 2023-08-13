package Homes.Features;
import Homes.Pharmacy.*;
import Homes.Features.PatientFeatures.*;
import Homes.Pharmacy.Pharm;
import Homes.Registration.hospitalmain.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.io.*;
import java.util.*;
 
public class PatientLoginProceed {
	public PatientLoginProceed(String filename) { 
	
 { 
		JFrame pr=new JFrame("Patient Login Home");
		pr.setBounds(400, 0,800, 1000);
		JButton b=new JButton("View Prescription");  
		b.setBounds(270,250,95,30);  
		b.setSize(280,40);
		//b.setPreferredSize(new Dimension(100, 100));
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					//pr.dispose();
		          			new DispPrescription(filename);
				}  
		});  
		pr.add(b);

		JButton lp=new JButton("Visit Pharmacy");
		lp.setBounds(270,300,100, 40);	
		lp.setSize(280,40);
		  
		lp.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					//pr.dispose();
					Pharm ph = new Pharm();
				}  
		});  
		pr.add(lp);

		JButton pho=new JButton("Back to login home");
		pho.setBounds(270,350,100, 40);	
		pho.setSize(280,40);
		  
		pho.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					pr.dispose();
					
				}  
		});  
		pr.add(pho);
		Container cc = pr.getContentPane();   

        	JLabel label = new JLabel(); //JLabel Creation
        	label.setIcon(new ImageIcon("pres.jpg")); //Sets the image to be displayed as an icon
        	Dimension size = label.getPreferredSize(); //Gets the size of the image
        	label.setBounds(0, -200, 9500, 1000); //Sets the location of the image
 
    		cc.add(label);
		cc.setBounds(250, 0, 700, 700); 
		pr.setSize(850,600);
		pr.setLayout(null); 
		pr.setVisible(true); 
	}  
} 
} 

