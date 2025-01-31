package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost://3306/lpujdbc","root","Ya@12111975");
		PreparedStatement psmt = con.prepareStatement("update employee set name=? where id = ?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = 
	}

}
