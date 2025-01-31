package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectOrNotSelect {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpujdbc","root","Ya@12111975");
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your query: ");
		String query = sc.nextLine();
		if(st.execute(query)) {
			ResultSet rs = st.getResultSet();
			while(rs.next()) {
				System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Age : "+rs.getInt(3)+" Salary : "+ rs.getInt(4));
			}
			rs.close();
		}
		else {
			int n = st.getUpdateCount();
			System.out.println(n+ " no of records are affected in Employee table");
		}
		sc.close();
		st.close();
		con.close();
	}

}
