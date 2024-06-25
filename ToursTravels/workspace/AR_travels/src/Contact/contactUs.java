package Contact;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class contactUs extends JFrame {
	
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/bg.jpg"));
    Image i2 = i1.getImage().getScaledInstance(940, 600, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel icon = new JLabel(i3);
    
    JLabel contactLbl = new JLabel("Contact No:");
    JLabel contactnoLbl = new JLabel("9992223330");
    
    JLabel emailLbl = new JLabel("Email:");
    JLabel emailaddLbl = new JLabel("artravels@gmail.com");
    
    JLabel addressLbl = new JLabel("Address:");
    JLabel addresssLbl = new JLabel("Ar Travels - Jamnagar 361001");
    
    JLabel ownerLbl = new JLabel("Owner:");
    JLabel ownerrukaiyaLbl = new JLabel("Rukaiya Gandhi");
    JLabel owneraishaLbl = new  JLabel("Aaysha Kasmani");
    
    	public contactUs(){
    	
    	addComponents();
    	setLocationAndSize();
	    add(icon);
		setVisible(true);
		setSize(940,600);
		setLocation(200,50);
		setResizable(false);
		setTitle("Contact Us");
	
	}
    	
    	public void addComponents(){
    		
    		add(contactLbl);
    		add(contactnoLbl);
    		
    		add(emailLbl);
    		add(emailaddLbl);
    		
    		add(addressLbl);
    		add(addresssLbl);
    		
    		add(ownerLbl);
    		add(ownerrukaiyaLbl);
    		add(owneraishaLbl);
    	}
    	
    	public void setLocationAndSize(){
    		
    		//Contact
    		contactLbl.setBounds(250,30,120,30);
    		contactLbl.setForeground(Color.white);
  	        contactLbl.setFont(new Font("Serif", Font.BOLD, 20));
  	        
  	        //Contact No.
  	        contactnoLbl.setBounds(400,30,120,30);
  	        contactnoLbl.setForeground(Color.white);
	        contactnoLbl.setFont(new Font("Serif", Font.BOLD, 18));
	        
	        //Email
	        emailLbl.setBounds(250,60,120,30);
    		emailLbl.setForeground(Color.white);
  	        emailLbl.setFont(new Font("Serif", Font.BOLD, 20));
  	        
  	        //Email Address
  	        emailaddLbl.setBounds(400,60,170,30);
	        emailaddLbl.setForeground(Color.white);
	        emailaddLbl.setFont(new Font("Serif", Font.BOLD, 18));
	        
	        //Address
	        addressLbl.setBounds(250,90,120,30);
    		addressLbl.setForeground(Color.white);
  	        addressLbl.setFont(new Font("Serif", Font.BOLD, 20));
  	        
  	        //Address 
  	        addresssLbl.setBounds(400,90,250,30);
	        addresssLbl.setForeground(Color.white);
	        addresssLbl.setFont(new Font("Serif", Font.BOLD, 18));
	        
	        //Owner
	        ownerLbl.setBounds(250,120,250,30);
	        ownerLbl.setForeground(Color.white);
	        ownerLbl.setFont(new Font("Serif", Font.BOLD, 18));
	        
	        //Owner 1
	        ownerrukaiyaLbl.setBounds(400,120,250,30);
	        ownerrukaiyaLbl.setForeground(Color.white);
	        ownerrukaiyaLbl.setFont(new Font("Serif", Font.BOLD, 18));
	        
	        //Owner 2
	        owneraishaLbl.setBounds(400,150,250,30);
	        owneraishaLbl.setForeground(Color.white);
	        owneraishaLbl.setFont(new Font("Serif", Font.BOLD, 18));
	        
	        
	        
	        
	        
    	}

}










