package packages;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import book.book;
import book.bookingDetail;
import book.customerDetail;

public class kerelaPackage extends JFrame implements ActionListener{
	
    ImageIcon kerelaIc = new ImageIcon(ClassLoader.getSystemResource("packageTemplate/KerelaPackage.png"));
    Image kerelaImg = kerelaIc.getImage().getScaledInstance(940, 600, Image.SCALE_DEFAULT);
    ImageIcon kerela = new ImageIcon(kerelaImg);
    JLabel norwayLbl = new JLabel(kerela);
    
    JButton bookBtn = new JButton("BOOK NOW");
	
	  public kerelaPackage() {
	
		setVisible(true);
		setSize(940,600);
		setLocation(200,50);
		setResizable(false);
		setTitle("Kerela Package");
		 
		addComponents();
		addActionListner();
	}
	  
	  public void addComponents(){
		  
		    add(bookBtn);
			bookBtn.setBounds(450,510,100,30);
			bookBtn.setBackground(Color.white);
			bookBtn.setForeground(Color.black);
			bookBtn.setFocusable(false);
			
			add(norwayLbl);
		  
		  
	  }
	  
	  public void addActionListner(){
		  
		  bookBtn.addActionListener(this);
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == bookBtn){
			dispose();
			new bookingDetail();
			
//			new customerDetail();
		}
		
	}

}
