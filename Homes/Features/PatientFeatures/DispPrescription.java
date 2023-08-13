package Homes.Features.PatientFeatures;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class DispPrescription extends JFrame{
    private Container c;
    private JLabel title, name, freq, dose;
    String data;
    public DispPrescription(String filename)
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

        setVisible(true);

       try {
           int count=0;
            File fobj = new File(filename);
            Scanner Reader = new Scanner(fobj);
            while (Reader.hasNextLine()){
                name = new JLabel(Reader.nextLine());
                name.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
                name.setSize(200, 200);
                name.setLocation(100, 20+(50*count));
                c.add(name);
                count++;
            }
            Reader.close();
        }
        catch (FileNotFoundException exc) {
	name = new JLabel("Kindly visit doctor to get your prescription");
                name.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
                name.setSize(400, 200);
                name.setLocation(100, 20);
                c.add(name);
        }
    }
}