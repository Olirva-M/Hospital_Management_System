package Homes.Features;

import Homes.Registration.hospitalmain.*;
import Homes.Pharmacy.*;
import Homes.Pharmacy.GenPrescription;
import Homes.Features.DoctorFeatures.*;
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
 
public class DoctorLoginProceed {
public DoctorLoginProceed(){System.out.println("Default consssssss");}
	public DoctorLoginProceed(String filename) { 
	
 { 
		JFrame dr=new JFrame("Doctor Login Home");
		dr.setBounds(370, 0,800, 1000);
		JButton bd=new JButton("Generate Prescription");  
		bd.setBounds(70,250,95,30);  
		bd.setSize(300,40);
		bd.setPreferredSize(new Dimension(100, 100));
		bd.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					new Homes.Pharmacy.GenPrescription(filename);
					dr.dispose();
		          			
				}  
		});  
		dr.add(bd);

		JButton ld=new JButton("Generate schedule");
		ld.setBounds(70,300,100, 40);	
		ld.setSize(300,40);
		  
		ld.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					dr.dispose();
		          			GenSchedule gs = new GenSchedule(filename);
				}  
		}); 
		dr.add(ld);

		JButton dho=new JButton("Back to login home");
		dho.setBounds(70,350,100, 40);	
		dho.setSize(300,40);
		  
		dho.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					dr.dispose();
					
				}  
		});  
		dr.add(dho);
		Container cc = dr.getContentPane();
		JLabel label = new JLabel(); //JLabel Creation
        	label.setIcon(new ImageIcon("doc.jpg")); //Sets the image to be displayed as an icon
        	Dimension size = label.getPreferredSize(); //Gets the size of the image
        	label.setBounds(0, -200, 1000, 1000); //Sets the location of the image   
        	cc.add(label);
		cc.setBounds(250, 0, 600, 680); 
		dr.setSize(1000,700);
		dr.setLayout(null); 
		dr.setVisible(true); 
	}  
} 

} 

