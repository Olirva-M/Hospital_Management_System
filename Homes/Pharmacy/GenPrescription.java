package Homes.Pharmacy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class DispPrescription extends JFrame{
    private Container c;
    private JLabel title, name, freq, dose;

    String data;
    DispPrescription(String filename)
    {
        setTitle("Prescription");
        setBounds(250, 0, 600, 680);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Prescription");
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
                name.setSize(800, 200);
                name.setLocation(100, 50+(50*count));
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

public class GenPrescription extends JFrame implements ActionListener{
    private Container c;
    private JLabel title;
    private JLabel name, patId;
    private JTextField tname;
    private JLabel freq;
    private JTextField tfreq;
    private JLabel dose;
    private JCheckBox Afternoon;
    private JCheckBox Day;
    private JCheckBox Night;
    private JButton enter, presc;
    private JButton clear;
    private  String filename;
	private JTextField tpatId;

    public GenPrescription(String filename)
    {
	this.filename = filename;
        setTitle("Prescription");
        setBounds(250, 0, 600, 680);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("New Prescription");
        title.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
        title.setSize(300, 35);
        title.setLocation(145, 10);
        c.add(title);

		patId = new JLabel("Patient ID ");
		patId.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		patId.setSize(100, 100);
		patId.setLocation(100, 20);
		c.add(patId);

		tpatId = new JTextField();
		tpatId.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tpatId.setSize(150, 20);
		tpatId.setLocation(250, 60);
		c.add(tpatId);

        name = new JLabel("Medicine name");
        name.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        name.setSize(200, 200);
        name.setLocation(100, 20);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        tname.setSize(150, 20);
        tname.setLocation(250, 110);
        c.add(tname);

        freq = new JLabel("Frequency");
        freq.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        freq.setSize(100, 200);
        freq.setLocation(100, 70);
        c.add(freq);

        tfreq = new JTextField();
        tfreq.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        tfreq.setSize(150, 20);
        tfreq.setLocation(250, 160);
        c.add(tfreq);

        dose = new JLabel("Doses");
        dose.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        dose.setSize(100, 200);
        dose.setLocation(100, 120);
        c.add(dose);

        Day = new JCheckBox("Morning");
        Day.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        Day.setSize(90, 20);
        Day.setLocation(250, 210);
        c.add(Day);

        Afternoon = new JCheckBox("Afternoon");
        Afternoon.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        Afternoon.setSize(105, 20);
        Afternoon.setLocation(340, 210);
        c.add(Afternoon);

        Night = new JCheckBox("Night");
        Night.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        Night.setSize(75, 20);
        Night.setLocation(445, 210);
        c.add(Night);

        enter = new JButton("Enter");
        enter.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        enter.setSize(100, 20);
        enter.setLocation(150, 260);
        enter.addActionListener(this);
        c.add(enter);

        clear = new JButton("Clear");
        clear.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        clear.setSize(150, 20);
        clear.setLocation(270, 260);
        clear.addActionListener(this);
        c.add(clear);

        presc = new JButton("Generate prescription");
        presc.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
        presc.setSize(200, 20);
        presc.setLocation(180, 310);
        presc.addActionListener(this);
        c.add(presc);

        setVisible(true);

    }


    public void actionPerformed(ActionEvent e)
    {
filename = tpatId.getText()+".txt";
        if (e.getSource() == enter) {
            String text = tname.getText() + " - "+tfreq.getText() + " - ";
            if (Day.isSelected())
                text += " Morning ";
            if (Afternoon.isSelected())
                text += " Noon ";
            if (Night.isSelected())
                text += " Night";
            text += "\n";

           // String username = "PrescriptionFile";
           // prescname = "C:/Users/olirv/Desktop/Homes/Features/PrecriptionFile.txt";
            File file = new File(filename);
            boolean result;
            try
            {
                result = file.createNewFile();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                    if(writer == null) throw new IOException("FAILED");
                    writer.write(text);
                    writer.close();
                }
                catch (IOException exc) {
                    System.out.println("Exception Occurred while trying to write in file" + exc);
                }

            }
            catch (IOException exc){
                exc.printStackTrace();
            }
        }

        else if (e.getSource() == clear) {
            String def = "";
            tname.setText(def);
            tfreq.setText(def);
            Afternoon.setSelected(false);
            Day.setSelected(false);
            Night.setSelected(false);
        }

        else if (e.getSource() == presc){
            System.out.println("Generating Prescription");
            new DispPrescription(filename);
        }
    }


}