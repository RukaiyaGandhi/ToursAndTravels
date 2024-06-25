package AR_travels;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import packages.ajerbaijanPackage;
import packages.fijiPackage;
import packages.hongkongPackage;
import packages.icelandPackage;
import packages.irelandPackage;
import packages.ladakhPackage;
import packages.maldivesPackage;
import packages.polandPackage;
import packages.scotlandPackage;
import packages.sikkimPackage;
import packages.singaporePackage;
import packages.spainPackage;

public class Friend extends JFrame{
	
	    ImageIcon azerbaijanIc = new ImageIcon(ClassLoader.getSystemResource("friendImages/azerbaijan.jpg"));
	    Image azerbaijanImg = azerbaijanIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon azerbaijan = new ImageIcon(azerbaijanImg);
	    JLabel azerbaijanLbl = new JLabel(azerbaijan);
	    
	    ImageIcon fijiIc = new ImageIcon(ClassLoader.getSystemResource("friendImages/fiji.jpg"));
	    Image fijiImg = fijiIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon fiji = new ImageIcon(fijiImg);
	    JLabel fijiLbl = new JLabel(fiji);
	    
	    ImageIcon hongkongIc = new ImageIcon(ClassLoader.getSystemResource("friendImages/hongkong.jpg"));
	    Image hongkongImg = hongkongIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon hongkong = new ImageIcon(hongkongImg);
	    JLabel hongkongLbl = new JLabel(hongkong);
	    
	    ImageIcon ladakhIc = new ImageIcon(ClassLoader.getSystemResource("friendImages/ladakh.jpg"));
	    Image ladakhImg = ladakhIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon ladakh = new ImageIcon(ladakhImg);
	    JLabel ladakhLbl = new JLabel(ladakh);
	   
	    ImageIcon singaporIc = new ImageIcon(ClassLoader.getSystemResource("friendImages/singapor.jpg"));
	    Image singaporImg = singaporIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon singapor = new ImageIcon(singaporImg);
	    JLabel singaporLbl = new JLabel(singapor);
	  
	    ImageIcon spainIc = new ImageIcon(ClassLoader.getSystemResource("friendImages/spain.jpg"));
	    Image spainImg = spainIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon spain = new ImageIcon(spainImg);
	    JLabel spainLbl = new JLabel(spain);
	   
	  
		Friend(){
			
			setVisible(true);
			setSize(940,600);
			setLocation(200,50);
			setResizable(false);
			setLayout(new GridLayout(3, 2, 5, 5));
			setTitle("Friend");
			
			add(azerbaijanLbl);
			add(fijiLbl);
			add(hongkongLbl);
			add(ladakhLbl);
			add(singaporLbl);
			add(spainLbl);
			
			addMouseListener();

		}
		public void addMouseListener(){
			
	      azerbaijanLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == azerbaijanLbl){
						
						new ajerbaijanPackage();
						dispose();
					}
					
					
				}
			});
			
			fijiLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == fijiLbl){
						
						new fijiPackage();
						dispose();
					}
					
					
				}
			});
			
			hongkongLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == hongkongLbl){
						
						new hongkongPackage();
						dispose();
					}
					
					
				}
			});
			singaporLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == singaporLbl){
						
						new singaporePackage();
						dispose();
					}
					
					
				}
			});
			spainLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == spainLbl){
						
						new spainPackage();
						dispose();
					}
					
					
				}
			});
			
			ladakhLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == ladakhLbl){
						
						new ladakhPackage();
						dispose();
					}
					
					
				}
			});

}
	}

