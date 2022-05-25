package jdbc;
import java.sql.*;
public class JDBCMain {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mysql_work_shop";
			String uname="hbstudent";
			String pass="hbstudent";	
			Connection con = DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Success");
			
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "
			          +rs.getString(3)+" | "+rs.getInt(4));
			}
			
			con.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
