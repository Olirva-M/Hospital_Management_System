package Homes.Registration;
import Homes.Registration.hospitalmain.*;
import Homes.DoctorHome;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class DoctorRegistration extends JFrame implements ActionListener {

	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel spl;
	private JTextField tspl;
	private JLabel mno;
	private JTextField tmno;
	private JLabel age;
	private JTextField tage;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private JRadioButton other;
	private ButtonGroup gengp;
	private JLabel type;
	private JRadioButton f_time;
	private JRadioButton p_time;
	private ButtonGroup gengp_type;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel yoe;
	private JComboBox duration;
	private JLabel id;
	private JTextField tid;
	private JLabel qual;
	private JTextField tqual;
	private JCheckBox term;
	private JButton sub;
	private JButton backd;
	private JButton reset;
	private JTextArea tout;
	private JLabel res1;
	private JLabel res2;
	private String filename;

	private String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	private String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019" };
	private String durations[]
		= {"01-05 years" , 
			"05-10 years" , 
			"10-15 years",
			"15-20 years",
			"More than 20 years"};


	public DoctorRegistration()
	{

		setTitle("Registration Form");
	 setBounds(400, 0,800, 1000);
	 		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Doctor Registration Form");
		title.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
		title.setSize(300, 35);
		title.setLocation(145, 30);
		c.add(title);

		name = new JLabel("Name");
		name.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		name.setSize(100, 200);
		name.setLocation(100, 20);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tname.setSize(150, 20);
		tname.setLocation(250, 110);
		c.add(tname);

		mno = new JLabel("Mobile");
		mno.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		mno.setSize(100, 200);
		mno.setLocation(100, 70);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setLocation(250, 160);
		c.add(tmno);

		age = new JLabel("Age");
		age.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		age.setSize(100, 200);
		age.setLocation(100, 120);
		c.add(age);

		tage = new JTextField();
		tage.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tage.setSize(150, 20);
		tage.setLocation(250, 210);
		c.add(tage);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		gender.setSize(100, 200);
		gender.setLocation(100, 170);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		male.setSelected(false);
		male.setSize(75, 20);
		male.setLocation(250, 260);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(325, 260);
		c.add(female);

		other = new JRadioButton("Other");
		other.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		other.setSelected(false);
		other.setSize(75, 20);
		other.setLocation(430, 260);
		c.add(other);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);
		gengp.add(other);

		id = new JLabel("Email ID");
		id.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		id.setSize(100, 200);
		id.setLocation(100, 220);
		c.add(id);

		tid = new JTextField();
		tid.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tid.setSize(150, 20);
		tid.setLocation(250, 310);
		c.add(tid);

		spl = new JLabel("Speciality");
		spl.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		spl.setSize(100, 200);
		spl.setLocation(100, 270);
		c.add(spl);

		tspl = new JTextField();
		tspl.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tspl.setSize(150, 20);
		tspl.setLocation(250, 360);
		c.add(tspl);

		qual = new JLabel("Qualification");
		qual.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		qual.setSize(100, 200);
		qual.setLocation(100, 320);
		c.add(qual);

		tqual = new JTextField();
		tqual.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		tqual.setSize(150, 20);
		tqual.setLocation(250, 410);
		c.add(tqual);


		type = new JLabel("Type");
		type.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		type.setSize(100, 200);
		type.setLocation(100, 370);
		c.add(type);

		f_time = new JRadioButton("Full time");
		f_time.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		f_time.setSelected(false);
		f_time.setSize(100, 20);
		f_time.setLocation(250, 460);
		c.add(f_time);

		p_time = new JRadioButton("Part time");
		p_time.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		p_time.setSelected(false);
		p_time.setSize(100, 20);
		p_time.setLocation(370, 460);
		c.add(p_time);

		gengp_type = new ButtonGroup();
		gengp_type.add(f_time);
		gengp_type.add(p_time);

		yoe = new JLabel("Experience");
		yoe.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		yoe.setSize(100, 200);
		yoe.setLocation(100, 420);
		c.add(yoe);

		duration = new JComboBox(durations);
		duration.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		duration.setSize(200, 25);
		duration.setLocation(250, 510);
		c.add(duration);


		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 550);
		c.add(term);

		sub = new JButton("Submit");
		sub.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 600);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 600);
		reset.addActionListener(this);
		c.add(reset);

		res1 = new JLabel("");
		res1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 15));
		res1.setSize(600, 25);
		res1.setLocation(400, 550);
		c.add(res1);

		res2 = new JLabel("");
		res2.setFont(new Font("Eras Medium ITC", Font.BOLD, 15));
		res2.setSize(600, 25);
		res2.setLocation(430, 565);
		c.add(res2);

		backd=new JButton("Back to Patient Home");
        backd.setLocation(310, 744);   
        backd.setSize(200,40);
          
        backd.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                    setVisible(false);
                    DoctorHome dh = new DoctorHome();
                            
                }  
        });  
        c.add(backd);

  

		setVisible(true);
	}


	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()) {
			
				Doctor d;
				String g_data;
				int years_exp = (((String)duration.getSelectedItem()).charAt(0) == 'M')?  20 : strToInt(((String)duration.getSelectedItem()).substring(0, 2));

				if (male.isSelected())
					g_data = "Male";
				else if (female.isSelected())
					g_data = "Female";
				else
					g_data = "Other";

				d = new Doctor(tname.getText(), strToInt(tage.getText()), g_data, tmno.getText(), tid.getText(), tspl.getText(), tqual.getText(), f_time.isSelected(), years_exp);
				res1.setForeground(Color.GREEN);
				res2.setForeground(Color.GREEN);

//System.out.println(d.getName() +"\n" +  d.getAge() +"\n" + d.getGender() + d.getPhone_no() +"\n"  + d.getMail_id() +"\n" + d.getSpeciality() +"\n" + d.getQualification() +"\n" + d.getYearsExp() +"\n" + d.getFull_time());

				filename = "C:/Users/Harini Mohan/OneDrive/Desktop/JavaMP Final/Homes/Doctor Records.txt";
				try {
					String data = null;
					File fobj = new File(filename);
					Scanner Reader = new Scanner(fobj);
					while (Reader.hasNextLine()) 
						data = Reader.nextLine();

					if (data != null){
						d.setId(strToInt(data.split("\t")[0])+ 1);
						res1.setText("Registered Successfully!");
						res2.setText("Your ID : "+d.getId());
					}
					Reader.close();
				}
				catch (FileNotFoundException exc) {
					System.out.println("An error has occurred while trying to read from file: "+e);
				}


				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
					if(writer == null) throw new IOException("FAILED");
					writer.write(d.getId() + "\t" +d.getName() +"\t" +  d.getAge() +"\t" + d.getGender() +"\t" 
+ d.getPhone_no() +"\t"  + d.getMail_id() +"\t" + d.getSpeciality() +"\t" + d.getQualification() +"\t" + d.getYearsExp() +"\t" + d.getFull_time() + "\n");
					writer.close();
				}
				catch (IOException exc) {
 					System.out.println("Exception Occurredwhile trying to write in file" + exc);
				}
	
			}
			else{
				res1.setForeground(Color.RED);
				res1.setText("<--Accept to proceed!");
				res2.setText("");
			}
		}

		else if (e.getSource() == reset) {
			String def = "";
			res1.setText(def);
			res2.setText(def);
			tname.setText(def);
			tmno.setText(def);
			tage.setText(def);
			tspl.setText(def);
			tid.setText(def);
			tqual.setText(def);
			male.setSelected(false);
			female.setSelected(false);
			other.setSelected(false);
			f_time.setSelected(false);
			p_time.setSelected(false);
			term.setSelected(false);
		}
	}


	static Period calculatePeriod(String d1, String d2)
	{

		LocalDate startDate = LocalDate.parse(d1);
		LocalDate endDate = LocalDate.parse(d2);

		Period period = Period.between(startDate, endDate);
		return period;
    	}

	public static int strToInt(String str)
	{

		int val;
		try {
			val = Integer.parseInt(str);
		}
		catch (NumberFormatException e) {val = 0;}
		return val;
		}
	}

/*
class DoctorRegistration{

	public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();
	}
}
*/