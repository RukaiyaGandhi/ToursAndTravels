package book;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class customerDetail extends JFrame  {
		
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("buttonIcon/bg.jpg"));
	Image i2 = i1.getImage().getScaledInstance(940, 600, Image.SCALE_DEFAULT);
	ImageIcon i3 = new ImageIcon(i2);
	JLabel icon = new JLabel(i3);
	
	JLabel fullnameLabel = new JLabel("Fullname");
	JTextField fullnameTextField = new JTextField();
	
	JLabel genderLabel = new JLabel("Gender");
	JRadioButton maleRadio = new JRadioButton("Male");
		
	JRadioButton femaleRadio = new JRadioButton("Female");
	JRadioButton otherRadio = new JRadioButton("Other");
    ButtonGroup G1 = new ButtonGroup();
	
	JLabel addressLabel = new JLabel("Address");
	JTextField addressTextField = new JTextField();
	
	JLabel contactLabel = new JLabel("Contact");
	JTextField contactTextField = new JTextField();
	
	JLabel emailLabel = new JLabel("Email");
	JTextField emailTextField = new JTextField();
	
	JLabel idLabel = new JLabel("Aadhar no.");
	JTextField idTextField = new JTextField();
	
	JButton book = new JButton("SUBMIT");

	Connection Conn;
	Statement Stm ;
	ResultSet Rs ;
	
	public customerDetail() {
		
		
		setLocationAndSize();
		addComponents();
		addingActionListner();
		
		setTitle("Customer Details");
		setSize(940, 600);
		add(icon);
		setVisible(true);
		setLocation(200, 50);
		setResizable(false);
		
	}
	
	public void setLocationAndSize(){
		
				// FullName
				fullnameLabel.setBounds(50, 30, 120, 30);
				fullnameLabel.setForeground(Color.white);
				fullnameLabel.setFont(new Font("Serif", Font.BOLD, 18));

				fullnameTextField.setBounds(150, 30, 300, 30);
				fullnameTextField.setFont(new Font("Serif", Font.BOLD, 18));
				
				//Gender
				genderLabel.setBounds(50, 70, 120, 30);
				genderLabel.setForeground(Color.white);
				genderLabel.setFont(new Font("Serif", Font.BOLD, 18));
				
				maleRadio.setBounds(150, 70, 100, 30);
				maleRadio.setForeground(Color.white);
				maleRadio.setFont(new Font("Serif", Font.BOLD, 18));
				maleRadio.setOpaque(false);
				maleRadio.setFocusable(false);
				maleRadio.setActionCommand("Male");
				
				femaleRadio.setBounds(250, 70, 100, 30);
				femaleRadio.setForeground(Color.white);
				femaleRadio.setFont(new Font("Serif", Font.BOLD, 18));
				femaleRadio.setOpaque(false);
				femaleRadio.setFocusable(false);
				femaleRadio.setActionCommand("Female");

				otherRadio.setBounds(350, 70, 100, 30);
				otherRadio.setForeground(Color.white);
				otherRadio.setFont(new Font("Serif", Font.BOLD, 18));
				otherRadio.setOpaque(false);
				otherRadio.setFocusable(false);
				otherRadio.setActionCommand("Others");
				
				// Address
				addressLabel.setBounds(50, 110, 120, 30);
				addressLabel.setForeground(Color.white);
				addressLabel.setFont(new Font("Serif", Font.BOLD, 18));

				addressTextField.setBounds(150, 110, 300, 30);
				addressTextField.setFont(new Font("Serif", Font.BOLD, 18));
				
				// Contact
				contactLabel.setBounds(50, 150, 120, 30);
				contactLabel.setForeground(Color.white);
				contactLabel.setFont(new Font("Serif", Font.BOLD, 18));
				
				contactTextField.setBounds(150, 150, 300, 30);
				contactTextField.setFont(new Font("Serif", Font.BOLD, 18));
				
				// Email
				emailLabel.setBounds(50, 190, 120, 30);
				emailLabel.setForeground(Color.white);
				emailLabel.setFont(new Font("Serif", Font.BOLD, 18));

				emailTextField.setBounds(150, 190, 300, 30);
				emailTextField.setFont(new Font("Serif", Font.BOLD, 18));
				
				// Id
				idLabel.setBounds(50, 230, 230, 30);
				idLabel.setForeground(Color.white);
				idLabel.setFont(new Font("Serif", Font.BOLD, 18));

				idTextField.setBounds(150, 230, 300, 30);
				idTextField.setFont(new Font("Serif", Font.BOLD, 18));

				
				// OK btn
				book.setBounds(230, 300, 90, 30);
				book.setBackground(Color.white);
				book.setForeground(Color.black);
				book.setFocusable(false);
			
				

	}
	
	public void addComponents() {
		
		
		add(fullnameLabel);
		add(fullnameTextField);
		
		add(genderLabel);
		add(maleRadio);
		add(femaleRadio);
		add(otherRadio);
		G1.add(maleRadio);
		
		G1.add(femaleRadio);
		
		G1.add(otherRadio);
		
		
		add(addressLabel);
		add(addressTextField);
		
		add(contactLabel);
		add(contactTextField);
		
		add(emailLabel);
		add(emailTextField);
		
		add(idLabel);
		add(idTextField);
		
		add(book);
	}
	
	public void addingActionListner(){
		
		book.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String	Name=fullnameTextField.getText();
			String  Address =addressTextField.getText();
			String Contact= contactTextField.getText();
			String Email=emailTextField.getText();
			String Adhar = idTextField.getText();
//			int Gender = G1.getButtonCount();
			String		Gender = G1.getSelection().getActionCommand();
				if (e.getSource() == book)
				{
					String SQL="";
					SQL="insert into tbl_customers(Name,Gender,Address,Email_ID,Adhar_no,Contact_no) values("
							+"'"+Name+"',"
							+"'"+Gender+"',"
							+"'"+Address+"',"
							+"'"+Email+"',"
							+"'"+Adhar+"',"
							+"'"+Contact+"'"
				+");";
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
//						System.out.print("Class/ConnectionFound");
						String url="jdbc:mysql://localhost:3306/A_R_TRAVELS";
						
						String user="root";
						String password="";
						Conn =DriverManager.getConnection(url, user, password);
//						System.out.print("Class/ConnectionFound");
						Stm = Conn.createStatement();
						Stm.execute(SQL);
//						System.out.print("\n Inserted\n");
						
//						SQL ="Select Fullname,Gender,Address,Contact,Email,Adharno from tbl_customer;";
//						
//						Rs = Stm.executeQuery(SQL);
//						while(Rs.next())
//							{System.out.println(" \n" +Rs.getString(1)
//						+" \n"+ Rs.getString(2)
//						+" \n"+ Rs.getString(3)
//						+" \n"+ Rs.getString(4)
//						+" \n"+ Rs.getString(5)
//						+" \n"+ Rs.getString(6)
//						+" \n");
//					}
					}
					catch (Exception exc)
					{
						// TODO Auto-generated catch block
						System.out.println(exc+"\n");
						
					}
					dispose();
					new bookingDetail();
				}
				
			}
		});
	}

}
