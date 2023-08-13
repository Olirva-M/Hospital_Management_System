package Homes.Features.DoctorFeatures;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class GenSchedule extends JFrame implements ActionListener {
	private Container c;
	private JLabel title, mon, tue, wed, thur, fri, sat, sun;
	private JComboBox tmon1, tmon2, tmon3, ttue1, twed1, tthur1, tfri1, tsat1, tsun1,  ttue2, twed2, tthur2, tfri2, tsat2, tsun2,  ttue3, twed3, tthur3, tfri3, tsat3, tsun3;
	private JButton sub;
	private JButton reset;
	private String filename;
	private String period[] = { " ", "8am - 9am", "9am - 10am", "11am - 12pm", "1pm - 2pm", "2pm - 3pm",
			"3pm - 4pm", "4pm - 5pm", "5pm - 6pm", "7pm - 8pm", "8pm - 9pm", "9pm - 10pm" };

	public GenSchedule(String filename)
	{
		this.filename =filename;
		setTitle("Create Schedule");
	 	setBounds(450, 0,800, 1000);
	 	setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Schedule for this week");
		title.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
		title.setSize(300, 35);
		title.setLocation(270, 30);
		c.add(title);

		mon = new JLabel("Monday");
		mon.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		mon.setSize(100, 200);
		mon.setLocation(100, 20);
		c.add(mon);

		tmon1 = new JComboBox(period);
		tmon1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tmon1.setSize(150, 20);
		tmon1.setLocation(250, 110);
		c.add(tmon1);

		tmon2 = new JComboBox(period);
		tmon2.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tmon2.setSize(150, 20);
		tmon2.setLocation(400, 110);
		c.add(tmon2);

		tmon3 = new JComboBox(period);
		tmon3.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tmon3.setSize(150, 20);
		tmon3.setLocation(550, 110);
		c.add(tmon3);

		tue = new JLabel("Tuesday");
		tue.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tue.setSize(100, 200);
		tue.setLocation(100, 70);
		c.add(tue);

		ttue1 = new JComboBox(period);
		ttue1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		ttue1.setSize(150, 20);
		ttue1.setLocation(250, 160);
		c.add(ttue1);

		ttue2 = new JComboBox(period);
		ttue2.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		ttue2.setSize(150, 20);
		ttue2.setLocation(400, 160);
		c.add(ttue2);

		ttue3 = new JComboBox(period);
		ttue3.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		ttue3.setSize(150, 20);
		ttue3.setLocation(550, 160);
		c.add(ttue3);

		wed = new JLabel("Wednesday");
		wed.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		wed.setSize(100, 200);
		wed.setLocation(100, 120);
		c.add(wed);

		twed1 = new JComboBox(period);
		twed1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		twed1.setSize(150, 20);
		twed1.setLocation(250, 210);
		c.add(twed1);

		twed2 = new JComboBox(period);
		twed2.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		twed2.setSize(150, 20);
		twed2.setLocation(400, 210);
		c.add(twed2);

		twed3 = new JComboBox(period);
		twed3.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		twed3.setSize(150, 20);
		twed3.setLocation(550, 210);
		c.add(twed3);

		thur = new JLabel("Thursday");
		thur.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		thur.setSize(100, 20);
		thur.setLocation(100, 260);//(100, 170);
		c.add(thur);

		tthur1 = new JComboBox(period);
		tthur1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tthur1.setSize(150, 20);
		tthur1.setLocation(250, 260);
		c.add(tthur1);

		tthur2 = new JComboBox(period);
		tthur2.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tthur2.setSize(150, 20);
		tthur2.setLocation(400, 260);
		c.add(tthur2);

		tthur3 = new JComboBox(period);
		tthur3.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tthur3.setSize(150, 20);
		tthur3.setLocation(550, 260);
		c.add(tthur3);

		fri = new JLabel("Friday");
		fri.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		fri.setSize(100, 200);
		fri.setLocation(100, 220);
		c.add(fri);

		tfri1 = new JComboBox(period);
		tfri1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tfri1.setSize(150, 20);
		tfri1.setLocation(250, 310);
		c.add(tfri1);

		tfri2 = new JComboBox(period);
		tfri2.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tfri2.setSize(150, 20);
		tfri2.setLocation(400, 310);
		c.add(tfri2);

		tfri3 = new JComboBox(period);
		tfri3.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tfri3.setSize(150, 20);
		tfri3.setLocation(550, 310);
		c.add(tfri3);

		sat = new JLabel("Saturday");
		sat.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		sat.setSize(100, 200);
		sat.setLocation(100, 270);
		c.add(sat);

		tsat1 = new JComboBox(period);
		tsat1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tsat1.setSize(150, 20);
		tsat1.setLocation(250, 360);
		c.add(tsat1);


		tsat2 = new JComboBox(period);
		tsat2.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tsat2.setSize(150, 20);
		tsat2.setLocation(400, 360);
		c.add(tsat2);

		tsat3 = new JComboBox(period);
		tsat3.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tsat3.setSize(150, 20);
		tsat3.setLocation(550, 360);
		c.add(tsat3);

		sun = new JLabel("Sunday");
		sun.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		sun.setSize(100, 200);
		sun.setLocation(100, 320);
		c.add(sun);

		tsun1 = new JComboBox(period);
		tsun1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tsun1.setSize(150, 20);
		tsun1.setLocation(250, 410);
		c.add(tsun1);

		tsun2 = new JComboBox(period);
		tsun2.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tsun2.setSize(150, 20);
		tsun2.setLocation(400, 410);
		c.add(tsun2);

		tsun3 = new JComboBox(period);
		tsun3.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tsun3.setSize(150, 20);
		tsun3.setLocation(550, 410);
		c.add(tsun3);



		sub = new JButton("Update");
		sub.setFont(new Font("Eras Medium ITC", Font.PLAIN, 19));
		sub.setSize(150, 30);
		sub.setLocation(300, 600);
		sub.addActionListener(this);
		c.add(sub);

		setVisible(true);
	}


	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource() == sub) {
				try
				{
					BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false));
					if(writer == null) throw new IOException("FAILED");
					writer.write("Monday : " + "\n"+ (String)tmon1.getSelectedItem()+"\t" + (String)tmon2.getSelectedItem()+"\t"+(String)tmon3.getSelectedItem()+"\n\n");
					writer.write("Tuesday : " + "\n"+ (String)ttue1.getSelectedItem()+"\t" + (String)ttue2.getSelectedItem()+"\t"+(String)ttue3.getSelectedItem()+"\n\n");
					writer.write("Wednesday : " + "\n"+ (String)twed1.getSelectedItem()+"\t" + (String)twed2.getSelectedItem()+"\t"+(String)twed3.getSelectedItem()+"\n\n");
					writer.write("Thursday : " + "\n"+ (String)tthur1.getSelectedItem()+"\t" + (String)tthur2.getSelectedItem()+"\t"+(String)tthur3.getSelectedItem()+"\n\n");
					writer.write("Friday : " + "\n"+ (String)tfri1.getSelectedItem()+"\t" + (String)tfri2.getSelectedItem()+"\t"+(String)tfri3.getSelectedItem()+"\n\n");
					writer.write("Saturday : " + "\n"+ (String)tsat1.getSelectedItem()+"\t" + (String)tsat2.getSelectedItem()+"\t"+(String)tsat3.getSelectedItem()+"\n\n");
					writer.write("Sunday : " + "\n"+ (String)tsun1.getSelectedItem()+"\t" + (String)tsun2.getSelectedItem()+"\t"+(String)tsun3.getSelectedItem()+"\n\n");
					writer.close();
				}
				catch (IOException exc)
				{
 					System.out.println("Exception Occurredwhile trying to write in file" + exc);
				}
	
			}
		
		}


	}

