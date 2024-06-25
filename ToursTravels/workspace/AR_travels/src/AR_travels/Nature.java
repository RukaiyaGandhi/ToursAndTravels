package AR_travels;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.net.ssl.HostnameVerifier;
import javax.swing.*;

import packages.goaPackage;
import packages.jordanPackage;
import packages.kerelaPackage;
import packages.norwayPackage;
import packages.odishaPackage;
import packages.thailandPackage;

public class Nature extends JFrame{
	
    ImageIcon norwayIc = new ImageIcon(ClassLoader.getSystemResource("natureImages/norway.jpg"));
    Image norwayImg = norwayIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
    ImageIcon norway = new ImageIcon(norwayImg);
    JLabel norwayLbl = new JLabel(norway);
    
    ImageIcon goaIc = new ImageIcon(ClassLoader.getSystemResource("natureImages/goa.jpg"));
    Image goaImg = goaIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
    ImageIcon goa = new ImageIcon(goaImg);
    JLabel goaLbl = new JLabel(goa);
    
    ImageIcon odishaIc = new ImageIcon(ClassLoader.getSystemResource("natureImages/odisha.jpg"));
    Image odishaImg = odishaIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
    ImageIcon odisha = new ImageIcon(odishaImg);
    JLabel odishaLbl = new JLabel(odisha);
    
    ImageIcon kerelaIc = new ImageIcon(ClassLoader.getSystemResource("natureImages/kerela.jpg"));
    Image kerelaImg = kerelaIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
    ImageIcon kerela = new ImageIcon(kerelaImg);
    JLabel kerelaLbl = new JLabel(kerela);
   
    ImageIcon thailandIc = new ImageIcon(ClassLoader.getSystemResource("natureImages/thailand.jpg"));
    Image thailandImg = thailandIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
    ImageIcon thailand = new ImageIcon(thailandImg);
    JLabel thailandLbl = new JLabel(thailand);
  
    ImageIcon jordanIc = new ImageIcon(ClassLoader.getSystemResource("natureImages/jordan.jpg"));
    Image jordanImg = jordanIc.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
    ImageIcon jordan = new ImageIcon(jordanImg);
    JLabel jordanLbl = new JLabel(jordan);
   
  
	Nature(){
		
		setVisible(true);
		setSize(940,600);
		setLocation(200,50);
		setResizable(false);
		setLayout(new GridLayout(3, 3, 5, 5));
		setTitle("Nature");
		
		add(norwayLbl);
		add(goaLbl);
		add(odishaLbl);
		add(kerelaLbl);
		add(thailandLbl);
		add(jordanLbl);
		
		addMouseListener();

	}

	public void addMouseListener(){
		
		norwayLbl.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e){
				
				if(e.getSource() == norwayLbl){
					
					new norwayPackage();
					dispose();
				}
				
				
			}
		});
		goaLbl.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e){
				
				if(e.getSource() == goaLbl){
					
					new goaPackage();
					dispose();
				}
				
				
			}
		});
		odishaLbl.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e){
				
				if(e.getSource() == odishaLbl){
					
					new odishaPackage();
					dispose();
				}
				
				
			}
		});
		
		kerelaLbl.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e){
				
				if(e.getSource() == kerelaLbl){
					
					new kerelaPackage();
					dispose();
				}
				
				
			}
		});
		thailandLbl.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e){
				
				if(e.getSource() == thailandLbl){
					
					new thailandPackage();
					dispose();
				}
				
				
			}
		});
		jordanLbl.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e){
				
				if(e.getSource() == jordanLbl){
					
					new jordanPackage();
					dispose();
				}
				
				
			}
		});
		
	}
		
}