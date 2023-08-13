package Homes.Login;
import Homes.Registration.hospitalmain.*;
import Homes.Features.*;
import Homes.Features.PatientLoginProceed;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PatientLogin extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
  public PatientLogin() {
      setBounds(500,300,800, 100);
      // Username Label
      user_label = new JLabel();
      user_label.setText("User Name :");
      //user_label.setsize(100,30);
      userName_text = new JTextField();
      userName_text.setColumns(10);
     
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");

    //  password_label.setsize(100,30);
      password_text = new JPasswordField();
      // Submit
      submit = new JButton("SUBMIT");
      submit.setSize(500,30);
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      add(panel);
      setTitle("Patient Login");
      setSize(500,200);
      setVisible(true);
   }
   public static void main(String[] args) {
      new PatientLogin();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
       String filePath = "C:/Users/Harini Mohan/OneDrive/Desktop/JavaMP Final/Homes/LoginPatient.txt";
        

 BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            boolean usernameExists = false;
            while((line = bufferedReader.readLine()) != null) {

       String un = userName.trim();
       String pw = password.trim();

       
       String[] login = line.split("-");
       String usn = login[0].trim();
       String pwd = login[1];
int flag =0;

       System.out.println("check updated "+un+"-"+usn);
     
        if (usn.equals(un)&& pw.equals(pwd)) {
          //flag = 1;
         System.out.println("yes done!!");
         message.setText(" \nSuccesfully logged in! " + usn + "");


PatientLoginProceed fl = new PatientLoginProceed("C:/Users/Harini Mohan/OneDrive/Desktop/JavaMP Final/"+un+".txt");

        /* JFrame fl=new JFrame("Patient Login Home ");
            
        fl.setBounds(400, 0,800, 1000);
        JButton b=new JButton("Proceed");  
        b.setBounds(450,250,95,30);  
        b.setSize(100,40);
        //b.setPreferredSize(new Dimension(100, 100));
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                    fl.dispose();
                            PatientLoginProceed fl = new PatientLoginProceed();
                }  
        });  
        fl.add(b);*/
         //
         break;
      } 
      else {
         message.setText(" Invalid user.. ");
         ////System.out.println("error "+line);
      }
   

               /* if (line.equals(userName.trim())) {
                    usernameExists = true;
                    message.setText(" Hello " + userName + "");
                    break;
                }*/
            }
            if (usernameExists) {
                System.out.println("Username  exists! Please try again.");
            } else {
                //message.setText(" Invalid user.. ");
                System.out.println("Username accepted");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

/*
      if (userName.trim().equals("admin") && password.trim().equals("admin")) {
         message.setText(" Hello " + userName + "");
      } else {
         message.setText(" Invalid user.. ");
      }*/
   

    }
}

