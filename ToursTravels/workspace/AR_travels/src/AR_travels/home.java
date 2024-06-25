package AR_travels;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Contact.contactUs;
import login.login;
import packages.norwayPackage;

public class home extends JFrame implements ActionListener{
	
	    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/bg.jpg"));
	    Image i2 = i1.getImage().getScaledInstance(940, 600, Image.SCALE_DEFAULT);
	    ImageIcon i3 = new ImageIcon(i2);
	    JLabel icon = new JLabel(i3);
	    
	    JLabel contactLbl = new JLabel("<html><u>Contact Us</u></html>");
	    
	    JLabel logoutLbl = new JLabel("<html><u>Log out</u></html>");
	    
	    JLabel titleLbl = new JLabel("What type of Trip are you looking for?");

	    Icon nature = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/nature.png"));
	    JButton natureBtn = new JButton(nature);
	    JLabel natureLbl = new JLabel("Nature");
	    
	    Icon honey = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/honey.png"));
	    JButton honeyBtn = new JButton(honey);
	    JLabel honeyLbl = new JLabel("Honeymoon");
	    
	    Icon friend = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/friend.png"));
	    JButton friendBtn = new JButton(friend);
	    JLabel friendLbl = new JLabel("Friends");
	    
	    Icon family = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/family.png"));
	    JButton familyBtn = new JButton(family);
	    JLabel familyLbl = new JLabel("Family");
	    
	    Icon adventure = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/adventure.png"));
	    JButton adventureBtn = new JButton(adventure);
	    JLabel adventureLbl = new JLabel("Adventure");
	  
	    
	public home(){
		
		setLocationAndSize();
		addComponents();
		addActionEvent();
		addMouseListner();
	    add(icon);
		setVisible(true);
		setSize(940,600);
		setLocation(200,50);
		setResizable(false);
		setTitle("Home");
	
	}

	 public void setLocationAndSize()
	    {
		 
		 titleLbl.setBounds(200, 220, 600, 40);
		 titleLbl.setFont(new Font("Serif", Font.BOLD, 30));
		 titleLbl.setForeground(Color.white);
		 
		 natureBtn.setBounds(220,300,100,30);
		 natureBtn.setBorder(null);
		 natureBtn.setSize(48,48);
		 natureLbl.setBounds(224, 340, 100, 30);
		 natureLbl.setForeground(Color.white);
		 
		 honeyBtn.setBounds(320,300,100,30);
		 honeyBtn.setBorder(null);
		 honeyBtn.setOpaque(false);
		 honeyBtn.setSize(48,48);
		 honeyLbl.setBounds(309,340,100,30);
		 honeyLbl.setForeground(Color.white);
	    
		 friendBtn.setBounds(420,300,100,30);
		 friendBtn.setBorder(null);
		 friendBtn.setOpaque(false);
		 friendBtn.setSize(48,48);
		 friendLbl.setBounds(423,340,100,30);
		 friendLbl.setForeground(Color.white);
		 
		 familyBtn.setBounds(520,300,100,30);
		 familyBtn.setBorder(null);
		 familyBtn.setOpaque(false);
		 familyBtn.setSize(48,48);
		 familyLbl.setBounds(525,340,100,30);
		 familyLbl.setForeground(Color.white);
		 
		 adventureBtn.setBounds(620,300,100,30);
		 adventureBtn.setBorder(null);
		 adventureBtn.setOpaque(false);
		 adventureBtn.setSize(48,48);
		 adventureLbl.setBounds(613,340,100,30);
		 adventureLbl.setForeground(Color.white);
		 
		 contactLbl.setBounds(830,0,600,40);
		 contactLbl.setFont(new Font("Serif", Font.BOLD, 15));
		 contactLbl.setForeground(Color.white);
		 
		 logoutLbl.setBounds(20,520,600,40);
		 logoutLbl.setFont(new Font("Serif", Font.BOLD, 15));
		 logoutLbl.setForeground(Color.white);
		 }
 
	 public void addComponents()
	    {
		 add(titleLbl);
		 
		 add(natureBtn);
		 add(natureLbl);
		 
		 add(honeyBtn);
		 add(honeyLbl);
		 
		 add(friendBtn);
		 add(friendLbl);
		 
		 add(familyBtn);
		 add(familyLbl);
		 
		 add(adventureBtn);
		 add(adventureLbl);
		 
		 add(contactLbl);
		 
		 add(logoutLbl);
	    }
	 
	 public void addActionEvent(){
		 
		 natureBtn.addActionListener(this);
		 honeyBtn.addActionListener(this);
		 friendBtn.addActionListener(this);
		 familyBtn.addActionListener(this);
		 adventureBtn.addActionListener(this);
	 }
	 
	 public void addMouseListner(){
		 
		 contactLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == contactLbl){
						
						new contactUs();
						
					}
					
					
				}
			});
		 logoutLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == logoutLbl){
						
						 new login();
						 dispose();
						 
						
					}
					
					
				}
			});
	 }
			
		 

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == natureBtn){
			
			new Nature();
			dispose();
		}
		if(e.getSource() == honeyBtn){
			
			new Honeymoon();
			dispose();
		}
		if(e.getSource() == friendBtn){
			
			new Friend();
			dispose();
		}
		if(e.getSource() == familyBtn){
			
			new Family();
			dispose();
		}
		if(e.getSource() == adventureBtn){
			
			new Adventure();
			dispose();
		}
		
	}
	   
}
