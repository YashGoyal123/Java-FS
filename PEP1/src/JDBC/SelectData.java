package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpujdbc","root","Ya@12111975");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from employee");
		while(rs.next()) {
			System.out.println("Id : " + rs.getInt(1)+", Name : "+rs.getString(2)+", Age : "+rs.getInt(3)+", Salary : "+rs.getInt(4));
		}
		rs.close();
		con.close();
		// TODO Auto-generated method stub

	}

}
