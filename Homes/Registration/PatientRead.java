package Homes.Registration;
import Homes.PatientHome;
import Homes.Registration.hospitalmain.*;
//import Registration.hospitalmain.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
import java.io.*;
import java.util.*;
 
class BackgroundImageJFrame extends JFrame
{

JButton b1;
JLabel l1;
public BackgroundImageJFrame()
{

setSize(400,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);


setLayout(new BorderLayout());
JLabel background=new JLabel(new ImageIcon("C:/mbg.jpg"));
add(background);
background.setLayout(new FlowLayout());
l1=new JLabel("Here is a button");
b1=new JButton("I am a button");
background.add(l1);
background.add(b1);


setSize(500,500);
setSize(500,500);
}
}

public class PatientRead extends JFrame
    implements ActionListener {

 
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
   
    private JTextField tname;

    private JLabel mno;
    private JTextField tmno;
    private JLabel mail;
    private JTextField tmail;    
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel age;
    private JTextField tage;
    private JLabel bgrp ;
    private JComboBox bloodg;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JLabel allerg;
    private JTextArea tallerg; 
    private JCheckBox term;
    private JButton sub;
    private JButton back;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
 
    private String dates[]
        = { "","1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "","Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "","1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    private String bloodgrps[] =  {"","O +ve","O -ve","A +ve","A -ve","B +ve","B -ve","AB +ve","AB -ve"};
  
    // constructor, to initialize the components
    // with default values.
    public PatientRead()
    {


        setTitle("Patient Details - Registration Form");
        setBounds(400, 0,800, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Patient Registration Form");
        title.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        title.setSize(500, 80);
        title.setLocation(150, 10);
        c.add(title);

 


        name = new JLabel("Patient Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(200, 30);
        name.setLocation(100, 150);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(250, 30);
        tname.setLocation(300, 150);
        c.add(tname);



        age = new JLabel("Age");
        age.setFont(new Font("Arial", Font.PLAIN, 20));
        age.setSize(200, 30);
        age.setLocation(100, 200);
        c.add(age);

        tage = new JTextField();
        tage.setFont(new Font("Arial", Font.PLAIN, 15));
        tage.setSize(250, 30);
        tage.setLocation(300, 200);
        c.add(tage);



 
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(200, 30);
        gender.setLocation(100, 250);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(300, 250);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(375, 250);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);



        
        bgrp = new JLabel("Blood Group");
        bgrp.setFont(new Font("Arial", Font.PLAIN, 20));
        bgrp.setSize(200, 30);
        bgrp.setLocation(100, 300);
        c.add(bgrp);

        bloodg = new JComboBox(bloodgrps);
        bloodg.setFont(new Font("Arial", Font.PLAIN, 15));
        bloodg.setSize(100, 30);
        bloodg.setLocation(300, 300);
        c.add(bloodg); 

 

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(200, 30);
        dob.setLocation(100, 350);
        c.add(dob);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(300, 350);
        c.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(80, 20);
        month.setLocation(350, 350);
        c.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(90, 20);
        year.setLocation(430, 350);
        c.add(year);




        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(200, 30);
        mno.setLocation(100, 400);
        c.add(mno);
 
        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(250, 30);
        tmno.setLocation(300, 400);
        c.add(tmno);


        mail = new JLabel("e-Mail ID");
        mail.setFont(new Font("Arial", Font.PLAIN, 20));
        mail.setSize(200, 30);
        mail.setLocation(100, 450);
        c.add(mail);
 
        tmail = new JTextField();
        tmail.setFont(new Font("Arial", Font.PLAIN, 15));
        tmail.setSize(250, 30);
        tmail.setLocation(300, 450);
        c.add(tmail);

 
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(200, 30);
        add.setLocation(100, 500);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(300, 50);
        tadd.setLocation(300, 500);
        tadd.setLineWrap(true);
        c.add(tadd);



        allerg = new JLabel("Allergies if any");
        allerg.setFont(new Font("Arial", Font.PLAIN, 20));
        allerg.setSize(200, 30);
        allerg.setLocation(100, 580);
        c.add(allerg);
 
        tallerg = new JTextArea();
        tallerg.setFont(new Font("Arial", Font.PLAIN, 15));
        tallerg.setSize(300, 50);
        tallerg.setLocation(300, 580);
        tallerg.setLineWrap(true);
        c.add(tallerg);



 
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(100, 700);
        c.add(term);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 740);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(290, 740);
        reset.addActionListener(this);
        c.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(600, 500);
        tout.setLocation(900, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(400, 30);
        res.setLocation(430, 740);
        c.add(res);

       back=new JButton("Back to Patient Home");
        back.setLocation(370, 740);   
        back.setSize(200,20);
          
        back.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                    setVisible(false);
                    PatientHome ph = new PatientHome();
                            
                }  
        });  
        c.add(back);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {

            

                String bg = (String)bloodg.getSelectedItem();
                String ag = tallerg.getText();

                String data1;
                String data
                    = "Kindly check Patient's details \n\n" + "Name : "  + tname.getText() + "\n\n" + "Age: " + tage.getText()+ "\n\n" + "Blood Group: " + (String)bloodg.getSelectedItem() + 
                       "\n\n";
                if (male.isSelected())
                    data1 = "Gender : Male";
                else
                    data1 = "Gender : Female";
                String data2
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n\n";
 
                String data3 = "Address : " + tadd.getText()+"\n\n";
                String data4 = "Mobile : "+tmno.getText()+"\n\n";
                String data5 = "Allergy history : "+tallerg.getText()+"\n\n";
                String data6 = "e-Mail id : "+tmail.getText()+"\n\n";


Patient p  = new Patient(tname.getText(),strToInt(tage.getText()),data1,tmno.getText(), tmail.getText(),bg,ag);
//int idd; 
             String   filename = "C:/Users/Harini Mohan/OneDrive/Desktop/JavaMP Final/Homes/Patient Records.txt";
                try {
                    String dataa = null;
                    File fobj = new File(filename);
                    Scanner Reader = new Scanner(fobj);
                    while (Reader.hasNextLine()) 
                        dataa = Reader.nextLine();

                    if (dataa != null){
                        
                      
                       p.setId(strToInt(dataa.split("\t")[0])+ 1);
                       
                        
                        //res.setText("Registered Successfully!"+idd);
                        
                    }
                    Reader.close();
                }
                catch (FileNotFoundException exc) {
                    System.out.println("An error has occurred while trying to read from file: "+e);
                }



try {

        BufferedWriter pat = new BufferedWriter(new FileWriter(filename, true));
        if(pat == null) throw new IOException("FAILED");

       // res.setText("Your ID : "+p.getId());
        pat.write(p.getId() + "\t" + p.getName() +"\t" +  p.getAge() +"\t" + p.getGender() +"\t" + p.getPhone_no() +"\t"  + p.getMail_id() +"\t" + p.getBlood_grp() +"\t" + p.getAllergies() +"\n");
        pat.close();

        
    }
    catch (IOException exc) {
        System.out.println("Exception Occurred"+exc);
    }



               tout.setText(data + data1 + data2 + data4 + data6 + data3 + data5);
                tout.setEditable(false);
               
                //res.setOpaque(true);
               // res.setBackground(Color.green);
                res.setForeground(Color.green);
                res.setText("Registration Successful. Your ID : "+p.getId());

            }
            else {
                tout.setText("");
               
                res.setOpaque(true);
                res.setForeground(Color.red);
               // res.setBackground(Color.white);
              
                res.setText("Please accept the"
                            + " terms & conditions");
            }
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            tmail.setText(def);
            tallerg.setText(def);
            tage.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            bloodg.setSelectedIndex(0);
            male.setSelected(false);
            female.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
           // resadd.setText(def);
        }
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
 
// Driver Code
class PatientRead {
 
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
        //new BackgroundImageJFrame();
    }
}
*/