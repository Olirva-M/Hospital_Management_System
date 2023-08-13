package Homes.Features.PatientFeatures;
import Homes.Features.PatientLoginProceed;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class DispSchedule extends JFrame{
    private Container c;
    private JLabel title, name, freq, dose;
    String data;
    public DispSchedule(String filename)
    {
        setTitle("Prescription");
        setBounds(250, 0, 600, 680);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Your Prescription");
        title.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
        title.setSize(300, 35);
        title.setLocation(145, 30);
        c.add(title);

        JButton but=new JButton("Back to patient home");
        but.setBounds(270,350,100, 40);  
        but.setSize(280,40);
          
        but.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                    pr.dispose();
                    PatientLoginProceed pat = new PatientLoginProceed();
                }  
        });  
        pr.add(but);

        setVisible(true);

       try {
           int count=0;
            File fobj = new File(filename);
            Scanner Reader = new Scanner(fobj);
            while (Reader.hasNextLine()){
                name = new JLabel(Reader.nextLine().trim());
                name.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
                name.setSize(500, 200);
                name.setLocation(100, 20+(20*count));
                c.add(name);
                count++;
            }
            Reader.close();
        }
        catch (FileNotFoundException exc) {
            System.out.println("An error has occurred while trying to read from file: "+exc);
        }
    }
}



class j
{
	public static void main(String args[])
	{
		new DispSchedule("Homes/sampleSchedule.txt");
	}
}
