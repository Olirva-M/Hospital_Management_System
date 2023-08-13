import Homes.*;
import Homes.Registration.*;
import Homes.Login.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

class TestPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = Color.RED;
        Color color2 = Color.GREEN;
        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}

public class Homec {

	public static void main(String[] args) { 

		JFrame f=new JFrame("Hospital Management");
		TestPanel n = new TestPanel();
		f.add(n);

     
	f.setTitle("Hospital Management System");

		

			
		f.setBounds(400, 30,800, 1000);
		JButton b=new JButton("Patient");  
		b.setBounds(350,560,95,30);  
		b.setSize(130,40);
		//b.setPreferredSize(new Dimension(100, 100));
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					//f.dispose();
		          			PatientHome f = new PatientHome();
				}  
		});  
		f.add(b);

		JButton l=new JButton("Doctor");
		l.setBounds(550,560,100, 40);	
		l.setSize(130,40);
		l.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){  
					//f.dispose();
		          			DoctorHome f = new DoctorHome();

		}
	});
		
		//l.setPreferredSize(new Dimension(100, 100));  
		f.add(l);
		Container c = f.getContentPane(); //Gets the content layer
        	JLabel label = new JLabel(); //JLabel Creation
        	label.setIcon(new ImageIcon("bg1.jpg")); //Sets the image to be displayed as an icon
        	Dimension size = label.getPreferredSize(); //Gets the size of the image
        	label.setBounds(0, -170, 1000, 1000); //Sets the location of the image
 
    		c.add(label);
		f.setSize(1000,700);
		f.setLayout(null); 
		
		f.setVisible(true); 
	}  
}  
