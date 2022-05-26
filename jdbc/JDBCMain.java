package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class JDBCMain {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mysql_work_shop";
			String uname="hbstudent";
			String pass="hbstudent";	
			Connection con = DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Success");
			Scanner sc=new Scanner(System.in);
			
			//read operation
//			Statement st = con.createStatement();
//			ResultSet rs=st.executeQuery("select * from student");
//			System.out.println("Enter an ID: ");
//			int id=sc.nextInt();
//			PreparedStatement pst=con.prepareStatement("select * from student where id= ?");
//			pst.setInt(1, id);
//			ResultSet rs= pst.executeQuery();
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "
//			          +rs.getString(3)+" | "+rs.getInt(4));
//			}
			
			
			//update operation
//			System.out.println("Enter the ID: ");
//			int id=sc.nextInt();
//			System.out.println("Enter the new age");
//			int age=sc.nextInt();
//			PreparedStatement pst =con.prepareStatement("update student set age= ? where id =?");
//			pst.setInt(1, age);
//			pst.setInt(2, id);
//			int n= pst.executeUpdate();
//			System.out.println(n+" rows affected.");
			
			
			//insert operation
//			System.out.println("Enter name: ");
//			String name=sc.nextLine();
//			System.out.println("Enter email: ");
//			String email=sc.nextLine();
//			System.out.println("Enter age: ");
//			int age=sc.nextInt();
//			System.out.println("Enter ID: ");
//			int id=sc.nextInt();	
//			PreparedStatement pst = con.prepareStatement("insert into student values (?,?,?,?)");
//			pst.setInt(1, id);
//			pst.setString(2, name);
//			pst.setString(3, email);
//			pst.setInt(4,age);			
//			int n= pst.executeUpdate();
//			System.out.println(n+ " rows affected.");

			
			//delete operation
			System.out.println("Enter the Name: ");
			String name=sc.nextLine();
			PreparedStatement pst = con.prepareStatement("delete from student where name =?");
			pst.setString(1, name);
			int n=pst.executeUpdate();
			
			System.out.println(n+" rows affected.");
			con.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
