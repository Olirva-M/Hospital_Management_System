package Homes.Login;
import Homes.Registration.hospitalmain.*;
import Homes.Features.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DoctorLogin extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message,note;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
 public  DoctorLogin() {
      setBounds(500,300,800, 100);
     // note = new JLabel;
      //note.setText("USER NAME - Docotor id+name\tPASSWORD- user password");
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
    //  panel.add(note);
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
      setTitle("Doctor Login");
      setSize(500,200);
      setVisible(true);
   }
   public static void main(String[] args) {
      new DoctorLogin();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
       String filePath = "C:/Users/Harini Mohan/OneDrive/Desktop/JavaMP Final/Homes/LoginDoctor.txt";
        

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

       System.out.println("check "+un+"-"+usn);
     
        if (usn.equals(un)&& pw.equals(pwd)) {
          //flag = 1;
         System.out.println("yes verified");
         message.setText("\n Successfully Logged in! " + usn + "");

DoctorLoginProceed dl = new DoctorLoginProceed("C:/Users/Harini Mohan/OneDrive/Desktop/JavaMP Final/Dr."+un+"Schedule.txt");

         break;
      } else {
         message.setText(" Invalid user.. ");
      }
 
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


   

    }
}


