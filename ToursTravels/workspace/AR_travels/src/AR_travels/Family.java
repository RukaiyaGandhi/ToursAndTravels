package AR_travels;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import packages.bangkokPackage;
import packages.dubaiPackage;
import packages.francePackage;
import packages.greecePackage;
import packages.icelandPackage;
import packages.irelandPackage;
import packages.italyPackage;
import packages.londonPackage;
import packages.maldivesPackage;
import packages.norwayPackage;
import packages.odishaPackage;
import packages.polandPackage;
import packages.scotlandPackage;
import packages.sikkimPackage;

public class Family extends JFrame{
	    ImageIcon bangkokIc = new ImageIcon(ClassLoader.getSystemResource("familyImages/bangkok.jpg"));
	    Image bangkokImg = bangkokIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon bangkok = new ImageIcon(bangkokImg);
	    JLabel bangkokLbl = new JLabel(bangkok);
	    
	    ImageIcon dubaiIc = new ImageIcon(ClassLoader.getSystemResource("familyImages/dubai.jpg"));
	    Image dubaiImg = dubaiIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon dubai = new ImageIcon(dubaiImg);
	    JLabel dubaiLbl = new JLabel(dubai);
	    
	    ImageIcon franceIc = new ImageIcon(ClassLoader.getSystemResource("familyImages/france.jpg"));
	    Image franceImg = franceIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon france = new ImageIcon(franceImg);
	    JLabel franceLbl = new JLabel(france);
	    
	    ImageIcon greeceIc = new ImageIcon(ClassLoader.getSystemResource("familyImages/greece.jpg"));
	    Image greeceImg = greeceIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon greece = new ImageIcon(greeceImg);
	    JLabel greeceLbl = new JLabel(greece);
	   
	    ImageIcon italyIc = new ImageIcon(ClassLoader.getSystemResource("familyImages/Italy.jpg"));
	    Image italyImg = italyIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon italy = new ImageIcon(italyImg);
	    JLabel italyLbl = new JLabel(italy);
	  
	    ImageIcon londonIc = new ImageIcon(ClassLoader.getSystemResource("familyImages/london.jpg"));
	    Image londonImg = londonIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon london = new ImageIcon(londonImg);
	    JLabel londonLbl = new JLabel(london);
	   
	  
		Family(){
			
			setVisible(true);
			setSize(940,600);
			setLocation(200,50);
			setResizable(false);
			setLayout(new GridLayout(3, 3, 5, 5));
			setTitle("Family");
			
			add(bangkokLbl);
			add(dubaiLbl);
			add(franceLbl);
			add(greeceLbl);
			add(italyLbl);
			add(londonLbl);
			
			addMouseListener();

		}
		
		public void addMouseListener(){
			
			bangkokLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == bangkokLbl){
						dispose();
						new bangkokPackage();
						
					}
					
					
				}
			});
			
			dubaiLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == dubaiLbl){
						dispose();
						new dubaiPackage();
						
					}
					
					
				}
			});
			
			franceLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == franceLbl){
						dispose();
						new francePackage();
						
					}
					
					
				}
			});
			greeceLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == greeceLbl){
						dispose();
						new greecePackage();
						
					}
					
					
				}
			});
			italyLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == italyLbl){
						dispose();
						new italyPackage();
						
					}
					
					
				}
			});
			
			londonLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == londonLbl){
						dispose();
						new londonPackage();
						
					}
					
					
				}
			});
	}
}


