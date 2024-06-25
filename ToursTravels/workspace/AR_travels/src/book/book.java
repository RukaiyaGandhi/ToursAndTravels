package book;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class book extends JFrame {
	
	 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/bg.jpg"));
	    Image i2 = i1.getImage().getScaledInstance(940, 600, Image.SCALE_DEFAULT);
	    ImageIcon i3 = new ImageIcon(i2);
	    JLabel icon = new JLabel(i3);
		
	
	JFrame option = new JFrame();
	
	 JLabel fullnameLabel=new JLabel("Fullname");
	 JTextField fullnameTextField=new JTextField();
	 
	 JLabel addressLabel=new JLabel("Address");
	 JTextField addressTextField=new JTextField();
	 
	 JLabel contactLabel=new JLabel("Contact");
	 JTextField contactTextField=new JTextField();
	 
	 JLabel emailLabel=new JLabel("Email");
	 JTextField emailTextField=new JTextField();
	 
	 JLabel idLabel=new JLabel("I'd no.");
	 JTextField idTextField=new JTextField();
	 
	 JLabel packageLabel=new JLabel("Package");
	 String pkg[]={"Norway" , "Goa","Odisha","Kerela"};        
	 JComboBox packageCombo = new JComboBox(pkg);    
	 
	 JLabel monthLabel=new JLabel("Month");
	 String month[]={"January" , "February"};        
	 JComboBox monthCombo = new JComboBox(month); 
	 
	 JLabel departureLabel=new JLabel("Departure");
	 JTextField departureTextField=new JTextField("Mumbai-Mumbai");
	 
	 JLabel amountLabel=new JLabel("Amount");
	// String a;
	 JTextField amountTextField = new JTextField();
	 
	 JLabel paymethodLabel=new JLabel("Payment");
	 JTextField paymethodTextField=new JTextField("Cash");
	 
	 JButton book = new JButton("BOOK NOW");
	 
	 //JButton backBtn = new JButton("←");
	 
	 
	 
	
	public book(){
		
		addingItemListner();
	//	setLayoutManager();
		setLocationAndSize();
		addComponents();
		
		addingActionListner();
		
		setTitle("Book");
        setSize(940,600);
        add(icon);
        setVisible(true);
        setLocation(200,50);
        setResizable(false);
		
	}
	
//	 public void setLayoutManager()
//	    {
//	        setLayout(null);
//	    }
	 
	 public void setLocationAndSize()
	    {
		 //FullName
	       fullnameLabel.setBounds(250,30,120,30);
	       fullnameLabel.setForeground(Color.white);
	       fullnameLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       fullnameTextField.setBounds(350,30,300,30);
	       fullnameTextField.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       //Address
	       addressLabel.setBounds(250,70,120,30);
	       addressLabel.setForeground(Color.white);
	       addressLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       addressTextField.setBounds(350,70,300,30);
	       addressTextField.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       
	       //Contact
	       contactLabel.setBounds(250,110,120,30);
	       contactLabel.setForeground(Color.white);
	       contactLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       contactTextField.setBounds(350,110,300,30);
	       contactTextField.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       //Email
	       emailLabel.setBounds(250,150,120,30);
	       emailLabel.setForeground(Color.white);
	       emailLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       emailTextField.setBounds(350,150,300,30);
	       emailTextField.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       //Id
	       idLabel.setBounds(250,190,120,30);
	       idLabel.setForeground(Color.white);
	       idLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       idTextField.setBounds(350,190,300,30);
	       idTextField.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       //Package
	       packageLabel.setBounds(250,230,120,30);
	       packageLabel.setForeground(Color.white);
	       packageLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       packageCombo.setBounds(350,230,300,30);
	       packageCombo.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       
	       //Month
	       monthLabel.setBounds(250,270,120,30);
	       monthLabel.setForeground(Color.white);
	       monthLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       monthCombo.setBounds(350,270,300,30);
	       monthCombo.setFont(new Font("Serif", Font.BOLD, 18));
	       
	     //Departure
	       departureLabel.setBounds(250,310,120,30);
	       departureLabel.setForeground(Color.white);
	       departureLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       departureTextField.setBounds(350,310,300,30);
	       departureTextField.setFont(new Font("Serif", Font.BOLD, 18));
	       departureTextField.setEditable(false);
	       
	       //Amount
	       amountLabel.setBounds(250,350,120,30);
	       amountLabel.setForeground(Color.white);
	       amountLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       amountTextField.setBounds(350,350,300,30);
	       amountTextField.setFont(new Font("Serif", Font.BOLD, 18));
	       amountTextField.setEditable(false);
	       
	       //Payment
	       paymethodLabel.setBounds(250,390,120,30);
	       paymethodLabel.setForeground(Color.white);
	       paymethodLabel.setFont(new Font("Serif", Font.BOLD, 18));
	       
	       paymethodTextField.setBounds(350,390,300,30);
	       paymethodTextField.setFont(new Font("Serif", Font.BOLD, 18));
	       paymethodTextField.setEditable(false);
	       
	       //book
	       book.setBounds(420,450,100,30);
	       book.setBackground(Color.white);
		   book.setForeground(Color.black);
		   book.setFocusable(false);
		   
//		   //Back Button
//		   backBtn.setBounds(0,10,100,20);
//		   backBtn.setOpaque(false);
//		   backBtn.setContentAreaFilled(false);
//		   backBtn.setBorderPainted(false);
//		   backBtn.setFocusable(false);
//		   backBtn.setFont(new Font("Serif", Font.BOLD, 40));
	    }
	 
	 public void addComponents(){
		 
		 add(fullnameLabel);
		 add(fullnameTextField);
		 
		 add(addressLabel);
		 add(addressTextField);
		 
		 add(contactLabel);
		 add(contactTextField);
		 
		 add(emailLabel);
		 add(emailTextField);
		 
		 add(idLabel);
		 add(idTextField);
		 
		 add(packageLabel);
		 add( packageCombo);
		 
		 add(monthLabel);
		 add(monthCombo);
		 
		 add(departureLabel);
		 add(departureTextField);
		 
		 add(amountLabel);
		 add(amountTextField);
		 
		 add(paymethodLabel);
		 add(paymethodTextField);
		 
		 add(book);
		 
    	// add(backBtn);
	 }
	 
	 public void addingItemListner(){
		 
			packageCombo.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				          Object item = e.getItem();
				          if(e.getItem()=="Norway"){
				        	  amountTextField.setText("1,30,000");
				          }else
				          if(e.getItem() == "Goa"){
				        	  amountTextField.setText("15,000");
				          }
				          else
					          if(e.getItem() == "Odisha"){
					        	  amountTextField.setText("10,000");
					          }
					          else
						          if(e.getItem() == "Kerela"){
						        	  amountTextField.setText("15,000");
						          }
				          else{
				        	  amountTextField.setText("0");
				          }
				          
				       }
					
				}
			});
		 
	 }
	 
	 public void addingActionListner(){
		 
		 book.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(e.getSource() == book){
					
					JOptionPane.showMessageDialog(option, "Your Booking is Successful", "Booked", JOptionPane.INFORMATION_MESSAGE );
				}
			}
		});
	 }
	 

}
