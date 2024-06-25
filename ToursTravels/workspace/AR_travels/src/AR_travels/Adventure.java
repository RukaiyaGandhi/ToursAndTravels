package AR_travels;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import packages.alleppyPackage;
import packages.darjeelingPackage;
import packages.gulmargPackage;
import packages.himachalPackage;
import packages.hungaryPackage;
import packages.kumarakomPackage;
import packages.norwayPackage;

public class Adventure extends JFrame {
	
	    ImageIcon alleppyIc = new ImageIcon(ClassLoader.getSystemResource("advImages/alleppy.jpg"));
	    Image alleppyImg = alleppyIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon alleppy = new ImageIcon(alleppyImg);
	    JLabel alleppyLbl = new JLabel(alleppy);
	    
	    ImageIcon darjeelingIc = new ImageIcon(ClassLoader.getSystemResource("advImages/darjeeling.jpg"));
	    Image darjeelingImg = darjeelingIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon darjeeling = new ImageIcon(darjeelingImg);
	    JLabel darjeelingLbl = new JLabel(darjeeling);
	    
	    ImageIcon gulmargIc = new ImageIcon(ClassLoader.getSystemResource("advImages/gulmarg.jpg"));
	    Image gulmargImg = gulmargIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon gulmarg = new ImageIcon(gulmargImg);
	    JLabel gulmargLbl = new JLabel(gulmarg);
	    
	    ImageIcon himachalIc = new ImageIcon(ClassLoader.getSystemResource("advImages/himachal.jpg"));
	    Image himachalImg = himachalIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon himachal = new ImageIcon(himachalImg);
	    JLabel himachalLbl = new JLabel(himachal);
	   
	    ImageIcon hungaryIc = new ImageIcon(ClassLoader.getSystemResource("advImages/hungary.jpg"));
	    Image hungaryImg = hungaryIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon hungary = new ImageIcon(hungaryImg);
	    JLabel hungaryLbl = new JLabel(hungary);
	  
	    ImageIcon kumarakomIc = new ImageIcon(ClassLoader.getSystemResource("advImages/kumarakom.jpg"));
	    Image kumarakomImg = kumarakomIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	    ImageIcon kumarakom = new ImageIcon(kumarakomImg);
	    JLabel kumarakomLbl = new JLabel(kumarakom);
	   
	  
		Adventure(){
			
			setVisible(true);
			setSize(940,600);
			setLocation(200,50);
			setResizable(false);
			setLayout(new GridLayout(3, 3, 5, 5));
			setTitle("Adventure");
			
			add(alleppyLbl);
			add(darjeelingLbl);
			add(gulmargLbl);
			add(himachalLbl);
			add(hungaryLbl);
			add(kumarakomLbl);
			
			addMouseListener();

		}
		
		public void addMouseListener(){
			
			alleppyLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == alleppyLbl){
						
						new alleppyPackage();
						dispose();
					}
					
					
				}
			});
			
			darjeelingLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == darjeelingLbl){
						
						new darjeelingPackage();
						dispose();
					}
					
					
				}
			});
		
				
				gulmargLbl.addMouseListener(new MouseAdapter() {
					
					public void mouseClicked(MouseEvent e){
						
						if(e.getSource() == gulmargLbl){
							
							new gulmargPackage();
							dispose();
						}
						
						
					}
				});
				
        	himachalLbl.addMouseListener(new MouseAdapter() {
					
					public void mouseClicked(MouseEvent e){
						
						if(e.getSource() == himachalLbl){
							
							new himachalPackage();
							dispose();
						}
						
						
					}
				});
        	
        	hungaryLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == hungaryLbl){
						
						new hungaryPackage();
						dispose();
					}
					
					
				}
			});
        	kumarakomLbl.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e){
					
					if(e.getSource() == kumarakomLbl){
						
						new kumarakomPackage();
						dispose();
						
					}
					
					
				}
			});
				
	}
		}

