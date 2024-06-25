package AR_travels;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import packages.icelandPackage;
import packages.irelandPackage;
import packages.maldivesPackage;
import packages.polandPackage;
import packages.scotlandPackage;
import packages.sikkimPackage;

public class Honeymoon extends JFrame {
	
	 ImageIcon icelandIc = new ImageIcon(ClassLoader.getSystemResource("honeyImages/iceland.jpg"));
	    Image icelandImg = icelandIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon iceland = new ImageIcon(icelandImg);
	    JLabel icelandLbl = new JLabel(iceland);
	    
	    ImageIcon irelandIc = new ImageIcon(ClassLoader.getSystemResource("honeyImages/ireland.jpg"));
	    Image irelandImg = irelandIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon ireland = new ImageIcon(irelandImg);
	    JLabel irelandLbl = new JLabel(ireland);
	    
	    ImageIcon maldivesIc = new ImageIcon(ClassLoader.getSystemResource("honeyImages/maldives.jpg"));
	    Image maldivesImg = maldivesIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon maldives = new ImageIcon(maldivesImg);
	    JLabel maldivesLbl = new JLabel(maldives);
	    
	    ImageIcon polandIc = new ImageIcon(ClassLoader.getSystemResource("honeyImages/poland.jpg"));
	    Image polandImg = polandIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon poland = new ImageIcon(polandImg);
	    JLabel polandLbl = new JLabel(poland);
	   
	    ImageIcon scotlandIc = new ImageIcon(ClassLoader.getSystemResource("honeyImages/scotland.jpg"));
	    Image scotlandImg = scotlandIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon scotland = new ImageIcon(scotlandImg);
	    JLabel scotlandLbl = new JLabel(scotland);
	  
	    ImageIcon sikkimIc = new ImageIcon(ClassLoader.getSystemResource("honeyImages/sikkim.jpg"));
	    Image sikkimImg = sikkimIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon sikkim = new ImageIcon(sikkimImg);
	    JLabel sikkimLbl = new JLabel(sikkim);
	   
	  
		Honeymoon(){
			
			setVisible(true);
			setSize(940,600);
			setLocation(200,50);
			setResizable(false);
			setLayout(new GridLayout(3, 3, 5, 5));
			setTitle("Honeymoon");
			
			add(icelandLbl);
			add(irelandLbl);
			add(maldivesLbl);
			add(polandLbl);
			add(scotlandLbl);
			add(sikkimLbl);
			
			addMouseListener();

		}
		
	public void addMouseListener(){
			
			icelandLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == icelandLbl){
						
						new icelandPackage();
						dispose();
					}
					
					
				}
			});
			
			irelandLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == irelandLbl){
						
						new irelandPackage();
						dispose();
					}
					
					
				}
			});
			
			maldivesLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == maldivesLbl){
						
						new maldivesPackage();
						dispose();
					}
					
					
				}
			});
			polandLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == polandLbl){
						
						new polandPackage();
						dispose();
					}
					
					
				}
			});
			scotlandLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == scotlandLbl){
						
						new scotlandPackage();
						dispose();
					}
					
					
				}
			});
			
			sikkimLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == sikkimLbl){
						
						new sikkimPackage();
						dispose();
					}
					
					
				}
			});

	}
}

