package Homes.Pharmacy;
import java.sql.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.lang.Integer;

public class Pharm {
	public static float calcCost(List<Float> cost){
		float sum = 0;
		for (Float i : cost)
		    sum += i;
		return sum;
	}
	public Pharm() { 
	//public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("Pharmacy");
		
		List<String> medStock = new ArrayList<String>();
		
		List<String> cartMeds = new ArrayList<String>();
		
		List<Integer> cartQty = new ArrayList<Integer>();
		
		List<Float> costPerItem = new ArrayList<Float>();
		
		List<Float> cost = new ArrayList<Float>();


		File file = new File("C:/Users/Harini Mohan/OneDrive/Desktop/JavaMP Final/stock.txt");
		try {
		BufferedReader br = new BufferedReader(new FileReader(file));
        	String st;
        	try{
			while ((st = br.readLine()) != null)
				medStock.add(st);
		    		}
		catch(IOException e) {
		  	e.printStackTrace();
		}
            		}
            	catch (FileNotFoundException ex)  {
            		System.out.println("!!!!!!!!!!No file");
            		}
            	String[] medsInStock = medStock.toArray(new String[0]);
       
		JLabel label1=new JLabel("Medicine:");
		label1.setFont(new Font("Monotype Corsiva", Font.BOLD, 24));
		label1.setBounds(200,80,150,40);
		f.add(label1);
		JTextField textfield1=new JTextField();
		textfield1.setFont(new Font("Monotype Corsiva", Font.BOLD, 24));
		textfield1.setBounds(350,80,200,30);
		f.add(textfield1);
		
		JLabel label2=new JLabel("Quantity:");
		label2.setFont(new Font("Monotype Corsiva", Font.BOLD, 24));
		label2.setBounds(200,120,150,40);
		f.add(label2);
		JTextField textfield2=new JTextField();
		textfield2.setFont(new Font("Monotype Corsiva", Font.BOLD, 24));
		textfield2.setBounds(350,120,200,30);
		f.add(textfield2);
		
		JLabel label3=new JLabel("Cost:");
		label3.setFont(new Font("Monotype Corsiva", Font.BOLD, 24));
		label3.setBounds(200,300,800,40);
		f.add(label3);
			  
		JButton b=new JButton("Buy"); 
		b.setBounds(325,210,100, 40);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int flag = 0;
				int qty;
				String medicine = textfield1.getText();
				if (textfield2.getText().equals("")){
					label3.setText("Please Enter quantity.");
				}
				else{
					qty = Integer.valueOf(textfield2.getText());
				
				for (int i = 0; i < medsInStock.length; i = i + 3){
					if (medicine.equalsIgnoreCase(medsInStock[i])){
						flag = 1;
						if (Integer.valueOf(medsInStock[i+1]) > 0){
							if (qty <= Integer.valueOf(medsInStock[i+1])){
								cartMeds.add(medsInStock[i]);
								cartQty.add(Integer.valueOf(medsInStock[i+1]));
								costPerItem.add(Float.valueOf(medsInStock[i+2]));
								cost.add((float)qty * Float.valueOf(medsInStock[i+2]));
		 						medsInStock[i+1] = String.valueOf(Integer.valueOf(medsInStock[i+1])-qty);
		 						label3.setText(String.valueOf("Cost:" + calcCost(cost)));
							}
							else{
		 						label3.setText("Only " + medsInStock[i+1] + " such medicine exists.");
							
							}
						}
						else{
							label3.setText("Stock not available.");
						}
					}
				}
				if (flag == 0){
					 label3.setText("Medicine not available.");
				}
			   }
			   }
		});
		
		JButton finish=new JButton("Finish"); 
		finish.setBounds(325,410,100, 40);
		finish.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				f.dispose();
				try {
				      FileWriter myWriter = new FileWriter("stock.txt");
				      for (String eachString : medsInStock) {
				      myWriter.write(eachString + "\n");

					}
				      myWriter.close();
				       } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				 try {
				      FileWriter myBill = new FileWriter("bill.txt");
				      myBill.write("---------------------------------------------------------------------------\n");
				      myBill.write("\t\t\t\tPharmacy Bill\n");
				      myBill.write("---------------------------------------------------------------------------\n");
				      myBill.write("S.No\tName\tQty\tCost\tSum\n");
				      for (int j = 0; j < cartMeds.size(); j++) {
				      myBill.write(j+"\t"+cartMeds.get(j)+"\t"+cartQty.get(j)+"\t"+costPerItem.get(j)+"\t"+cost.get(j)+"\n");
				      }
				      myBill.write("---------------------------------------------------------------------------\n");
				      myBill.write("\t\t\t\tTotal Cost:" + calcCost(cost)+"\n");
				      myBill.write("---------------------------------------------------------------------------\n");
				      myBill.close();
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
			}
		});
			  
		f.add(b); 
		f.add(finish);  
			  
		f.setBounds(250,0,600,680); 
		f.setLayout(null);
		f.setVisible(true);
	}  
}  
