package packages;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import book.book;
import book.bookingDetail;
import book.customerDetail;

public class bangkokPackage extends JFrame implements ActionListener {
	
		
	    ImageIcon bangkokIc = new ImageIcon(ClassLoader.getSystemResource("packageTemplate/BangkokPackage.png"));
	    Image bangkokImg = bangkokIc.getImage().getScaledInstance(940, 600, Image.SCALE_DEFAULT);
	    ImageIcon bangkok = new ImageIcon(bangkokImg);
	    JLabel bangkokLbl = new JLabel(bangkok);
	    
	    JButton bookBtn = new JButton("BOOK NOW");
		
		  public bangkokPackage() {
		
			setVisible(true);
			setSize(940,600);
			setLocation(200,50);
			setResizable(false);
			setTitle("Bangkok Package");
			 
			addComponents();
			addActionListner();
		}
		  
		  public void addComponents(){
			  
			    add(bookBtn);
				bookBtn.setBounds(450,510,100,30);
				bookBtn.setBackground(Color.white);
				bookBtn.setForeground(Color.black);
				bookBtn.setFocusable(false);
				
				add(bangkokLbl);
			  
			  
		  }
		  
		  public void addActionListner(){
			  
			  bookBtn.addActionListener(this);
		  }

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == bookBtn){
				dispose();
				new bookingDetail();
				
//				new customerDetail();
			}
			
		}

	
}
