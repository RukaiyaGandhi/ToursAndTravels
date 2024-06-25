package book;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Print extends JFrame{
	Connection cn;
	ResultSet Rs;
	Statement stm;
	String url , pass, user,Sql,load;
	JLabel Name ,
	Gender,
	address,
	contact,
	Email,
	AdharNo,
	TourType,Package,
	Month,Operator,
	Amount,Payment;
	JLabel Waste=new JLabel("");
	public Print() 
	{
		
		FetchDetailsBooking();
		FetchDetailsofcustomer();
		FetchDetailsofPayment();
		lableSize();
		addComponets();
		setTitle("Details");
		setSize(940, 600);
		setVisible(true);
		setLocation(200, 50);
		setResizable(true);
	}
	public void addComponets()
	{
		add(Name);
		add(Gender);
		add(address);
		add(contact);
		add(Email);
		add(AdharNo);
		add(Package);
		add(TourType);
		add(Operator);
		add(Month);
		add(Amount);
		add(Payment);
		add(Waste);
		
	}
	void FetchDetailsofcustomer()
	{
		url="jdbc:mysql://localhost:3306/A_R_TRAVELS";
		user="root";
		pass="";
		load="com.mysql.jdbc.Driver";
		try
		{
			Class.forName(load);
			cn=DriverManager.getConnection(url, user, pass);
			System.out.println("Done");
			Sql="Select Custmers_ID FROM tbl_booking order by Booking_ID DESC limit 1";
			stm = cn.createStatement();
			Rs = stm.executeQuery(Sql);
			Rs.next();
			int CustomerID = Rs.getInt("Custmers_ID");
//			System.out.println(CustomerID);
			Sql="SELECT Name, Gender, Address, Email_ID, Adhar_no, Contact_no FROM tbl_customers Where Custmers_ID ="+CustomerID+";";
			stm = cn.createStatement();
			Rs = stm.executeQuery(Sql);
			while(Rs.next())
			{
				Name = new JLabel("Name : "+Rs.getString("Name"));
				Gender= new JLabel("Gender : "+Rs.getString("Gender"));
				address = new JLabel("Address : "+Rs.getString("Address"));
				Email = new JLabel("Email : "+Rs.getString("Email_ID"));
				AdharNo= new JLabel("Adhar No : "+Rs.getString("Adhar_no"));
				contact = new JLabel("Contact No. : "+Rs.getString("Contact_no"));
//				Rs.close();
			}
		}
		
		
		catch (Exception e) 
		{
			System.out.println("Error  : "+e);
		}
	}
	
 public	void FetchDetailint()
	{
		url="jdbc:mysql://localhost:3306/A_R_TRAVELS";
		user="root";
		pass="";
		load="com.mysql.jdbc.Driver";
	 int CustomerID,MonthID,PackageID,TourId,operatorID;
		try
		{
			Class.forName(load);
			cn=DriverManager.getConnection(url, user, pass);
//			System.out.println("Done");
			Sql="Select Month_ID,Package_id,TourType_Id,Operator_ID FROM tbl_booking order by Booking_ID DESC limit 1";
			stm = cn.createStatement();
			Rs=stm.executeQuery(Sql);
			while(Rs.next())
			{
				MonthID=Rs.getInt("Month_ID");
				PackageID=Rs.getInt("Package_id");
				TourId = Rs.getInt("TourType_Id");
				operatorID = Rs.getInt("Operator_ID");
//			System.out.println(MonthID);
//			stm.close();
			Sql="Select Month_Name from tbl_month where Month_ID="+MonthID;
			stm=cn.createStatement();
			Rs=stm.executeQuery(Sql);
			while(Rs.next())
			{
				Month = new JLabel("Month : "+Rs.getString(1));
			}
//			System.out.println(operatorID);
//			stm.close();
			Sql="Select Operator_Name from tbl_operator where Operator_ID = "+operatorID;
			stm=cn.createStatement();
			Rs=stm.executeQuery(Sql);
			while(Rs.next())
			{
				Operator= new JLabel("Operator name Name : "+Rs.getString(1));
			}
//			System.out.println(PackageID);
//			stm.close();
			Sql="Select Destination from tbl_packages where Package_ID = "+PackageID;
			stm=cn.createStatement();
			Rs=stm.executeQuery(Sql);
			while(Rs.next())
			{
				Package= new JLabel("Pakage Name : "+Rs.getString(1));
			}
//			System.out.println(TourId);
//			stm.close();
			Sql="Select TourType_Name FROM tbl_tourtype where TourType_ID = "+TourId;
			stm=cn.createStatement();
			Rs=stm.executeQuery(Sql);
			while(Rs.next())
			{
				TourType= new JLabel("Tour Name : "+Rs.getString(1));
			}
			
			}
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			System.out.println("Error  : "+e);
		}
	
	}
 void FetchDetailsBooking()
	{
		FetchDetailint();
	
	}
	void FetchDetailsofPayment()
	{
		url="jdbc:mysql://localhost:3306/A_R_TRAVELS";
		user="root";
		pass="";
		load="com.mysql.jdbc.Driver";
		try {
			Class.forName(load);
			cn=DriverManager.getConnection(url, user, pass);
//			System.out.println("Done");
			Sql="SELECT Payment_Amount,Payment_Method From tbl_payment order by Payment_ID DESC limit 1;";
			stm = cn.createStatement();
			Rs=stm.executeQuery(Sql);
			while(Rs.next())
			{
				Amount =  new JLabel("Amount : "+Rs.getString("Payment_Amount"));
				Payment = new JLabel("Method_Payment : "+Rs.getString("Payment_Method"));
			}
			stm.close();
		} 
		catch (Exception e) {
			System.out.println("Error  : "+e);
		}
	}
	public void lableSize()
	{
		//name
				Name.setBounds(250, 40, 500, 50);
				Name.setForeground(Color.RED);
				Name.setFont(new Font("Serif", Font.BOLD,20));
		//gender
				Gender.setBounds(250, 80, 500, 50);
				Gender.setForeground(Color.RED);
				Gender.setFont(new Font("Serif", Font.BOLD,20));
		//address
				address.setBounds(250, 120, 500, 50);
				address.setForeground(Color.RED);
				address.setFont(new Font("Serif", Font.BOLD,20));
		//contact
				contact.setBounds(250, 160, 500, 50);
				contact.setForeground(Color.RED);
				contact.setFont(new Font("Serif", Font.BOLD,20));
		//Email
				Email.setBounds(250, 200, 500, 50);
				Email.setForeground(Color.RED);
				Email.setFont(new Font("Serif", Font.BOLD,20));
		//AdharNo
				AdharNo.setBounds(250, 240, 500, 50);
				AdharNo.setForeground(Color.RED);
				AdharNo.setFont(new Font("Serif", Font.BOLD,20));

		//package
				Package.setBounds(250, 280, 500, 50);
				Package.setForeground(Color.RED);
				Package.setFont(new Font("Serif", Font.BOLD,20));

		//TourType
				TourType.setBounds(250, 320, 500, 50);
				TourType.setForeground(Color.RED);
				TourType.setFont(new Font("Serif", Font.BOLD,20));

		//operator
				Operator.setBounds(250, 360, 500, 50);
				Operator.setForeground(Color.RED);
				Operator.setFont(new Font("Serif", Font.BOLD,20));
	
		//month
				Month.setBounds(250, 400, 500, 50);
				Month.setForeground(Color.RED);
				Month.setFont(new Font("Serif", Font.BOLD,20));
			
		//Amount
				Amount.setBounds(250, 440, 500, 50);
				Amount.setForeground(Color.RED);
				Amount.setFont(new Font("Serif", Font.BOLD,20));
		//Payment
				Payment.setBounds(250,480, 500, 50);
				Payment.setForeground(Color.RED);
				Payment.setFont(new Font("Serif", Font.BOLD,20));
			
		//waste
				Waste.setBounds(250,520, 500, 50);
				Waste.setForeground(Color.RED);
				Waste.setFont(new Font("Serif", Font.BOLD,20));
						
	}
}