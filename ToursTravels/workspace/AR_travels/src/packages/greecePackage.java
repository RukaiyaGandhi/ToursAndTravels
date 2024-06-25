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

public class greecePackage extends JFrame implements ActionListener {
	
		
	    ImageIcon greeceIc = new ImageIcon(ClassLoader.getSystemResource("packageTemplate/GreecePackage.png"));
	    Image greeceImg = greeceIc.getImage().getScaledInstance(940, 600, Image.SCALE_DEFAULT);
	    ImageIcon greece = new ImageIcon(greeceImg);
	    JLabel greeceLbl = new JLabel(greece);
	    
	    JButton bookBtn = new JButton("BOOK NOW");
		
		  public greecePackage() {
		
			setVisible(true);
			setSize(940,600);
			setLocation(200,50);
			setResizable(false);
			setTitle("Greece Package");
			 
			addComponents();
			addActionListner();
		}
		  
		  public void addComponents(){
			  
			    add(bookBtn);
				bookBtn.setBounds(450,510,100,30);
				bookBtn.setBackground(Color.white);
				bookBtn.setForeground(Color.black);
				bookBtn.setFocusable(false);
				
				add(greeceLbl);
			  
			  
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
